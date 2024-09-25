public abstract class Vehicle {
    private String name;
    private String brand;
    private int numberOfWheel;

    public Vehicle(){
        this.name = "";
        this.brand = "";
        this.numberOfWheel = 0;
    };

    void formatDate() {
        // format to DD/MM/YYYY
    }

    void connectToDatabase() {
        // connect to database
    }
}
