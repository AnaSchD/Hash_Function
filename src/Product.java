import java.util.Objects;

public class Product {

    private String name;
    private double weight;
    private double price;



    public Product(String name, double weight, double price) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException( "Введи название продукта");
        }
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Напиши вес продукта");
        }
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Укажи стоимость продукта");
        }
    }


    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "В списке продуктов есть: " + getName() +
                " весом " + getWeight() +
                " и стоимостью " + getPrice() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.weight, weight) == 0 && price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, price);
    }
}
