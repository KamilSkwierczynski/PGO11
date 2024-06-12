import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item(1, "Item1");
        Item i2 = new Item(2, "Item2");
        Item i3 = new Item(3, "Item3");
        Item i4 = new Item(4, "Item4");
        Item i5 = new Item(5, "Item5");

        ArrayList<Item> items = new ArrayList<>();

        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        items.add(i5);

        i1.show();
        i2.show();
        i3.show();
        i4.show();
        i5.show();

        HashMap<Integer, String> itemHashMap = new HashMap();
        for (Item o : items)
            itemHashMap.put(o.id, o.name);

        for (Map.Entry<Integer, String> entry : itemHashMap.entrySet())
            System.out.printf("%d, %s\n", entry.getKey(), entry.getValue());

        Car c1 = new Car("Car", 1911);
        Car c2 = new Car("Car", 1912);
        Car c3 = new Car("Car", 1913);
        Car c4 = new Car("Car", 2003);
        Car c5 = new Car("Car", 1993);
        Car c6 = new Car("Car", 2023);
        Car c7 = new Car("Car", 1999);
        Car c8 = new Car("Car", 2000);
        Car c9 = new Car("Car", 1997);
        Car c10 = new Car("Car", 1899);

        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);
        cars.add(c10);

        Collections.sort(cars);
        for (Car o : cars)
            System.out.printf("%s, %d\n", o.name, o.productionYear);

    }