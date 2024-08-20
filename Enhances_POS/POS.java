import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class POS {
    private List<Sale> sales;

    public POS() {
        this.sales = new ArrayList<>();
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    public void processSale(Sale sale) {
        sales.add(sale);
        sale.addSale();
    }

    public double calculateTotalRevenueForMonth(int month, int year) {
        double totalRevenue = 0;
        for (Sale sale : sales) {
            Date saleDate = sale.getDate();
            if (saleDate.getMonth() == month && saleDate.getYear() + 1900 == year) {
                totalRevenue += sale.getTotalAmount();
            }
        }
        return totalRevenue;
    }

    public int calculateTotalTransactionsForMonth(int month, int year) {
        int totalTransactions = 0;
        for (Sale sale : sales) {
            Date saleDate = sale.getDate();
            if (saleDate.getMonth() == month && saleDate.getYear() + 1900 == year) {
                totalTransactions++;
            }
        }
        return totalTransactions;
    }

    public void generateProductWiseReport() {
        for (Sale sale : sales) {
            for (Product product : sale.getItems()) {
                System.out.println("Product: " + product.getName() + ", Units Sold: " + product.getUnitsSold());
            }
        }
    }
}
