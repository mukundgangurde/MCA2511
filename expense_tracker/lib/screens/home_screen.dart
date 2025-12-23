import 'package:flutter/material.dart';
import '../models/transaction_model.dart';
import '../widgets/transaction_tile.dart';
import 'add_transaction_screen.dart';
import 'transactions_screen.dart';
import 'settings_screen.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({super.key});

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> {
  List<TransactionModel> transactions = [];

  double get totalBalance {
    double sum = 0;
    for (var t in transactions) {
      sum += t.isIncome ? t.amount : -t.amount;
    }
    return sum;
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Dashboard"),
        actions: [
          IconButton(
            icon: const Icon(Icons.settings),
            onPressed: () {
              Navigator.push(
                context,
                MaterialPageRoute(builder: (_) => const SettingsScreen()),
              );
            },
          ),
        ],
      ),

      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
          children: [
            // Summary Card
            Container(
              padding: const EdgeInsets.all(20),
              decoration: BoxDecoration(
                color: Colors.indigo.shade50,
                borderRadius: BorderRadius.circular(12),
              ),
              child: Column(
                children: [
                  const Text("Total Balance", style: TextStyle(fontSize: 18)),
                  const SizedBox(height: 10),
                  Text(
                    "₹${totalBalance.toStringAsFixed(2)}",
                    style: const TextStyle(
                        fontSize: 28, fontWeight: FontWeight.bold),
                  ),
                ],
              ),
            ),

            const SizedBox(height: 20),

            // Recent Transactions
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                const Text("Recent Transactions",
                    style:
                        TextStyle(fontSize: 18, fontWeight: FontWeight.w600)),
                TextButton(
                  child: const Text("View All"),
                  onPressed: () {
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                        builder: (_) =>
                            TransactionsScreen(transactions: transactions),
                      ),
                    );
                  },
                )
              ],
            ),

            Expanded(
              child: transactions.isEmpty
                  ? const Center(child: Text("No Transactions Yet"))
                  : ListView(
                      children: transactions
                          .take(5)
                          .map((t) => TransactionTile(transaction: t))
                          .toList(),
                    ),
            )
          ],
        ),
      ),

      floatingActionButton: FloatingActionButton(
        child: const Icon(Icons.add),
        onPressed: () async {
          final newTransaction = await Navigator.push(
            context,
            MaterialPageRoute(builder: (_) => const AddTransactionScreen()),
          );

          if (newTransaction != null) {
            setState(() {
              transactions.add(newTransaction);
            });
          }
        },
      ),
    );
  }
}
