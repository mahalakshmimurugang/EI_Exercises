package state;

public class GreenLight implements State {
    @Override
    public void change(TrafficLight trafficLight){
        System.out.println("GreenLight!! Go");
        trafficLight.setState(new RedLight());
    }
    
}
