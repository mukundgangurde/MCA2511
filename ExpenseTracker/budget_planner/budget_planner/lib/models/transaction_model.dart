import 'package:cloud_firestore/cloud_firestore.dart';

class TransactionModel {
  final String id;
  final String title;
  final double amount;
  final DateTime date;
  final String categoryId;

  TransactionModel({required this.id, required this.title, required this.amount, required this.date, required this.categoryId});

  Map<String, dynamic> toMap() => {
        'title': title,
        'amount': amount,
        'date': date.toIso8601String(),
        'categoryId': categoryId,
      };

  factory TransactionModel.fromMap(String id, Map<String, dynamic> map) => TransactionModel(
        id: id,
        title: map['title'] as String,
        amount: (map['amount'] as num).toDouble(),
        date: DateTime.parse(map['date'] as String),
        categoryId: map['categoryId'] as String,
      );

  factory TransactionModel.fromSnapshot(DocumentSnapshot snap) {
    final data = snap.data() as Map<String, dynamic>;
    return TransactionModel.fromMap(snap.id, data);
  }
}
