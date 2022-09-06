package Curs6;

public class Product {
    private String name;
    private float price;
    private int quantity;
    private String category;

    public Product() { // Default Constructor
    }

    public Product(String newName, float newPrice, int newQuantity, String newCategory) { // Constructor
        name = newName;
        price = newPrice;
        quantity = newQuantity;
        category = newCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    public boolean hasStock() {
        return (this.quantity > 0 ? true : false);
    }

    public boolean isCategory(String findCategory) {
        if (this.category == null) {
            return false;
        }
        else {
            return this.category.trim().toLowerCase().equals(findCategory.trim().toLowerCase());
        }
    }

    public void printProduct(String stringCategory) {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: '" + category + "'");
        System.out.println("Has Stock: " + hasStock());
        System.out.println(String.format("Is Category '%s': ", stringCategory) + isCategory(stringCategory));
    }

}
