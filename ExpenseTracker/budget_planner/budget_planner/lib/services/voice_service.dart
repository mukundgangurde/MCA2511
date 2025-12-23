import 'package:speech_to_text/speech_to_text.dart' as stt;

class VoiceService {
  final stt.SpeechToText _stt = stt.SpeechToText();

  Future<bool> initialize() async {
    return await _stt.initialize();
  }

  Future<String> listenOnce() async {
    final available = await _stt.initialize();
    if (!available) return '';

    String result = '';
    await _stt.listen(onResult: (r) {
      result = r.recognizedWords;
    }, listenFor: const Duration(seconds: 5));

    // stop listening
    await _stt.stop();
    return result;
  }
}
