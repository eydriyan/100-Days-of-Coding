public class Car extends Vehicle {
    
    @Override
    public void startEngine() {
        System.out.println("Car: Starting Engine!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car: Stopping Engine!");
    }
}
