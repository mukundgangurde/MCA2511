import 'package:flutter/material.dart';
import '../models/transaction_model.dart';
import 'package:uuid/uuid.dart';

class AddTransactionScreen extends StatefulWidget {
  const AddTransactionScreen({super.key});

  @override
  State<AddTransactionScreen> createState() => _AddTransactionScreenState();
}

class _AddTransactionScreenState extends State<AddTransactionScreen> {
  final titleController = TextEditingController();
  final amountController = TextEditingController();

  String category = "Other";
  bool isIncome = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Add Transaction")),
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
          children: [
            TextField(
              controller: titleController,
              decoration: const InputDecoration(labelText: "Title"),
            ),

            TextField(
              controller: amountController,
              decoration: const InputDecoration(labelText: "Amount"),
              keyboardType: TextInputType.number,
            ),

            const SizedBox(height: 10),

            DropdownButtonFormField(
              value: category,
              items: ["Food", "Shopping", "Bills", "Other"]
                  .map((e) => DropdownMenuItem(value: e, child: Text(e)))
                  .toList(),
              onChanged: (value) {
                category = value!;
              },
              decoration: const InputDecoration(labelText: "Category"),
            ),

            const SizedBox(height: 10),

            Row(
              children: [
                const Text("Is Income?"),
                Switch(
                  value: isIncome,
                  onChanged: (val) {
                    setState(() => isIncome = val);
                  },
                ),
              ],
            ),

            const SizedBox(height: 20),

            ElevatedButton(
              onPressed: () {
                final newTransaction = TransactionModel(
                  id: Uuid().v4(),
                  title: titleController.text,
                  amount: double.tryParse(amountController.text) ?? 0,
                  category: category,
                  isIncome: isIncome,
                  date: DateTime.now(),
                );

                Navigator.pop(context, newTransaction);
              },
              child: const Text("Add Transaction"),
            )
          ],
        ),
      ),
    );
  }
}
