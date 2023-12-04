void main(List<String> args) {
  // if statements

  int age = 13;

  if (age >= 18) {
    print('adult');
  } else if (age >= 12 && age < 18) {
    print('teenager');
  } else {
    print('child');
  }

  // ternary

  String greeting = 'Hi!';
  print(greeting.startsWith('H') ? 'wow' : 'nah');

  // switch statement

  bool isGood = true;

  switch (greeting) {
    case 'Hi!' when isGood:
      print('yes');
      break;
    default:
      print('Yoooo');
  }
}
