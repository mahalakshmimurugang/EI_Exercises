package state;

public class RedLight implements State {
    @Override
    public void change(TrafficLight trafficLight){
        System.out.println("RedLight!! stop");
        trafficLight.setState(new GreenLight());
    }
}
