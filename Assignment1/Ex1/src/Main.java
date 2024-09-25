import java.util.ArrayList;
import java.util.List;
/*Single, Liskov, Interface, DI, */
public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicle = new ArrayList<>();

        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        vehicle.add(car);
        vehicle.add(bicycle);

        PrintType printType = new PrintType();

        printType.print(car);
        printType.print(bicycle);

    }
}
