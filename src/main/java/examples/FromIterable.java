package examples;

public class FromIterable {
    private final String product;
    private final int quantity;
    private final double price;

    public FromIterable(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

}
