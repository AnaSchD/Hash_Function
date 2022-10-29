import java.util.Objects;

public class Product {

    private String name;
    private double weight;
    private int quantity;



    public Product(String name, double weight, int quantity) {
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
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Укажи кол-во продуктов");
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "В списке продуктов есть: " + getName() +
                " весом " + getWeight() +
                " и количеством " + getQuantity() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.weight, weight) == 0 && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, quantity);
    }
}
