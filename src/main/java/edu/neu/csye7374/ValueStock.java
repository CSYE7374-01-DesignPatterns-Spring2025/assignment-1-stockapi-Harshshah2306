package edu.neu.csye7374;

public class ValueStock extends StockAPI {

    public ValueStock(String id, double price, String description) {
        super(id, price, description);
    }

    @Override
    public int getMetric() {
        double lowestBid = bids.stream().mapToDouble(Double::doubleValue).min().orElse(price);
        return (int) ((price - lowestBid) * 10); // Metric based on value retention
    }
}