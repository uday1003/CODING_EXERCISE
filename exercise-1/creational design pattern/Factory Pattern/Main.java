public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        // Create a car and drive it
        Vehicle vehicle1 = factory.getVehicle("car");
        if (vehicle1 != null) {
            vehicle1.drive();
        }

        // Create a bike and ride it
        Vehicle vehicle2 = factory.getVehicle("bike");
        if (vehicle2 != null) {
            vehicle2.drive();
        }
    }
}
