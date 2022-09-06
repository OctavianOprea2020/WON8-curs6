public class Product_Ex4 {
	private String name;
    private float price;
    private int quantity;
    private String category;

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
        return this.category.trim().toLowerCase().equals(findCategory.trim().toLowerCase());
    }

    public static void main(String[] args) {
        // Product1
    	Product_Ex4 product1 = new Product_Ex4();

        // Use Setter
        product1.setName("Book");
        product1.setPrice(10.25f);
        product1.setQuantity(100);
        product1.setCategory("School");

        // Use Getter
        System.out.println("Product1:");
        System.out.println("Name: " + product1.getName());
        System.out.println("Price: " + product1.getPrice());
        System.out.println("Quantity: " + product1.getQuantity());
        System.out.println("Category: '" + product1.getCategory() + "'");
        System.out.println("Has Stock: " + product1.hasStock());
        System.out.println("Is Category 'school': " + product1.isCategory("school"));

        // Product2
        Product_Ex4 product2 = new Product_Ex4();

        // Use Setter
    	product2.setName("Desk");
    	product2.setPrice(249.99f);
    	product2.setQuantity(500);
        product2.setCategory("Furniture");

        // Use Getter
    	System.out.println();
        System.out.println("Product2:");
    	System.out.println("Name: " + product2.getName());
    	System.out.println("Price: " + product2.getPrice());
    	System.out.println("Quantity: " + product2.getQuantity());
        System.out.println("Category: '" + product2.getCategory() + "'");
        System.out.println("Has Stock: " + product2.hasStock());
        System.out.println("Is Category 'Grocery': " + product2.isCategory("Grocery"));

        // Product3
        Product_Ex4 product3 = new Product_Ex4();

        // Use Setter
        product3.setName("TV Set");
        product3.setPrice(1000.55f);
        product3.setQuantity(200);
        product3.setCategory("Electronics");

        // Use Getter
        System.out.println();
        System.out.println("Product3:");
        System.out.println("Name: " + product3.getName());
        System.out.println("Price: " + product3.getPrice());
        System.out.println("Quantity: " + product3.getQuantity());
        System.out.println("Category: '" + product3.getCategory() + "'");
        System.out.println("Has Stock: " + product3.hasStock());
        System.out.println("Is Category 'ELECTRONICS': " + product3.isCategory("ELECTRONICS"));
	}
}
