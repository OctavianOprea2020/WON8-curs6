public class Product {
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


    public static void main(String[] args) {
        // (1)
    	Product product = new Product(); // Use Default Constructor

        // Print values
        System.out.println();
        System.out.println("(1)");
        System.out.println("Name: " + product.name);
        System.out.println("Price: " + product.price);
        System.out.println("Quantity: " + product.quantity);
        System.out.println("Category: '" + product.category + "'");
        System.out.println("Has Stock: " + product.hasStock());
        System.out.println("Is Category 'Electronics': " + product.isCategory("Electronics"));

        // (2) 
        // Set values
    	product.name = "Book";
    	product.price = 10.25f;
    	product.quantity = 100;
        product.category = "School";

        // Use a method to print
        System.out.println();
        System.out.println("(2)");
        product.printProduct("school");

        // (3)
        // Use Setter
    	product.setName("Desk");
    	product.setPrice(249.99f);
    	product.setQuantity(500);
        product.setCategory("Furniture");

        // Use Getter
    	System.out.println();
        System.out.println("(3)");
    	System.out.println("Name: " + product.getName());
    	System.out.println("Price: " + product.getPrice());
    	System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Category: '" + product.getCategory() + "'");
        System.out.println("Has Stock: " + product.hasStock());
        System.out.println("Is Category 'Grocery': " + product.isCategory("Grocery"));
	}
}
