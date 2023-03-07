import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();
        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();
        System.out.println("-".repeat(30));

        inFlight(flier);
        System.out.println("-".repeat(30));

        inFlight(new Jet());
        System.out.println("-".repeat(30));

        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);

        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        System.out.println("-".repeat(40));

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);
        System.out.println("-".repeat(40));

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);
        System.out.println("-".repeat(40));
    }

    private static void inFlight(FlightEnabled flier) {

        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    public static void triggerFliers(List<FlightEnabled> fliers) {
        for(var flier : fliers) {
            flier.takeOff();
        }
    }

    public static void flyFliers(List<FlightEnabled> fliers) {
        for(var flier : fliers) {
            flier.fly();
        }
    }

    public static void landFliers(List<FlightEnabled> fliers) {
        for(var flier : fliers) {
            flier.land();
        }
    }
}