public abstract class Vehicle {

    private String name;
    private String brand;
    private int numberOfWheel;

    public Vehicle(){
        this.name = "";
        this.brand = "";
        this.numberOfWheel = 0;
    };

    public void refuel(){
        System.out.println("The vehicle has been fully refueled");
    }

    void formatDate() {
        // format to DD/MM/YYYY
    }

    void connectToDatabase() {
        // connect to database
    }
}
