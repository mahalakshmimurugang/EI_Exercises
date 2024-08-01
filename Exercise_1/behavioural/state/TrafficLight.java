package state;

public class TrafficLight{
    private State state;
    public TrafficLight(){
        state = new RedLight();
    }
    public void change(){
        state.change(this);
    }
    public void setState(State state){
        this.state = state;
    }
}