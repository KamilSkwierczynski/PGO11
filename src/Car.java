public class Car implements Comparable<Car> {
    String name;
    int productionYear;

    public Car(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.productionYear, o.productionYear);
    }
}