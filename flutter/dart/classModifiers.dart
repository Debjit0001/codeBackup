void main(List<String> args) {
  Animal animal = Cat();
  // sealed classes are implicitly abstract; we can't instanciate them
  // also, sealed classes cannot be implemented or extended outside the same library

  // we have to match all the direct sub types
  switch (animal) {
    case Dog():
      print('dog');
    case Human():
      print('human');
    case Cat():
      print('cat');
  }

  // final classes are the same in the accessiblity catetgory,
  // but we can instatiate them; also like in the above case, we don't have to match all the cases
  final anim = Animal1();

  switch (anim) {}

  // now base classes can be extended but not implemented
  // and the class extending it should be BASE, FINAL or, SEALED {this is also the case for final classes}
  // ignore: unused_local_variable
  Animal2 animal2 = new Monkey();
  // important thing to note: whenever base class' child is instantiated, the base class constructor is also called

  // the interface class is opposite of the base class, it can be implemented but not extended
  Animal3();
  // it can be instantiated
}

// #1: sealed
sealed class Animal {}

class Human implements Animal {}

class Dog implements Animal {}

class Cat extends Animal {}

// #2 final
final class Animal1 {}

// #3 base
base class Animal2 {}

// #4 final
final class Monkey extends Animal2 {}

// #5 interface
interface class Animal3 {}

// to create true, proper interfaces that cannot be instantiated:
abstract interface class Animal4 {}

// #6 mixin
mixin class Animal5 {}
// a mixin as well as a class, we need it to use 'with' classes