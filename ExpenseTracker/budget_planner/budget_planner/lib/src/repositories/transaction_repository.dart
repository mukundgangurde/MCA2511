import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:hive_flutter/hive_flutter.dart';
import '../../models/transaction_model.dart';

class TransactionRepository {
  final FirebaseFirestore _firestore;
  final Box _box;

  TransactionRepository(this._firestore, this._box);

  Future<TransactionModel> add(TransactionModel t) async {
    final docRef = await _firestore.collection('transactions').add(t.toMap());
    final created = TransactionModel(id: docRef.id, title: t.title, amount: t.amount, date: t.date, categoryId: t.categoryId);
    await _box.put(created.id, created.toMap());
    return created;
  }

  Future<List<TransactionModel>> fetchAll() async {
    final query = await _firestore.collection('transactions').orderBy('date', descending: true).get();
    return query.docs.map((d) => TransactionModel.fromSnapshot(d)).toList();
  }
}