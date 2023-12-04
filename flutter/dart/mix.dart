void main(List<String> args) {}

// similar to inheritance but it doesn't establish the parent child relationship
mixin Jump {
  int jumping = 10; // inch
}

mixin Scream {
  bool isScreaming = false;
}

class Animal with Jump, Scream {
  void fn() {
    print(jumping);
    print(isScreaming);
  }
}

class Cat extends Animal {
  void func() {
    print(jumping);
  }
}
