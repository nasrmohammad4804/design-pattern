package abuse;

public class AbuseStopWatch {


    private State state = new StopState(this);

    public void click(){
        state.click();
    }

    public void setState(State state) {
        this.state = state;
    }
}
