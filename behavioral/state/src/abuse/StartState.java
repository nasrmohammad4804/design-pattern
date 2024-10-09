package abuse;

public class StartState implements State{

    private AbuseStopWatch stopWatch;

    public StartState(AbuseStopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        System.out.println("stopped !!!");
        stopWatch.setState(new StopState(stopWatch));
    }
}
