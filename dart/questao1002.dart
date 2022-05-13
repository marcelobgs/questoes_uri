import 'dart:io';

void main() {
  const pi = 3.14159;
  double a = double.parse(stdin.readLineSync()!);
  print('A=${(pi * a * a).toStringAsFixed(4)}');
}
