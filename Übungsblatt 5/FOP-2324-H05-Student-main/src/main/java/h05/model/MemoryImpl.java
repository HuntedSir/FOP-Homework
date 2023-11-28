package h05.model;

public class MemoryImpl extends PurchasedComponent implements Memory{
    private final char capacity;

    public MemoryImpl(char capacity, double price){
        super(price);
        this.capacity = capacity;
    }
    @Override
    public char getCapacity() {
        return this.capacity;
    }
}
