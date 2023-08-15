public class Main {
    // we should not use interfaces in performence oriented code, as it happens during runtime
    public static void main(String[] args) {
////        Car car = new Car();
//
////        what to access will be specified by this
////            |
////            v
//        Engine car = new Car();
////                      ^
////                      |
////                     and which version to access will be specified by this (type of object)
//
////        car.brake(); // as an engine type ref var can't access anything that is not present in Engine
//        car.acc();
//        car.start();
//        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine(new ElectricEngine());
        car.start();
    }
}