import 'dart:io';

void main(List<String> args) {
  print("Enter your name:");
  var name = stdin.readLineSync();

  print('Enter your age:');
  String? age = stdin
      .readLineSync(); // we can't use 'String' because it's not nullable type

  print("hello $name!");
  print('You are $age years old');

  // inputting other datatypes
  int age_int = int.parse(age ?? '0'); // as input is nullable, so we are saying if it's null then age is just 0
  // or,
  age_int = int.parse(age!);

  print(age_int + 10);
}
