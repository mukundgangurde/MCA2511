import 'package:flutter/material.dart';
import 'package:flutter_riverpod/flutter_riverpod.dart';

import '../widgets/summary_card.dart';
import '../widgets/category_circle.dart';
import '../services/voice_service.dart';
import '../src/providers/transaction_provider.dart';
import '../src/utils/voice_parser.dart';
import 'add_transaction_screen.dart';

class HomeScreen extends ConsumerWidget {
  const HomeScreen({super.key});

  // Sample data for now
  static const double totalSavings = 7456.00;
  static const double todaySpending = 180.75;

  @override
  Widget build(BuildContext context, WidgetRef ref) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Today'),
        actions: [
          IconButton(onPressed: () {}, icon: const Icon(Icons.calendar_today)),
        ],
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () async {
          final messenger = ScaffoldMessenger.of(context);
          final result = await showModalBottomSheet<String?>(context: context, builder: (_) => _VoiceAddSheet());
          if (result != null && result.isNotEmpty) {
            // parse result and open add transaction screen prefilled
            final parsed = VoiceParser.parse(result);
            final title = parsed['title'] as String?;
            final amount = parsed['amount'] as double?;
            final category = parsed['category'] as String?;
            final created = await Navigator.of(context).push(TransactionRoute(title: title, amount: amount, category: category));
            if (created != null) {
              ScaffoldMessenger.of(context).showSnackBar(const SnackBar(content: Text('Transaction added')));
            } else {
              ScaffoldMessenger.of(context).showSnackBar(SnackBar(content: Text('Heard: $result')));
            }
          }
        },
        child: const Icon(Icons.mic),
      ),
      body: SingleChildScrollView(
        padding: const EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            SummaryCard(
              title: 'Total Remaining Budget',
              amount: '\$${totalSavings.toStringAsFixed(2)}',
              subtitle: 'Available for this month',
            ),
            const SizedBox(height: 16),
            Text('Today', style: Theme.of(context).textTheme.titleMedium),
            const SizedBox(height: 8),
            Card(
              shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
              child: Padding(
                padding: const EdgeInsets.all(12),
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Text('\$${todaySpending.toStringAsFixed(2)}', style: Theme.of(context).textTheme.headlineSmall),
                        const SizedBox(height: 6),
                        Text('Spent today', style: Theme.of(context).textTheme.bodySmall),
                      ],
                    ),
                    ElevatedButton(onPressed: () {}, child: const Text('Add Expense')),
                  ],
                ),
              ),
            ),
            const SizedBox(height: 16),
            Text('Top Categories', style: Theme.of(context).textTheme.titleMedium),
            const SizedBox(height: 12),
            SizedBox(
              height: 110,
              child: ListView.separated(
                scrollDirection: Axis.horizontal,
                itemCount: categories.length,
                separatorBuilder: (context, index) => const SizedBox(width: 12),
                itemBuilder: (context, index) {
                  final c = categories[index];
                  return Column(
                    mainAxisSize: MainAxisSize.min,
                    children: [
                      CategoryCircle(icon: c['icon'], label: c['label']),
                      const SizedBox(height: 6),
                      Text(c['amount'], style: Theme.of(context).textTheme.bodySmall),
                    ],
                  );
                },
              ),
            ),
            const SizedBox(height: 24),
            Text('Recent Transactions', style: Theme.of(context).textTheme.titleMedium),
            const SizedBox(height: 12),
            Builder(builder: (context) {
              final txAsync = ref.watch(transactionsFutureProvider);
              return txAsync.when(
                data: (list) => Column(children: list.take(5).map((t) => _buildTransactionFromModel(context, t)).toList()),
                loading: () => const Center(child: CircularProgressIndicator()),
                error: (e, s) => Center(child: Text('Error loading transactions')),
              );
            }),
          ],
        ),
      ),
    );
  }

  Widget _buildTransactionFromModel(BuildContext context, dynamic model) {
    return Card(
      margin: const EdgeInsets.symmetric(vertical: 6),
      child: ListTile(
        leading: const CircleAvatar(child: Icon(Icons.attach_money)),
        title: Text(model.title),
        subtitle: Text(model.date.toIso8601String()),
        trailing: Text('\$${model.amount.toStringAsFixed(2)}', style: Theme.of(context).textTheme.bodyMedium),
      ),
    );
  }



  static final List<Map<String, dynamic>> categories = [
    {'icon': Icons.home, 'label': 'House', 'amount': '\$1,200'},
    {'icon': Icons.local_taxi, 'label': 'Transport', 'amount': '\$500'},
    {'icon': Icons.shopping_bag, 'label': 'Food', 'amount': '\$680'},
    {'icon': Icons.medical_services, 'label': 'Medicine', 'amount': '\$120'},
  ];
}


class _VoiceAddSheet extends StatefulWidget {
  @override
  State<_VoiceAddSheet> createState() => _VoiceAddSheetState();
}

class _VoiceAddSheetState extends State<_VoiceAddSheet> {
  final _voice = VoiceService();
  String _last = '';
  bool _listening = false;

  @override
  void initState() {
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return SizedBox(
      height: 220,
      child: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            Text('Voice Add', style: Theme.of(context).textTheme.titleMedium),
            const SizedBox(height: 12),
            ElevatedButton.icon(
              onPressed: _startListening,
              icon: Icon(_listening ? Icons.mic : Icons.mic_none),
              label: Text(_listening ? 'Listening...' : 'Tap to speak (5s)'),
            ),
            const SizedBox(height: 12),
            Text('Result: $_last'),
            const SizedBox(height: 12),
            Row(
              mainAxisAlignment: MainAxisAlignment.end,
              children: [
                TextButton(onPressed: () => Navigator.of(context).pop(), child: const Text('Cancel')),
                const SizedBox(width: 8),
                ElevatedButton(onPressed: () => Navigator.of(context).pop(_last), child: const Text('Confirm')),
      ],
    ),
  ],
),
); 
  }

}

// Helper route to open AddTransactionScreen and return created transaction
class TransactionRoute extends MaterialPageRoute {
  TransactionRoute({String? title, double? amount, String? category}) : super(builder: (context) => AddTransactionScreen(initialTitle: title, initialAmount: amount, initialCategory: category));
}


