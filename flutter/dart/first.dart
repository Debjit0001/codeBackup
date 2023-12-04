void main(List<String> args) {
  print(1 * 2 - 3 + 5);

  int num = 4;
  print(num.isFinite);

  String name = 'Paromita';

  // name = name + " Dey"; is not recommended in dart, instead we use interpolation:

  name = "${name} Dey"; // or, "$name Dey"
  print(name);

  // to print normal $
  print('price: \$12');

  var num1 = 21;
  final num2 = DateTime.now();  // runtime constant
  const String num3 = '10001';  // compiletime constant

  print(num1);
  print(num2);
  print(num3);
}
