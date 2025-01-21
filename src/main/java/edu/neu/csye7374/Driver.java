package edu.neu.csye7374;

/**
 * 
 * @author Yesha
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

		GrowthStock growthStock = new GrowthStock("TSLA", 700.00, "Tesla Growth Stock");
        ValueStock valueStock = new ValueStock("PG", 150.00, "Procter & Gamble Value Stock");

        String[] marketTrends = {"720.00", "750.00", "740.00", "730.00", "760.00", "770.00"};

        System.out.println("Simulating market trends for Growth Stock:");
        for (String bid : marketTrends) {
            growthStock.setBid(bid);
            System.out.println(growthStock);
            System.out.println("Performance Metric: " + growthStock.getMetric());
        }

        System.out.println("\nSimulating market trends for Value Stock:");
        for (String bid : marketTrends) {
            valueStock.setBid(bid);
            System.out.println(valueStock);
            System.out.println("Performance Metric: " + valueStock.getMetric());
        }
		
		System.out.println("\n\n============Main Execution End===================");
	}

}
