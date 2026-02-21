package Mecanica;

public class Service implements EstimateItem{

    private String description;
    private int estimateHours;
    private double hourlyRate;

    public Service(String description, int estimateHours, double hourlyRate) {
        this.description = description;
        this.estimateHours = estimateHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePrice() {
        return estimateHours * hourlyRate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEstimateHours() {
        return estimateHours;
    }

    public void setEstimateHours(int estimateHours) {
        this.estimateHours = estimateHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
