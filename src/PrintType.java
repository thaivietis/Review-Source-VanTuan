public class PrintType {

    public void print(Vehicle vehicle) {
        if (vehicle instanceof Bicycle) {
            System.out.println("This is a bicycle");
        } else if (vehicle instanceof Car) {
            System.out.println("This is a car");
        } else {
            System.out.println("This is a type of vehicle used for moving");
        }
    }
}
