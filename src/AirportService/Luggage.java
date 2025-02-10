package AirportService;

public class Luggage {
    private String Id;
    private double weight;
    private String passengerId;


    public Luggage(String Id, double weight, String passengerId) {
        this.Id = Id;
        this.weight = weight;
        this.passengerId = passengerId;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    
}
