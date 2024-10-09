package exercise.state;

public class BicyclingTravel implements Travel{

    @Override
    public int getETA() {
        System.out.print("calculate ETA for bicycle");
        return 2;
    }

    @Override
    public String[] getDirections() {
        return new String[] {"A","B","C"};
    }
}
