package h05.model;

public class TotalCostRater implements ComponentRater{
    private double cost;
    public TotalCostRater(){

    }
    public double getTotalPrice(){
        return this.cost;
    }
    @Override
    public void consumeMainboard(Mainboard mainboard) {
        this.cost = this.cost + mainboard.getPrice();
    }

    @Override
    public void consumeCPU(CPU cpu) {
        this.cost = this.cost + cpu.getPrice();
    }

    @Override
    public void consumeMemory(Memory memory) {
        this.cost = this.cost + memory.getPrice();
    }

    @Override
    public void consumePeripheral(Peripheral peripheral) {
        this.cost = this.cost + peripheral.getPrice();
    }
}
