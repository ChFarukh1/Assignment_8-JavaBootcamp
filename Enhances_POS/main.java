import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Product1", 100.0, 50, "Category1", 80.0);
        Product product2 = new Product(2, "Product2", 150.0, 30, "Category2", 120.0);

        Sale sale1 = new Sale(new Date(), 250.0, Arrays.asList(product1, product2));
        Sale sale2 = new Sale(new Date(), 100.0, Arrays.asList(product1));

        POS posSystem = new POS();
        posSystem.processSale(sale1);
        posSystem.processSale(sale2);

        double totalRevenue = posSystem.calculateTotalRevenueForMonth(new Date().getMonth(), new Date().getYear() + 1900);
        int totalTransactions = posSystem.calculateTotalTransactionsForMonth(new Date().getMonth(), new Date().getYear() + 1900);

        System.out.println("Total Revenue for this month: " + totalRevenue);
        System.out.println("Total Transactions for this month: " + totalTransactions);

        System.out.println("Product-Wise Report:");
        posSystem.generateProductWiseReport();
    }
}
