import 'package:flutter/material.dart';
import '../src/theme.dart';

class SummaryCard extends StatelessWidget {
  final String title;
  final String amount;
  final String subtitle;

  const SummaryCard({super.key, required this.title, required this.amount, this.subtitle = ''});

  @override
  Widget build(BuildContext context) {
    return Card(
      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(16)),
      child: Container(
        padding: const EdgeInsets.all(16),
        width: double.infinity,
        decoration: BoxDecoration(
          gradient: AppTheme.primaryGradient,
          borderRadius: BorderRadius.circular(16),
        ),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(title, style: Theme.of(context).textTheme.bodyMedium!.copyWith(color: Colors.white70)),
            const SizedBox(height: 8),
            Text(amount, style: Theme.of(context).textTheme.headlineMedium!.copyWith(color: Colors.white, fontWeight: FontWeight.w700)),
            if (subtitle.isNotEmpty) ...[
              const SizedBox(height: 8),
              Text(subtitle, style: Theme.of(context).textTheme.bodySmall!.copyWith(color: Colors.white70)),
            ],
          ],
        ),
      ),
    );
  }
}
