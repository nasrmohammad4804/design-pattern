package exercise.state;

public class DrivingTravel implements Travel{
    @Override
    public int getETA() {
        System.out.print("calculate ETA for driving");
        return 1;
    }

    @Override
    public String[] getDirections() {
        return new String[] {"A","X","D","C"};
    }
}
