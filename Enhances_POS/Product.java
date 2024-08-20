public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String category;
    private double wholesalePrice;
    private int unitsSold;

    public Product(int id, String name, double price, int quantity, String category, double wholesalePrice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.wholesalePrice = wholesalePrice;
        this.unitsSold = 0;
    }

 
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }

    public void updateStock(int soldQuantity) {
        this.quantity -= soldQuantity;
        this.unitsSold += soldQuantity;
    }
}
