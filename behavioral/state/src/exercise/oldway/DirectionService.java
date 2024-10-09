package exercise.oldway;

public class DirectionService {
    private TravelMode travelMode;

    public Object getEta() {
        if (travelMode == TravelMode.DRIVING) {
            System.out.println("Calculating ETA (driving)");
            return 1;
        }
        else if (travelMode == TravelMode.BICYCLING) {
            System.out.println("Calculating ETA (bicycling)");
            return 2;
        }
        else if (travelMode == TravelMode.TRANSIT) {
            System.out.println("Calculating ETA (transit)");
            return 3;
        }
        else {
            System.out.println("Calculating ETA (walking)");
            return 4;
        }
    }

    public String[] getDirection() {
        if (travelMode == TravelMode.DRIVING) {
            System.out.println("Calculating Direction (driving)");
            return new String[] {"A","B","C"};
        }
        else if (travelMode == TravelMode.BICYCLING) {
            System.out.println("Calculating Direction (bicycling)");
            return new String[] {"A","D","C"};
        }
        else if (travelMode == TravelMode.TRANSIT) {
            System.out.println("Calculating Direction (transit)");
            return new String[] {"A","X","Y","C"};
        }
        else {
            System.out.println("Calculating Direction (walking)");
            return new String[] {"A","C"};
        }
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
}
