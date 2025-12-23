class VoiceParser {
  /// Very small heuristic parser: finds first number as amount and text after 'for' as category/title.
  static Map<String, dynamic> parse(String input) {
    final lower = input.toLowerCase();
    final amountRegex = RegExp(r'(\d+[\.,]?\d{0,2})');
    final m = amountRegex.firstMatch(lower);
    double? amount;
    if (m != null) {
      final raw = m.group(0)!.replaceAll(',', '.');
      amount = double.tryParse(raw);
    }

    String? title;
    String? category;

    // try 'for X' -> category/title
    final forSplit = lower.split(' for ');
    if (forSplit.length > 1) {
      final tail = forSplit.last.trim();
      // if contains 'on' or 'at', strip
      title = tail.split(' on ').first.split(' at ').first.trim();
      category = title.split(' ').first.capitalize();
    } else {
      title = lower;
    }

    return {'title': title ?? '', 'amount': amount, 'category': category};
  }
}

extension _Cap on String {
  String capitalize() => isEmpty ? this : this[0].toUpperCase() + substring(1);
}
