package AirportService;

import java.util.ArrayList;
import java.util.List;

public class LuggageNotificationService {
    private List<LuggageObserver> observers = new ArrayList<>();

    public void addObserver(LuggageObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(Luggage luggage) {
        for (LuggageObserver observer : observers) {
            observer.onLuggageArrived(luggage);
        }
    }
}


