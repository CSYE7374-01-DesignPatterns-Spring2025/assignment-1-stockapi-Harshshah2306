package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public abstract class StockAPI implements Tradable {
    protected String id;
    protected double price;
    protected String description;
    protected List<Double> bids;

    public StockAPI(String id, double price, String description) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.bids = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setBid(String bid) {
        try {
            double bidValue = Double.parseDouble(bid);
            bids.add(bidValue);
            updatePrice(bidValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid bid format: " + bid);
        }
    }

    private void updatePrice(double bidValue) {
        this.price = (this.price + bidValue) / 2; // Simple algorithm to update price
    }

    @Override
    public String toString() {
        return "StockAPI [ID=" + id + ", Price=" + price + ", Description=" + description + "]";
    }

    public abstract int getMetric();
}
