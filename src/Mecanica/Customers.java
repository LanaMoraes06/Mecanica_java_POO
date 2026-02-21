package Mecanica;

public class Customers {
    private String name;
    private int phoneNumber;
    private Vehicle vehicle;

    public Customers(String name, int phoneNumber, Vehicle vehicle) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
