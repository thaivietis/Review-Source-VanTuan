public class Bicycle extends Vehicle{
    @Override
    public void run() {
        System.out.println("The bicycle is running...");
    }

    @Override
    public void stop() {
        System.out.println("The bicycle has stopped !");
    }

    public void refuel(){
        throw new UnsupportedOperationException("Không thể thực thi phương thức");
    }
}
