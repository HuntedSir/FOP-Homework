package h05.model;

public interface CPU extends Component{
    Socket getSocket();
    int getNumberOfCores();
    double getFrequency();
}
