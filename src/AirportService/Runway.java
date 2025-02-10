package AirportService;

public class Runway {
    private String Id;
    private boolean inUse;

    public Runway(String Id) {
        this.Id = Id;
        this.inUse = inUse;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public void occupy() { this.inUse = true; }
    public void release() { this.inUse = false; }
    


}
