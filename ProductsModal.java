package atekAssignDayOne;

public class ProductsModal {
    private String pass_inventory_id;
    private String support_type_id;
    private String pass_id;
    private String active;
    private String name;
    private String company_id;
    private String description;
    private String qr_type_id;
    private String same_station_over_time;
    private String same_station_over_time_penalty;
    private String same_station_over_time_max_penalty;
    private String other_station_over_time;
    private String other_station_over_time_penalty;
    private String other_station_over_time_max_penalty;
    private String over_travelling_penalty;
    private String entry_exit_control;
    private String start_validity_period;
    private String end_validity_period = null;
    private String balance_forward;
    private String reload_permit;
    private String validity;
    private String validity_unit;
    private String entry_validity;
    private String entry_validity_unit;
    private String grace_period = null;
    private String fare_table_id;
    private String fare_table_peak = null;
    private String fare_table_non_peak = null;
    private String registration_fee = null;
    private String refund_permit;
    private String refund_fee;
    private String registration_fee_refund_permit;
    private String registration_refund_fee;
    private String bundle_trips = null;
    private String daily_trip_control;
    private String max_daily_trip = null;
    private String max_balance = null;
    private String min_entry_value = null;
    private String max_exit_value = null;
    private String min_load_balance = null;
    private String min_reload_balance = null;
    private String steps_reload = null;
    private String cchs_reference = null;
    private String entry_mismatch_penalty;
    private String exit_mismatch_penalty;
    private String free_exit_token_penalty;
    private String return_validity;
    private String return_validity_unit;

    public ProductsModal(String pass_inventory_id, String support_type_id, String pass_id, String active, String name, String company_id, String description, String qr_type_id, String same_station_over_time, String same_station_over_time_penalty, String same_station_over_time_max_penalty, String other_station_over_time, String other_station_over_time_penalty, String other_station_over_time_max_penalty, String over_travelling_penalty, String entry_exit_control, String start_validity_period, String end_validity_period, String balance_forward, String reload_permit, String validity, String validity_unit, String entry_validity, String entry_validity_unit, String grace_period, String fare_table_id, String fare_table_peak, String fare_table_non_peak, String registration_fee, String refund_permit, String refund_fee, String registration_fee_refund_permit, String registration_refund_fee, String bundle_trips, String daily_trip_control, String max_daily_trip, String max_balance, String min_entry_value, String max_exit_value, String min_load_balance, String min_reload_balance, String steps_reload, String cchs_reference, String entry_mismatch_penalty, String exit_mismatch_penalty, String free_exit_token_penalty, String return_validity, String return_validity_unit) {
        this.pass_inventory_id = pass_inventory_id;
        this.support_type_id = support_type_id;
        this.pass_id = pass_id;
        this.active = active;
        this.name = name;
        this.company_id = company_id;
        this.description = description;
        this.qr_type_id = qr_type_id;
        this.same_station_over_time = same_station_over_time;
        this.same_station_over_time_penalty = same_station_over_time_penalty;
        this.same_station_over_time_max_penalty = same_station_over_time_max_penalty;
        this.other_station_over_time = other_station_over_time;
        this.other_station_over_time_penalty = other_station_over_time_penalty;
        this.other_station_over_time_max_penalty = other_station_over_time_max_penalty;
        this.over_travelling_penalty = over_travelling_penalty;
        this.entry_exit_control = entry_exit_control;
        this.start_validity_period = start_validity_period;
        this.end_validity_period = end_validity_period;
        this.balance_forward = balance_forward;
        this.reload_permit = reload_permit;
        this.validity = validity;
        this.validity_unit = validity_unit;
        this.entry_validity = entry_validity;
        this.entry_validity_unit = entry_validity_unit;
        this.grace_period = grace_period;
        this.fare_table_id = fare_table_id;
        this.fare_table_peak = fare_table_peak;
        this.fare_table_non_peak = fare_table_non_peak;
        this.registration_fee = registration_fee;
        this.refund_permit = refund_permit;
        this.refund_fee = refund_fee;
        this.registration_fee_refund_permit = registration_fee_refund_permit;
        this.registration_refund_fee = registration_refund_fee;
        this.bundle_trips = bundle_trips;
        this.daily_trip_control = daily_trip_control;
        this.max_daily_trip = max_daily_trip;
        this.max_balance = max_balance;
        this.min_entry_value = min_entry_value;
        this.max_exit_value = max_exit_value;
        this.min_load_balance = min_load_balance;
        this.min_reload_balance = min_reload_balance;
        this.steps_reload = steps_reload;
        this.cchs_reference = cchs_reference;
        this.entry_mismatch_penalty = entry_mismatch_penalty;
        this.exit_mismatch_penalty = exit_mismatch_penalty;
        this.free_exit_token_penalty = free_exit_token_penalty;
        this.return_validity = return_validity;
        this.return_validity_unit = return_validity_unit;
    }

