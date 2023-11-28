package h05.model;

public class PeripheralImpl extends PurchasedComponent implements Peripheral{
    private final PeripheralType peripheralType;
    public PeripheralImpl(PeripheralType peripheralType, int price){
        super(price);
        this.peripheralType = peripheralType;
    }

    @Override
    public PeripheralType getPeripheralType() {
        return this.peripheralType;
    }
}
