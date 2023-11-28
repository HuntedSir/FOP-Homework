package h05.model;

public class CPUImpl extends PurchasedComponent implements CPU{
    private final Socket socket;
    private final int numOfCores;
    private final double frequency;

    public CPUImpl(Socket socket, int numOfCores, double frequency, double price){
        super(price);
        this.socket = socket;
        this.numOfCores = numOfCores;
        this.frequency = frequency;
    }
    @Override
    public Socket getSocket() {
        return this.socket;
    }

    @Override
    public int getNumberOfCores() {
        return this.numOfCores;
    }

    @Override
    public double getFrequency() {
        return this.frequency;
    }
}
