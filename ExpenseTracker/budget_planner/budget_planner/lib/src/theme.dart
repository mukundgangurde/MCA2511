import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';

class AppTheme {
  static const Color primaryStart = Color(0xFF7B3FF2);
  static const Color primaryEnd = Color(0xFF9A4DFF);
  static const Color accent = Color(0xFF3D6CFF);
  static const Color success = Color(0xFF2ECC71);
  static const Color warning = Color(0xFFF5A623);
  static const Color error = Color(0xFFFF5A5A);
  static const Color background = Color(0xFFF5F6FA);
  static const Color cardBg = Color(0xFFFFFFFF);

  static LinearGradient get primaryGradient => const LinearGradient(
        begin: Alignment.topLeft,
        end: Alignment.bottomRight,
        colors: [primaryStart, primaryEnd],
      );

  static ThemeData themeData() {
    final colorScheme = ColorScheme.fromSeed(seedColor: primaryStart);

    return ThemeData(
      colorScheme: colorScheme,
      scaffoldBackgroundColor: background,
      useMaterial3: true,
      textTheme: GoogleFonts.interTextTheme(
        Typography.material2018().black.apply(
              bodyColor: Colors.black87,
              displayColor: Colors.black87,
            ),
      ),
      appBarTheme: AppBarTheme(
        backgroundColor: colorScheme.inversePrimary,
        elevation: 0,
        centerTitle: true,
        titleTextStyle: GoogleFonts.inter(
          fontSize: 20,
          fontWeight: FontWeight.w600,
          color: Colors.white,
        ),
      ),
      floatingActionButtonTheme: FloatingActionButtonThemeData(
        backgroundColor: colorScheme.primary,
      ),

    );
  }
}
