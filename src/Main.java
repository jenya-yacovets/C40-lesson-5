public class Main {
    public static void main(String[] args) {

        Engine engine1 = new Engine(350);
        Engine engine2 = new Engine(180);

        Car car = new Car("BMW", 15000, engine2);

        car.start();
        System.out.println();
        car.stop();
    }
}