import 'package:flutter_riverpod/flutter_riverpod.dart';
import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:hive/hive.dart';
import '../repositories/transaction_repository.dart';
import '../../models/transaction_model.dart';

final firestoreProvider = Provider<FirebaseFirestore>((ref) => FirebaseFirestore.instance);

final hiveBoxProvider = Provider<Box>((ref) => Hive.box('app'));

final transactionRepositoryProvider = Provider<TransactionRepository>((ref) {
  final fs = ref.watch(firestoreProvider);
  final box = ref.watch(hiveBoxProvider);
  return TransactionRepository(fs, box);
});

final transactionsFutureProvider = FutureProvider<List<TransactionModel>>((ref) async {
  final repo = ref.watch(transactionRepositoryProvider);
  return repo.fetchAll();
});
