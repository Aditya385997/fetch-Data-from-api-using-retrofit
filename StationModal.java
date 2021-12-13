package atekAssignDayOne;

public class StationModal {
    private String id;
    private String station_name;
    private String station_name_marathi;
    private String station_code;
    private String time_stamp;

    public StationModal(String id, String station_name, String station_name_marathi, String station_code, String time_stamp) {
        this.id = id;
        this.station_name = station_name;
        this.station_name_marathi = station_name_marathi;
        this.station_code = station_code;
        this.time_stamp = time_stamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getStation_name_marathi() {
        return station_name_marathi;
    }

    public void setStation_name_marathi(String station_name_marathi) {
        this.station_name_marathi = station_name_marathi;
    }

    public String getStation_code() {
        return station_code;
    }

    public void setStation_code(String station_code) {
        this.station_code = station_code;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }
}
