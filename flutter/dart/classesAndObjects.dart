// ignore_for_file: unused_field

void main(List<String> args) {
  Cookie cookie = Cookie('circle', 14.3);
  print(cookie.shape);

  final cookieee = Cookie.x(shape: 'rect', size: 11.5);
  print(cookieee.shape);

  // calling getter and setters:
  print(cookieee.height); // will show error if getter is not present
  cookieee.setHeight = 15;
  print(cookieee.height);

  print(StaticStuff.greeting);
  StaticStuff.printSomething();
}

class Cookie {
  String shape;
  double size;
  // as the variables are mutable, the class is also known as a mutable class

  // Cookie(this.shape, this.size); one way to do it

  // parameterized constructor: used like the way in java
  Cookie(this.shape, this.size) {
    print('Cookie constructor called');
    bake();
  }

  // named constructor
  Cookie.x({required this.shape, required this.size});

  void bake() {
    print('baking has started.');
  }

  bool isCooled() {
    return false;
  }

  // Private variables: done by using '_' in the beginning
  //private for this file
  int _height = 5;
  int _width = 6;

  // getter
  int get height => _height;

  // setter
  set setHeight(int h) {
    _height = h;
  }
}

class StaticStuff {
  // static variable
  static String greeting = 'Hello, how are you? ';

  // static function
  static void printSomething() {
    print('something');
  }
}
