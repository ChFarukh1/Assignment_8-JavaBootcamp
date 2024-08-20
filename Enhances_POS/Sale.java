import java.util.Date;
import java.util.List;

public class Sale {
    private Date date;
    private double totalAmount;
    private List<Product> items;

    public Sale(Date date, double totalAmount, List<Product> items) {
        this.date = date;
        this.totalAmount = totalAmount;
        this.items = items;
    }

    public Date getDate() {
        return date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public List<Product> getItems() {
        return items;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public void addSale() {
      
        for (Product product : items) {
            product.updateStock(1); 
        }
    }
}
