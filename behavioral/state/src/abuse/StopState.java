package abuse;

public class StopState implements State{

    private AbuseStopWatch stopWatch;

    public StopState(AbuseStopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }


    @Override
    public void click() {
        System.out.println("started !!!");
        stopWatch.setState(new StartState(stopWatch));

    }
}
