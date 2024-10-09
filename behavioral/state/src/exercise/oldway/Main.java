package exercise.oldway;

public class Main {
    public static void main(String[] args) {

        DirectionService directionService  = new DirectionService();

        directionService.setTravelMode(TravelMode.DRIVING);

        System.out.println(directionService.getEta());
    }
}
