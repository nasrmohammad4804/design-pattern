package exercise.state;

public class WalkingTravel implements Travel{
    @Override
    public int getETA() {
        System.out.print("calculate ETA for walking");
        return 4;
    }

    @Override
    public String[] getDirections() {
        return new String[] {"A","C"};

    }
}
