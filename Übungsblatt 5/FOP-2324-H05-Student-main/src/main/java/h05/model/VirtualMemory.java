package h05.model;

public class VirtualMemory implements Memory{
    private double costPerGigaByte;
    private char capacity;

    public VirtualMemory(double costPerGigaByte){
        this.costPerGigaByte = costPerGigaByte;
    }
    @Override
    public double getPrice() {
        double price = 0;

        int capacityAsInt = this.capacity - '0';
        price = capacityAsInt * costPerGigaByte;

        return price;
    }

    public void setCapacity(char capacity){
        this.capacity = capacity;
    }

    @Override
    public char getCapacity() {
        return this.capacity;
    }
}
