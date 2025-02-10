package AirportService;

import java.util.ArrayList;
import java.util.List;

public class LuggageService {
    private List<Luggage> luggages = new ArrayList<>();

    public void addLuggage(Luggage luggage) {
        luggages.add(luggage);
    }

    public void processLuggage() {
        for (Luggage luggage : luggages) {
            System.out.println("Processing luggage: " + luggage);
        }
    }
}
