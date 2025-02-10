package AirportService;

public class Main {
    public static void main(String[] args) {
        
        RunwayService runwayService = new RunwayService();
        runwayService.addRunway("runway1");
        runwayService.addRunway("runway2");
        runwayService.addRunway("runway3");

        Plane plane1 = PlaneFactory.createPlane("plane1", "Boeing 747", 366);
        Plane plane2 = PlaneFactory.createPlane("plane2", "Boeing 777", 396);
        Plane plane3 = PlaneFactory.createPlane("plane3", "Boeing 787", 242);

        plane1.assignRunway(runwayService.allocateRunway().getId());
        plane2.assignRunway(runwayService.allocateRunway().getId());

        System.out.println("Allocated Runway for " + plane1);
        System.out.println("Allocated Runway for " + plane2);


        LuggageService luggageService = new LuggageService();

        Luggage luggage1 = new Luggage("L1", 25.5, "Passenger123");
        Luggage luggage2 = new Luggage("L2", 30.0, "Passenger456");

        luggageService.addLuggage(luggage1);
        luggageService.addLuggage(luggage2);

        luggageService.processLuggage();

        runwayService.releaseRunway(plane1.getRunwayId());
        runwayService.releaseRunway(plane2.getRunwayId());

        System.out.println("Released Runway for " + plane1);
        System.out.println("Released Runway for " + plane2);


    }
}
