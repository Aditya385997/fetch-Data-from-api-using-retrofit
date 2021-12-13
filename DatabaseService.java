package atekAssignDayOne;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DatabaseService {
 public void runQuery()
 {
     try
     {

         Connection con=DriverManager.getConnection(
                 "jdbc:sqlite:/home/aditya/IdeaProjects/atekassign/src/sqlite1.db");
         Statement stmt=con.createStatement();
         String CREATE_TABLE_QUERY_USERS,CREATE_TABLE_QUERY_FARES,CREATE_TABLE_QUERY_PRODUCTS,CREATE_TABLE_QUERY_STATIONS,CREATE_TABLE_QUERY_EQUIPMENTS;

         CREATE_TABLE_QUERY_USERS = "CREATE TABLE IF NOT EXISTS users"+
                 "("+
                 "USER_ID TEXT ,"+
                 "LOGIN TEXT,"+
                 "SECRET_KEY NULL,"+
                 "USERNAME TEXT,"+
                 "SURNAME TEXT,"+
                 "EMAIL TEXT,"+
                 "PHONE TEXT,"+
                 "PASSWORD TEXT,"+
                 "STATUS TEXT,"+
                 "REMEMBER_TOKEN TEXT,"+
                 "USER_GROUP_ID TEXT,"+
                 "ISTESTER TEXT,"+
                 "DESIGNATION TEXT,"+
                 "EMPLOYEE_ID TEXT,"+
                 "START_DATE TEXT,"+
                 "END_DATE NULL,"+
                 "DESCRIPTION TEXT,"+
                 "EQ_PROFILE TEXT,"+
                 "OPERATOR_ID TEXT,"+
                 "PG_ID NULL,"+
                 "CREATED_BY TEXT,"+
                 "MODIFIED_BY TEXT"+
                 ")";
         CREATE_TABLE_QUERY_FARES = "CREATE TABLE IF NOT EXISTS fares"+
                 "("+
                 "ID TEXT PRIMARY KEY,"+
                 "FARE_TABLE_ID TEXT,"+
                 "SOURCE TEXT,"+
                 "DESTINATION TEXT,"+
                 "FARE TEXT,"+
                 "FARE_VERSION NULL"+
                 ")";
         CREATE_TABLE_QUERY_EQUIPMENTS = "CREATE TABLE IF NOT EXISTS equipment"+
                 "("+
                 "RIDLR_ID TEXT,"+
                 "EQUIPMENT_ID TEXT,"+
                 "LINE_ID TEXT,"+
                 "EQ_WORKING_MODE_ID TEXT,"+
                 "IP_ADDRESS TEXT,"+
                 "DESCRIPTION NULL,"+
                 "COMPANY_ID TEXT,"+
                 "EQ_TYPE_ID TEXT,"+
                 "END_DATE NULL,"+
                 "STATUS TEXT,"+
                 "ENDPOINTKEYHASH TEXT,"+
                 "KAA_STATION_NAME NULL,"+
                 "GATEID TEXT,"+
                 "GATEDIRECTION TEXT,"+
                 "HOSTNAME NULL,"+
                 "PRIMARY_SSID TEXT,"+
                 "PRIMARY_SSID_PASSWORD TEXT,"+
                 "BACKUP_SSID NULL,"+
                 "BACKUP_SSID_PASSWORD NULL,"+
                 "GATEWAY TEXT,"+
                 "SUBNET_MASK TEXT,"+
                 "STATION_ID TEXT,"+
                 "CCHS_REFRENCE NULL,"+
                 "CCHS_STATION_ID NULL,"+
                 "COORD_X NULL,"+
                 "COORD_Y NULL"+
                 ")";
         CREATE_TABLE_QUERY_STATIONS = "CREATE TABLE IF NOT EXISTS stations"+
                 "("+
                 "ID TEXT PRIMARY KEY,"+
                 "STATION_NAME TEXT,"+
                 "STATION_NAME_MARATHI TEXT,"+
                 "STATION_CODE TEXT,"+
                 "TIMESTAMP TEXT"+
                 ")";
         CREATE_TABLE_QUERY_PRODUCTS = "CREATE TABLE IF NOT EXISTS products"+
                 "("+
                 "PASS_INVENTORY_ID TEXT,"+
                 "SUPPORT_TYPE_ID TEXT,"+
                 "PASS_ID TEXT,"+
                 "ACTIVE TEXT,"+
                 "NAME TEXT,"+
                 "COMPANY_ID TEXT,"+
                 "DESCRIPTION TEXT,"+
                 "QR_TYPE_ID TEXT,"+
                 "SAME_STATION_OVER_TIME TEXT,"+
                 "SAME_STATION_OVER_TIME_PENALTY TEXT,"+
                 "SAME_STATION_OVER_TIME_MAX_PENALTY TEXT,"+
                 "OTHER_STATION_OVER_TIME TEXT,"+
                 "OTHER_STATION_OVER_TIME_PENALTY TEXT,"+
                 "OTHER_STATION_OVER_TIME_MAX_PENALTY TEXT,"+
                 "OVER_TRAVELLING_PENALTY TEXT,"+
                 "ENTRY_EXIT_CONTROL TEXT,"+
                 "START_VALIDITY_PERIOD TEXT,"+
                 "END_VALIDITY_PERIOD TEXT,"+
                 "BALANCED_FORWARD TEXT,"+
                 "RELOAD_PERMIT TEXT,"+
                 "VALDITY TEXT,"+
                 "VALIDITY_UNIT TEXT,"+
                 "ENTRY_VALIDITY TEXT,"+
                 "ENTRY_VALIDITY_UNIT TEXT,"+
                 "GRACE_PERIOD TEXT,"+
                 "FARE_TABLE_ID TEXT,"+
                 "FARE_TABLE_PEAK TEXT,"+
                 "FARE_TABLE_NON_PEAK TEXT,"+
                 "REGISTRAION_FEE TEXT,"+
                 "REFUND_PERMIT TEXT,"+
                 "REFUND_FEE TEXT,"+
                 "REGISTRATION_FEE_REFUND_PERMIT TEXT,"+
                 "REGISTRATION_REFUND_FEE TEXT,"+
                 "BUNDLE_TRIPS TEXT,"+
                 "DAILY_TRIPS_CONTROL,"+
                 "MAX_DAILY_TRIP TEXT,"+
                 "MAX_BALANCED TEXT,"+
                 "MIN_ENTRY_VALUE TEXT,"+
                 "MAX_EXIT_VALUE TEXT,"+
                 "MIN_LOAD_BALANCED TEXT,"+
                 "MIN_RELOAD_BALANCED TEXT,"+
                 "STEPS_RELOAD TEXT,"+
                 "CCHS_REFRENCE TEXT,"+
                 "ENTRY_MISMATCH_PENALTY TEXT,"+
                 "EXIT_MISMATCH_PENALTY TEXT,"+
                 "FREE_EXIT_TOKEN_PENALTY TEXT,"+
                 "RETURN_VALIDITY TEXT,"+
                 "RETURN_VALIDITY_UNIT TEXT"+
                 ")";
         stmt.execute(CREATE_TABLE_QUERY_USERS);
         stmt.execute(CREATE_TABLE_QUERY_FARES);
         stmt.execute(CREATE_TABLE_QUERY_EQUIPMENTS);
         stmt.execute(CREATE_TABLE_QUERY_STATIONS);
         stmt.execute(CREATE_TABLE_QUERY_PRODUCTS);

     }
     catch (Exception e)
     {
         System.out.println(e.getMessage());
     }
 }
 public void insertFareData(FareModal fare)
 {
     try
     {
         Connection con=DriverManager.getConnection(
                 "jdbc:sqlite:/home/aditya/IdeaProjects/atekassign/src/sqlite1.db");
         //Statement stmt = con.createStatement();]
         String INSERT_FARE;
         INSERT_FARE = "INSERT INTO fares (ID,FARE_TABLE_ID,SOURCE,DESTINATION,FARE,FARE_VERSION) VALUES(?,?,?,?,?,?)";
         PreparedStatement preparedStatement = con.prepareStatement(INSERT_FARE);
         preparedStatement.setString(1, fare.getId());
         preparedStatement.setString(2, fare.getFareTableId());
         preparedStatement.setString(3, fare.getSource());
         preparedStatement.setString(4, fare.getDestination());
         preparedStatement.setString(5, fare.getFare());
         preparedStatement.setString(6, fare.getFareVersion());

         preparedStatement.execute();



     }
     catch(Exception e)
     {
        System.err.println(e.getMessage());
     }
 }
    public void insertStationData(StationModal stations)
    {
        try{
            Connection con=DriverManager.getConnection(
                    "jdbc:sqlite:/home/aditya/IdeaProjects/atekassign/src/sqlite1.db");
            //Statement stmt = con.createStatement();]
            String INSERT_STATION;
            INSERT_STATION = "INSERT INTO stations (id,station_name,station_name_marathi,station_code,timestamp) VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(INSERT_STATION);
            preparedStatement.setString(1,stations.getId());
            preparedStatement.setString(2,stations.getStation_name());
            preparedStatement.setString(3,stations.getStation_name_marathi());
            preparedStatement.setString(4,stations.getStation_code());
            preparedStatement.setString(5,stations.getTime_stamp());

            preparedStatement.execute();
        }
        catch (Exception e)
        {
            System.err.println();
        }
    }

    public void insertUser(UserModal user) {
     try{
         Connection con=DriverManager.getConnection(
                 "jdbc:sqlite:/home/aditya/IdeaProjects/atekassign/src/sqlite1.db");
         //Statement stmt = con.createStatement();]
         String INSERT_USER;
         INSERT_USER = "INSERT INTO users(USER_ID,LOGIN,SECRET_KEY,USERNAME,SURNAME,EMAIL,PHONE,PASSWORD,STATUS,REMEMBER_TOKEN,USER_GROUP_ID,ISTESTER,DESIGNATION,EMPLOYEE_ID,START_DATE,END_DATE,DESCRIPTION ,EQ_PROFILE,OPERATOR_ID,PG_ID,CREATED_BY,MODIFIED_BY) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
         PreparedStatement preparedStatement = con.prepareStatement(INSERT_USER);
         preparedStatement.setString(1,user.getUser_id());
         preparedStatement.setString(2,user.getLogin());
         preparedStatement.setString(3,user.getSecret_key());
         preparedStatement.setString(4,user.getUser_name());
         preparedStatement.setString(5,user.getSurname());
         preparedStatement.setString(6,user.getEmail());
         preparedStatement.setString(7,user.getPhone());
         preparedStatement.setString(8,user.getPassword());
         preparedStatement.setString(9,user.getStatus());
         preparedStatement.setString(10,user.getRemember_token());
         preparedStatement.setString(11,user.getUser_group_id());
         preparedStatement.setString(12,user.getIsTester());
         preparedStatement.setString(13,user.getDesignation());
         preparedStatement.setString(14,user.getEmployee_id());
         preparedStatement.setString(15,user.getStart_date());
         preparedStatement.setString(16,user.getEnd_date());
         preparedStatement.setString(17,user.getDescription());
         preparedStatement.setString(18,user.getEq_profile());
         preparedStatement.setString(19,user.getOpreator_id());
         preparedStatement.setString(20,user.getPg_id());
         preparedStatement.setString(21,user.getModified_by());
         preparedStatement.setString(22, user.getModified_by());

         preparedStatement.execute();

     }catch (Exception e)
     {
         System.err.println(e.getMessage());
     }
    }

    public void insertProductData(ProductsModal product) {
     try
     {
         Connection con=DriverManager.getConnection(
                 "jdbc:sqlite:/home/aditya/IdeaProjects/atekassign/src/sqlite1.db");
         //Statement stmt = con.createStatement();]
         String INSERT_PRODUCTS;
         INSERT_PRODUCTS = "INSERT INTO products(PASS_INVENTORY_ID,SUPPORT_TYPE_ID,PASS_ID,ACTIVE,NAME,COMPANY_ID,DESCRIPTION,QR_TYPE_ID,SAME_STATION_OVER_TIME,SAME_STATION_OVER_TIME_PENALTY,SAME_STATION_OVER_TIME_MAX_PENALTY,OTHER_STATION_OVER_TIME,OTHER_STATION_OVER_TIME_PENALTY,OTHER_STATION_OVER_TIME_MAX_PENALTY,OVER_TRAVELLING_PENALTY,ENTRY_EXIT_CONTROL,START_VALIDITY_PERIOD,END_VALIDITY_PERIOD,BALANCED_FORWARD,RELOAD_PERMIT,VALDITY,VALIDITY_UNIT,ENTRY_VALIDITY,ENTRY_VALIDITY_UNIT,GRACE_PERIOD,FARE_TABLE_ID,FARE_TABLE_PEAK,FARE_TABLE_NON_PEAK,REGISTRAION_FEE,REFUND_PERMIT,REFUND_FEE,REGISTRATION_FEE_REFUND_PERMIT,REGISTRATION_REFUND_FEE,BUNDLE_TRIPS,DAILY_TRIPS_CONTROL,MAX_DAILY_TRIP,MAX_BALANCED,MIN_ENTRY_VALUE,MAX_EXIT_VALUE,MIN_LOAD_BALANCED,MIN_RELOAD_BALANCED,STEPS_RELOAD,CCHS_REFRENCE,ENTRY_MISMATCH_PENALTY,EXIT_MISMATCH_PENALTY,FREE_EXIT_TOKEN_PENALTY,RETURN_VALIDITY,RETURN_VALIDITY_UNIT\n" +
                  " ) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

         PreparedStatement preparedStatement = con.prepareStatement(INSERT_PRODUCTS);
         preparedStatement.setString(1,product.getPass_inventory_id());
         preparedStatement.setString(2,product.getSupport_type_id());
         preparedStatement.setString(3,product.getPass_id());
         preparedStatement.setString(4,product.getActive());
         preparedStatement.setString(5,product.getName());
         preparedStatement.setString(6,product.getCompany_id());
         preparedStatement.setString(7,product.getDescription());
         preparedStatement.setString(8,product.getQr_type_id());
         preparedStatement.setString(9,product.getSame_station_over_time());
         preparedStatement.setString(10,product.getSame_station_over_time_penalty());
         preparedStatement.setString(11,product.getSame_station_over_time_max_penalty());
         preparedStatement.setString(12,product.getOther_station_over_time());
         preparedStatement.setString(13,product.getOther_station_over_time_penalty());
         preparedStatement.setString(14,product.getOther_station_over_time_max_penalty());
         preparedStatement.setString(15,product.getOver_travelling_penalty());
         preparedStatement.setString(16,product.getEntry_exit_control());
         preparedStatement.setString(17,product.getStart_validity_period());
         preparedStatement.setString(18,product.getEnd_validity_period());
         preparedStatement.setString(19,product.getBalance_forward());
         preparedStatement.setString(20,product.getReload_permit());
         preparedStatement.setString(21,product.getValidity());
         preparedStatement.setString(22,product.getValidity_unit());
         preparedStatement.setString(23,product.getEntry_validity());
         preparedStatement.setString(24, product.getEntry_validity_unit());
         preparedStatement.setString(25,product.getGrace_period());
         preparedStatement.setString(26,product.getFare_table_id());
         preparedStatement.setString(27,product.getFare_table_peak());
         preparedStatement.setString(28,product.getFare_table_non_peak());
         preparedStatement.setString(29,product.getRegistration_fee());
         preparedStatement.setString(30,product.getRefund_permit());
         preparedStatement.setString(31,product.getRefund_fee());
         preparedStatement.setString(32,product.getRegistration_fee_refund_permit());
         preparedStatement.setString(33,product.getRegistration_refund_fee());
         preparedStatement.setString(34,product.getBundle_trips());
         preparedStatement.setString(35,product.getDaily_trip_control());
         preparedStatement.setString(36,product.getMax_daily_trip());
         preparedStatement.setString(37,product.getMax_balance());
         preparedStatement.setString(38,product.getMin_entry_value());
         preparedStatement.setString(39,product.getMax_exit_value());
         preparedStatement.setString(40,product.getMin_load_balance());
         preparedStatement.setString(41,product.getMin_reload_balance());
         preparedStatement.setString(42,product.getSteps_reload());
         preparedStatement.setString(43,product.getCchs_reference());
         preparedStatement.setString(44,product.getEntry_mismatch_penalty());
         preparedStatement.setString(45,product.getExit_mismatch_penalty());
         preparedStatement.setString(46,product.getFree_exit_token_penalty());
         preparedStatement.setString(47,product.getReturn_validity());
         preparedStatement.setString(48,product.getReturn_validity_unit());

         preparedStatement.execute();


     }
     catch (Exception e)
     {
         System.err.println(e.getMessage());
     }
    }

    public void insertEquipmentsData(EquipmentsModal equipmentsModal) {
     try{
         Connection con=DriverManager.getConnection(
                 "jdbc:sqlite:/home/aditya/IdeaProjects/atekassign/src/sqlite1.db");
         //Statement stmt = con.createStatement();]
         String INSERT_EQUIPMENTS;
         INSERT_EQUIPMENTS = "INSERT INTO equipment(RIDLR_ID,EQUIPMENT_ID,LINE_ID,EQ_WORKING_MODE_ID,IP_ADDRESS,DESCRIPTION,COMPANY_ID,EQ_TYPE_ID,END_DATE,STATUS,ENDPOINTKEYHASH,KAA_STATION_NAME,GATEID,GATEDIRECTION,HOSTNAME,PRIMARY_SSID,PRIMARY_SSID_PASSWORD,BACKUP_SSID,BACKUP_SSID_PASSWORD,GATEWAY,SUBNET_MASK,STATION_ID,CCHS_REFRENCE,CCHS_STATION_ID,COORD_X,COORD_Y \n" +
                 "                 ) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
         PreparedStatement preparedStatement = con.prepareStatement(INSERT_EQUIPMENTS);
         preparedStatement.setString(1,equipmentsModal.getRidlr_id());
         preparedStatement.setString(2,equipmentsModal.getEquipment_id());
         preparedStatement.setString(3,equipmentsModal.getLine_id());
         preparedStatement.setString(4,equipmentsModal.getEq_working_mode_id());
         preparedStatement.setString(5,equipmentsModal.getIp_address());
         preparedStatement.setString(6,equipmentsModal.getDescription());
         preparedStatement.setString(7,equipmentsModal.getCompany_id());
         preparedStatement.setString(8,equipmentsModal.getEq_type_id());
         preparedStatement.setString(9,equipmentsModal.getEnd_date());
         preparedStatement.setString(10,equipmentsModal.getStatus());
         preparedStatement.setString(11,equipmentsModal.getEndpointKeyHash());
         preparedStatement.setString(12,equipmentsModal.getKaa_station_name());
         preparedStatement.setString(13,equipmentsModal.getGateId());
         preparedStatement.setString(14,equipmentsModal.getGateDirection());
         preparedStatement.setString(15,equipmentsModal.getHostName());
         preparedStatement.setString(16,equipmentsModal.getPrimarySSID());
         preparedStatement.setString(17,equipmentsModal.getPrimarySSIDPassword());
         preparedStatement.setString(18,equipmentsModal.getBackupSSID());
         preparedStatement.setString(19,equipmentsModal.getBackupSSIDPassword());
         preparedStatement.setString(20,equipmentsModal.getGateway());
         preparedStatement.setString(21,equipmentsModal.getSubnet_mask());
         preparedStatement.setString(22,equipmentsModal.getStation_id());
         preparedStatement.setString(23,equipmentsModal.getCchs_reference());
         preparedStatement.setString(24,equipmentsModal.getCchs_station_id());
         preparedStatement.setString(25,equipmentsModal.getCoord_x());
         preparedStatement.setString(26,equipmentsModal.getCoord_y());
         preparedStatement.execute();
     }catch (Exception e)
     {
            System.err.println(e.getMessage());
     }
    }
}
