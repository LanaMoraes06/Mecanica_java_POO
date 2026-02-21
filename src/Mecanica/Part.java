package Mecanica;

public class Part implements EstimateItem {
    private String name;
    private String brand;
    private double costPrice;
    private double profitMargin;
    @Override
    public double calculatePrice() {
        return costPrice + (costPrice * profitMargin);
    }
    public Part(String name, String brand, double costPrice, double profitMargin){
        this.name = name;
        this.brand = brand;
        this.costPrice = costPrice;
        this.profitMargin = profitMargin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(double profitMargin) {
        this.profitMargin = profitMargin;
    }
}
