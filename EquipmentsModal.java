package atekAssignDayOne;

public class EquipmentsModal {
    private String ridlr_id;
    private String equipment_id;
    private String line_id;
    private String eq_working_mode_id;
    private String ip_address;
    private String description = null;
    private String company_id;
    private String eq_type_id;
    private String end_date = null;
    private String status;
    private String endpointKeyHash;
    private String kaa_station_name = null;
    private String gateId;
    private String gateDirection;
    private String hostName = null;
    private String primarySSID;
    private String primarySSIDPassword;
    private String backupSSID = null;
    private String backupSSIDPassword = null;
    private String gateway;
    private String subnet_mask;
    private String station_id;
    private String cchs_reference = null;
    private String cchs_station_id = null;
    private String coord_x = null;
    private String coord_y = null;

    public EquipmentsModal(String ridlr_id, String equipment_id, String line_id, String eq_working_mode_id, String ip_address, String description, String company_id, String eq_type_id, String end_date, String status, String endpointKeyHash, String kaa_station_name, String gateId, String gateDirection, String hostName, String primarySSID, String primarySSIDPassword, String backupSSID, String backupSSIDPassword, String gateway, String subnet_mask, String station_id, String cchs_reference, String cchs_station_id, String coord_x, String coord_y) {
        this.ridlr_id = ridlr_id;
        this.equipment_id = equipment_id;
        this.line_id = line_id;
        this.eq_working_mode_id = eq_working_mode_id;
        this.ip_address = ip_address;
        this.description = description;
        this.company_id = company_id;
        this.eq_type_id = eq_type_id;
        this.end_date = end_date;
        this.status = status;
        this.endpointKeyHash = endpointKeyHash;
        this.kaa_station_name = kaa_station_name;
        this.gateId = gateId;
        this.gateDirection = gateDirection;
        this.hostName = hostName;
        this.primarySSID = primarySSID;
        this.primarySSIDPassword = primarySSIDPassword;
        this.backupSSID = backupSSID;
        this.backupSSIDPassword = backupSSIDPassword;
        this.gateway = gateway;
        this.subnet_mask = subnet_mask;
        this.station_id = station_id;
        this.cchs_reference = cchs_reference;
        this.cchs_station_id = cchs_station_id;
        this.coord_x = coord_x;
        this.coord_y = coord_y;
    }

    public String getRidlr_id() {
        return ridlr_id;
    }

    public void setRidlr_id(String ridlr_id) {
        this.ridlr_id = ridlr_id;
    }

    public String getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(String equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getLine_id() {
        return line_id;
    }

    public void setLine_id(String line_id) {
        this.line_id = line_id;
    }

    public String getEq_working_mode_id() {
        return eq_working_mode_id;
    }

    public void setEq_working_mode_id(String eq_working_mode_id) {
        this.eq_working_mode_id = eq_working_mode_id;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getEq_type_id() {
        return eq_type_id;
    }

    public void setEq_type_id(String eq_type_id) {
        this.eq_type_id = eq_type_id;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEndpointKeyHash() {
        return endpointKeyHash;
    }

    public void setEndpointKeyHash(String endpointKeyHash) {
        this.endpointKeyHash = endpointKeyHash;
    }

    public String getKaa_station_name() {
        return kaa_station_name;
    }

    public void setKaa_station_name(String kaa_station_name) {
        this.kaa_station_name = kaa_station_name;
    }

    public String getGateId() {
        return gateId;
    }

    public void setGateId(String gateId) {
        this.gateId = gateId;
    }

    public String getGateDirection() {
        return gateDirection;
    }

    public void setGateDirection(String gateDirection) {
        this.gateDirection = gateDirection;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getPrimarySSID() {
        return primarySSID;
    }

    public void setPrimarySSID(String primarySSID) {
        this.primarySSID = primarySSID;
    }

    public String getPrimarySSIDPassword() {
        return primarySSIDPassword;
    }

    public void setPrimarySSIDPassword(String primarySSIDPassword) {
        this.primarySSIDPassword = primarySSIDPassword;
    }

    public String getBackupSSID() {
        return backupSSID;
    }

    public void setBackupSSID(String backupSSID) {
        this.backupSSID = backupSSID;
    }

    public String getBackupSSIDPassword() {
        return backupSSIDPassword;
    }

    public void setBackupSSIDPassword(String backupSSIDPassword) {
        this.backupSSIDPassword = backupSSIDPassword;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getSubnet_mask() {
        return subnet_mask;
    }

    public void setSubnet_mask(String subnet_mask) {
        this.subnet_mask = subnet_mask;
    }

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public String getCchs_reference() {
        return cchs_reference;
    }

    public void setCchs_reference(String cchs_reference) {
        this.cchs_reference = cchs_reference;
    }

    public String getCchs_station_id() {
        return cchs_station_id;
    }

    public void setCchs_station_id(String cchs_station_id) {
        this.cchs_station_id = cchs_station_id;
    }

    public String getCoord_x() {
        return coord_x;
    }

    public void setCoord_x(String coord_x) {
        this.coord_x = coord_x;
    }

    public String getCoord_y() {
        return coord_y;
    }

    public void setCoord_y(String coord_y) {
        this.coord_y = coord_y;
    }
}

