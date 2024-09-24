public class Car extends Vehicle{

    private String engine;

    public Car(String engine) {
        super();
        this.engine = "";
    }

    public Car(String name, String brand, int numberOfWheel, String engine) {
        super(name, brand, numberOfWheel);
        this.engine = engine;
    }


    @Override
    public void run() {
        System.out.println("The car is running...");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped !");
    }

    public void refuel() {
        System.out.println("The car has been fully refueled");
    }
}
