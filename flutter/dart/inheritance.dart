void main(List<String> args) {
  Car car = Car();

  car.printSomething();

  Vehicle truck = Truck();
  print(truck.isEngineStarted);
  // print(truck.noOfWheels);  // won't work because Vehicle class didn't have that data
  print((truck as Truck).noOfWheels); // now it will
}

class Vehicle {
  int speed = 10;
  bool isEngineStarted = false;

  void accelerate() {
    this.speed += 10;
  }
}

class Car extends Vehicle {
  int noOfWheels = 4;

  void printSomething() {
    print(noOfWheels);
  }
}

class Truck extends Vehicle {
  int noOfWheels = 8;

  void printSomething() {
    print(noOfWheels);
  }
}

// concept of abstract class and implements

abstract class SomeClass {
  // doesn't matter if we provide any body to it, because we'd have to redefine it while implementing
  void printSomeValue() {
    print('some value');
  }

  // but in dart we can also extend an abstract class, then we won't have to redefine the components of that class
}

class Bike implements Vehicle, SomeClass {
  @override
  int speed = 50;

  @override
  bool isEngineStarted = true;

  @override
  void accelerate() {
    this.speed += 20;
  }

  @override
  void printSomeValue() {
    print('value'); 
  }
}
