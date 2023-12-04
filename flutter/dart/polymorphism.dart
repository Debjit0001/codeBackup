void main(List<String> args) {
  Animal cat = Cat(); // this is also an example of ABSTRACTION

  cat.sound();
  cat = Dog();
  cat.sound();
  // objects of differents classes being treated as object of a shared super class
}

class Animal {
  void sound() {
    print('Animal making sound');
  }
}

class Cat extends Animal {
  @override
  void sound() {
    print('cat meowing');
  }
}

class Dog extends Animal {
  @override
  void sound() {
    print('dog barking');
  }
}
