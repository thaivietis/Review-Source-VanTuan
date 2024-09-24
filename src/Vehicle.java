public abstract class Vehicle {

    private String name;
    private String brand;
    private int numberOfWheel;

    public Vehicle(){
        this.name = "";
        this.brand = "";
        this.numberOfWheel = 0;
    };

    public Vehicle(String name, String brand, int numberOfWheel) {
        this.name = name;
        this.brand = brand;
        this.numberOfWheel = numberOfWheel;
    }

    abstract void run();

    abstract void stop();

    public void refuel(){
        System.out.println("The car has been fully refueled");
    }
}
