package Mecanica;

public class Vehicle {
    private String licensePlate;
    private String model;
    private int year;
    private int milage;

    public Vehicle(String licensePlate, String model, int year, int milage) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.year = year;
        this.milage = milage;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }
}
