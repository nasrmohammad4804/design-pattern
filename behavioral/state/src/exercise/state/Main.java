package exercise.state;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        DirectionService directionService = new DirectionService();

        directionService.setTravel(new WalkingTravel());

        System.out.println(" takes : "+directionService.getEta());
        System.out.println("points of the path that must be traveled : "+ Arrays.toString(directionService.getDirections()));
    }
}
