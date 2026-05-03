import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Cars {
    String name;
    int model;
    int sales;

    public Cars(String name, int model, int sales) {
        this.name = name;
        this.model = model;
        this.sales = sales;
    }

    @Override
    public String toString() {
        return name + " " + model + " " + sales;
    }
}

public class test {

    public static void main(String[] args) {
        List<Cars> cars = new ArrayList<>();
        cars.add(new Cars("Toyota", 85, 200));
        cars.add(new Cars("Mitsubishi", 95, 350));
        cars.add(new Cars("Nissan", 90, 250));
        Collections.sort(cars, Comparator.comparingInt(c -> c.sales));
        System.out.print(cars);
    }
}
