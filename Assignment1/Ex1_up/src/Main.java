import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static PrintType printType;
    private static Car car;
    private static Bicycle bicycle;
    public Main(PrintType printType, Car car, Bicycle bicycle) {
        this.printType = printType;
        this.car = car;
        this.bicycle = bicycle;
    }
    public static void main(String[] args) {
        List<Vehicle> vehicle = new ArrayList<>();
        vehicle.add(car);
        vehicle.add(bicycle);

        printType.print(car);
        printType.print(bicycle);
    }
}