package abuse;

public class StopWatch {

    private boolean isStopped=true;

    public void click(){
        isStopped= !isStopped;

        if (isStopped){
            System.out.println("stopped !!!");
        }
        else {
            System.out.println("starts !!!");
        }
    }
}
