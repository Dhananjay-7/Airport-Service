package AirportService;

import java.util.HashMap;
import java.util.Map;

public class RunwayService {
    private Map<String, Runway> runways = new HashMap<String, Runway>();

    public void addRunway(String id) {
        runways.put(id, new Runway(id));
    }

    public Runway allocateRunway() {
        for (Runway runway : runways.values()) {
            if (!runway.isInUse()) {
                runway.occupy();
                return runway;
            }
        }
        return null; // No free runway available
    }

    public void releaseRunway(String id) {
        if (runways.containsKey(id)) {
            runways.get(id).release();
        }
    }
    
     
}
