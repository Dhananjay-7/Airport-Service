package AirportService;

import AirportService.Plane;

public class PlaneFactory {
    public static Plane createPlane(String id, String model, int capacity) {
        return new Plane(id, model, capacity);
    }
}

