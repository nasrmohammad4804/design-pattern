package exercise.state;

public class DirectionService {

    private Travel travel;

    public int getEta(){
        return travel.getETA();
    }

    public String[] getDirections(){
        return travel.getDirections();
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }
}
