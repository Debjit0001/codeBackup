void main(List<String> args) {
  //records
  (String, int, bool) stuff = printStuff();
  print(stuff.$1);

  // or
  final (name, age, isAdult) = printStuff();
  print(name);
  print(age);
  print(isAdult);

  // named records
  final someValue = print_stuff();
  print(someValue.age);

  print_name('Paro', 19, 'hello');

  printName(
      greeting: 'Hey',
      name: 'Debjit',
      age: 19); // here the position of the arguments doesn't matter

  func(text: 'something');

  // calling function that returns a function
  final someThing = test();
  someThing();

  // or,
  () {
    print('hello wolrd');
  }();
}

//-----------------------------------------------------------------------

// returning multiple values from a function: returning RECORDS
(String, int, bool) printStuff() {
  return ("paro", 19, true);
}

// named records
({int age, String name}) print_stuff() {
  return (age: 12, name: 'Rivaan');
}

// positional arguments
void print_name(String name, int age, String greeting) {
  print('$greeting, $name \nyour age is $age');
}

// named arguments
void printName(
    {required String name, required int age, required String greeting}) {}

// passing both positional and named arguments together
void random(int age, bool isAdult, {required String name}) {}
// but we can't have positionals after named ones

// nullable arguments
void func({required String text, int? age}) {}

// arrow functions: '=>' fat arrow
void arrow() => print('Hey');
String arrow_func() => 'Supp';

// returning functions
Function test() {
  return () {
    print("hellow world");
  };
}
