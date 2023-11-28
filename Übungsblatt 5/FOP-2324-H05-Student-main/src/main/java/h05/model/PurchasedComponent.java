package h05.model;

public abstract class PurchasedComponent implements Component{
    private final double price;
    public PurchasedComponent(double price){
        this.price = price;
    }
    @Override
    public double getPrice() {
        return this.price;
    }
}
