// ignore_for_file: unused_local_variable

void main(List<String> args) {
  int? optional = null;

  String? someValue = null; // now this isn't also necessary

  String? some; // also does the same by default
  print(some);
  some = '100';
  print(some);

  // we can't have something like final? x = null, but
  final x = null;
  const y = null;
  // these are allowed, although it's not recommended to use because if it's set to null once, we can't change these to any other type later

  int? value = null;
  // print(value.isEven); // gives compiletime error

  // adding '!' means something is not null, so
  // print(value!.isEven); // won't give compile time error but instead the error will be thrown at runtime

  print('-----------');
  function();
}

int? num;

void function() {
  print(num);

  print(num?.bitLength ??
      0); // '?' checks if the variable is null and '??' is like ternery operator. So it's saying, "if num is null, print 0"

  num = 101;

  print(num?.bitLength ??
      0); // now as the num variable is not null, the bitlength function will work properly

  // print(num!.bitLength ?? 0);  // but this gives warning because '!' forcibly says num is not null, and ?? says i'll print 0 if it is null which doesn't make any sense. 
}
  