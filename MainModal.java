package atekAssignDayOne;

import java.util.List;

public class MainModal {

    List<UserModal> users;
    List<FareModal> fares;
    EquipmentsModal equipment;
    List<StationModal> stations;
    List<ProductsModal> products;

    public MainModal(List<UserModal> users, List<FareModal> fares, EquipmentsModal equipment, List<StationModal> stations, List<ProductsModal> products) {
        this.users = users;
        this.fares = fares;
        this.equipment = equipment;
        this.stations = stations;
        this.products = products;
    }

    public List<UserModal> getUsers() {
        return users;
    }

    public void setUsers(List<UserModal> users) {
        this.users = users;
    }

    public List<FareModal> getFares() {
        return fares;
    }

    public void setFares(List<FareModal> fares) {
        this.fares = fares;
    }

    public EquipmentsModal getEquipment() {
        return equipment;
    }

    public void setEquipment(EquipmentsModal equipment) {
        this.equipment = equipment;
    }

    public List<StationModal> getStations() {
        return stations;
    }

    public void setStations(List<StationModal> stations) {
        this.stations = stations;
    }

    public List<ProductsModal> getProducts() {
        return products;
    }

    public void setProducts(List<ProductsModal> products) {
        this.products = products;
    }
}