    public String getPass_inventory_id() {
        return pass_inventory_id;
    }

    public void setPass_inventory_id(String pass_inventory_id) {
        this.pass_inventory_id = pass_inventory_id;
    }

    public String getSupport_type_id() {
        return support_type_id;
    }

    public void setSupport_type_id(String support_type_id) {
        this.support_type_id = support_type_id;
    }

    public String getPass_id() {
        return pass_id;
    }

    public void setPass_id(String pass_id) {
        this.pass_id = pass_id;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQr_type_id() {
        return qr_type_id;
    }

    public void setQr_type_id(String qr_type_id) {
        this.qr_type_id = qr_type_id;
    }

    public String getSame_station_over_time() {
        return same_station_over_time;
    }

    public void setSame_station_over_time(String same_station_over_time) {
        this.same_station_over_time = same_station_over_time;
    }

    public String getSame_station_over_time_penalty() {
        return same_station_over_time_penalty;
    }

    public void setSame_station_over_time_penalty(String same_station_over_time_penalty) {
        this.same_station_over_time_penalty = same_station_over_time_penalty;
    }

    public String getSame_station_over_time_max_penalty() {
        return same_station_over_time_max_penalty;
    }

    public void setSame_station_over_time_max_penalty(String same_station_over_time_max_penalty) {
        this.same_station_over_time_max_penalty = same_station_over_time_max_penalty;
    }

    public String getOther_station_over_time() {
        return other_station_over_time;
    }

    public void setOther_station_over_time(String other_station_over_time) {
        this.other_station_over_time = other_station_over_time;
    }

    public String getOther_station_over_time_penalty() {
        return other_station_over_time_penalty;
    }

    public void setOther_station_over_time_penalty(String other_station_over_time_penalty) {
        this.other_station_over_time_penalty = other_station_over_time_penalty;
    }

    public String getOther_station_over_time_max_penalty() {
        return other_station_over_time_max_penalty;
    }

    public void setOther_station_over_time_max_penalty(String other_station_over_time_max_penalty) {
        this.other_station_over_time_max_penalty = other_station_over_time_max_penalty;
    }

    public String getOver_travelling_penalty() {
        return over_travelling_penalty;
    }

    public void setOver_travelling_penalty(String over_travelling_penalty) {
        this.over_travelling_penalty = over_travelling_penalty;
    }

    public String getEntry_exit_control() {
        return entry_exit_control;
    }

    public void setEntry_exit_control(String entry_exit_control) {
        this.entry_exit_control = entry_exit_control;
    }

    public String getStart_validity_period() {
        return start_validity_period;
    }

    public void setStart_validity_period(String start_validity_period) {
        this.start_validity_period = start_validity_period;
    }

    public String getEnd_validity_period() {
        return end_validity_period;
    }

    public void setEnd_validity_period(String end_validity_period) {
        this.end_validity_period = end_validity_period;
    }

    public String getBalance_forward() {
        return balance_forward;
    }

    public void setBalance_forward(String balance_forward) {
        this.balance_forward = balance_forward;
    }

    public String getReload_permit() {
        return reload_permit;
    }

    public void setReload_permit(String reload_permit) {
        this.reload_permit = reload_permit;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getValidity_unit() {
        return validity_unit;
    }

    public void setValidity_unit(String validity_unit) {
        this.validity_unit = validity_unit;
    }

    public String getEntry_validity() {
        return entry_validity;
    }

    public void setEntry_validity(String entry_validity) {
        this.entry_validity = entry_validity;
    }

    public String getEntry_validity_unit() {
        return entry_validity_unit;
    }

    public void setEntry_validity_unit(String entry_validity_unit) {
        this.entry_validity_unit = entry_validity_unit;
    }

    public String getGrace_period() {
        return grace_period;
    }

    public void setGrace_period(String grace_period) {
        this.grace_period = grace_period;
    }

    public String getFare_table_id() {
        return fare_table_id;
    }

    public void setFare_table_id(String fare_table_id) {
        this.fare_table_id = fare_table_id;
    }

    public String getFare_table_peak() {
        return fare_table_peak;
    }

    public void setFare_table_peak(String fare_table_peak) {
        this.fare_table_peak = fare_table_peak;
    }

    public String getFare_table_non_peak() {
        return fare_table_non_peak;
    }

    public void setFare_table_non_peak(String fare_table_non_peak) {
        this.fare_table_non_peak = fare_table_non_peak;
    }

    public String getRegistration_fee() {
        return registration_fee;
    }

    public void setRegistration_fee(String registration_fee) {
        this.registration_fee = registration_fee;
    }

    public String getRefund_permit() {
        return refund_permit;
    }

    public void setRefund_permit(String refund_permit) {
        this.refund_permit = refund_permit;
    }

    public String getRefund_fee() {
        return refund_fee;
    }

    public void setRefund_fee(String refund_fee) {
        this.refund_fee = refund_fee;
    }

    public String getRegistration_fee_refund_permit() {
        return registration_fee_refund_permit;
    }

    public void setRegistration_fee_refund_permit(String registration_fee_refund_permit) {
        this.registration_fee_refund_permit = registration_fee_refund_permit;
    }

    public String getRegistration_refund_fee() {
        return registration_refund_fee;
    }

    public void setRegistration_refund_fee(String registration_refund_fee) {
        this.registration_refund_fee = registration_refund_fee;
    }

    public String getBundle_trips() {
        return bundle_trips;
    }

    public void setBundle_trips(String bundle_trips) {
        this.bundle_trips = bundle_trips;
    }

    public String getDaily_trip_control() {
        return daily_trip_control;
    }

    public void setDaily_trip_control(String daily_trip_control) {
        this.daily_trip_control = daily_trip_control;
    }

    public String getMax_daily_trip() {
        return max_daily_trip;
    }

    public void setMax_daily_trip(String max_daily_trip) {
        this.max_daily_trip = max_daily_trip;
    }

    public String getMax_balance() {
        return max_balance;
    }

    public void setMax_balance(String max_balance) {
        this.max_balance = max_balance;
    }

    public String getMin_entry_value() {
        return min_entry_value;
    }

    public void setMin_entry_value(String min_entry_value) {
        this.min_entry_value = min_entry_value;
    }

    public String getMax_exit_value() {
        return max_exit_value;
    }

    public void setMax_exit_value(String max_exit_value) {
        this.max_exit_value = max_exit_value;
    }

    public String getMin_load_balance() {
        return min_load_balance;
    }

    public void setMin_load_balance(String min_load_balance) {
        this.min_load_balance = min_load_balance;
    }

    public String getMin_reload_balance() {
        return min_reload_balance;
    }

    public void setMin_reload_balance(String min_reload_balance) {
        this.min_reload_balance = min_reload_balance;
    }

    public String getSteps_reload() {
        return steps_reload;
    }

    public void setSteps_reload(String steps_reload) {
        this.steps_reload = steps_reload;
    }

    public String getCchs_reference() {
        return cchs_reference;
    }

    public void setCchs_reference(String cchs_reference) {
        this.cchs_reference = cchs_reference;
    }

    public String getEntry_mismatch_penalty() {
        return entry_mismatch_penalty;
    }

    public void setEntry_mismatch_penalty(String entry_mismatch_penalty) {
        this.entry_mismatch_penalty = entry_mismatch_penalty;
    }

    public String getExit_mismatch_penalty() {
        return exit_mismatch_penalty;
    }

    public void setExit_mismatch_penalty(String exit_mismatch_penalty) {
        this.exit_mismatch_penalty = exit_mismatch_penalty;
    }

    public String getFree_exit_token_penalty() {
        return free_exit_token_penalty;
    }

    public void setFree_exit_token_penalty(String free_exit_token_penalty) {
        this.free_exit_token_penalty = free_exit_token_penalty;
    }

    public String getReturn_validity() {
        return return_validity;
    }

    public void setReturn_validity(String return_validity) {
        this.return_validity = return_validity;
    }

    public String getReturn_validity_unit() {
        return return_validity_unit;
    }

    public void setReturn_validity_unit(String return_validity_unit) {
        this.return_validity_unit = return_validity_unit;
    }
}
