package edu.neu.csye7374;

public class GrowthStock extends StockAPI {

    public GrowthStock(String id, double price, String description) {
        super(id, price, description);
    }

    @Override
    public int getMetric() {
        double averageBid = bids.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        return (int) ((averageBid - price) * 10); // Metric based on growth potential
    }
}
