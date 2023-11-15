public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        System.out.println("");

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
