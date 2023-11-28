package h05.model;

import java.util.ArrayList;

public class ServerCenter implements Configuration{
    private ArrayList<Mainboard> mainboards = new ArrayList<Mainboard>();
    private double totalCost = 0;
    private double totalScore = 0;

    public ServerCenter(){
        for (int i = 0; i < 10000; i++) {
            addMainboard(new MainboardImpl(Socket.AM4, 2, 2, 100));
        }
    }
    public void addMainboard(Mainboard mainboard){
        mainboards.add(mainboard);
    }

    @Override
    public void rateBy(ComponentRater componentRater) {
        for (int i = 0; i < this.mainboards.size(); i++) {
            this.mainboards.get(i).rateBy(componentRater);
        }
    }
}
