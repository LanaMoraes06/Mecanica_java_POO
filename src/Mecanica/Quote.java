package Mecanica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quote {
    private List<EstimateItem> items = new ArrayList<>();
    private boolean status = false;
    private Customers customer;


    public Quote(Customers customer) {
        this.customer = customer;
    }


    public void addItem(EstimateItem item) {
        this.items.add(item);
    }

    public void approveService() {
        this.status = true;
        System.out.println("Orçamento aprovado com sucesso!");
    }

    public double calculateTotal() {
        double total = 0;
        for (EstimateItem it : items) {
            total += it.calculatePrice();
        }
        return total;
    }

    // Getters
    public Customers getCustomer() { return customer; }
    public String getStatus() { return status ? "APPROVED" : "PENDING"; }
}