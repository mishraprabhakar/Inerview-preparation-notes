package core_java.comparator_comparable;

public class Laptop implements Comparable<Laptop>{

    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop o) {
        int priceComparison = Integer.compare(this.getPrice(), o.getPrice());

        // If prices are equal, compare based on brand name
        if (priceComparison == 0) {
            return this.getBrand().compareTo(o.getBrand());
        }

        return priceComparison;
    }
}
