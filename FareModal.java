package atekAssignDayOne;

public class FareModal {
    private String id;
    private String fare_table_id;
    private String source;
    private String destination;
    private String fare;
    //private String fareVersion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFareTableId() {
        return fare_table_id;
    }

    public void setFareTableId(String fareTableId) {
        this.fare_table_id = fareTableId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getFareVersion() {
        return fareVersion;
    }

    public void setFareVersion(String fareVersion) {
        this.fareVersion = fareVersion;
    }

    private String fareVersion;

    public FareModal(String id, String fareTableId, String source, String destination, String fare, String fareVersion) {
        this.id = id;
        this.fare_table_id = fareTableId;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
        this.fareVersion = fareVersion;
    }
}
