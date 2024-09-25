public class Bicycle extends Vehicle implements Action{
    @Override
    public void run() {
        System.out.println("The bicycle is running...");
    }

    @Override
    public void stop() {
        System.out.println("The bicycle has stopped !");
    }
}
