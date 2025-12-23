import 'package:flutter/material.dart';
import '../models/transaction_model.dart';
import '../widgets/transaction_tile.dart';

class TransactionsScreen extends StatelessWidget {
  final List<TransactionModel> transactions;

  const TransactionsScreen({super.key, required this.transactions});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("All Transactions")),
      body: transactions.isEmpty
          ? const Center(child: Text("No Transactions Found"))
          : ListView.builder(
              itemCount: transactions.length,
              itemBuilder: (_, i) => TransactionTile(transaction: transactions[i]),
            ),
    );
  }
}
