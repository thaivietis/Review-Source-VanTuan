public class Car extends Vehicle implements Action{

    private ChinaEngine engine;

    public Car() {
        super();
        this.engine = new ChinaEngine();
    }

    @Override
    public void run() {
        System.out.println("The car is running...");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped !");
    }

    @Override
    public void setTemperature() {
        System.out.println("The temperature is 90F");
    }

    public void refuel() {
        System.out.println("The car has been fully refueled");
    }
}

class ChinaEngine {
}
