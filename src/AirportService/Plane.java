package AirportService;

public class Plane {

    private String id;
    private String model;
    private int capacity;
    private String runwayId;

    public Plane(String id, String model, int capacity) {
        this.id = id;
        this.model = model;
        this.capacity = capacity;
    }

    public String getId() { return id; }
    public String getModel() { return model; }
    public int getCapacity() { return capacity; }
    public String getRunwayId() { return runwayId; }

    public void assignRunway(String runwayId) {
        this.runwayId = runwayId;
    }

    @Override
    public String toString() {
        return "Plane{" + "id='" + id + "', model='" + model + "', capacity=" + capacity + "}";
    }
    

    
}