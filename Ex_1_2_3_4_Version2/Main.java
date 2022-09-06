package Curs6;

public class Main {
    public static void main(String[] args) {
        // Person()
        System.out.println("Person():");
        System.out.println("---------");
        System.out.println("");

        // Person1
        Person person1 = new Person();

        // Use Setter
        person1.setName("Ionescu Ion");
        person1.setAge(20);
        person1.setMarried(true);

        // Use Getter
        System.out.println("Person1:");
        person1.printPerson();

        // Person2
        // Use Constructor
        Person person2 = new Person("Georgescu George", 40, true);

        // Use Getter
        System.out.println();
        System.out.println("Person2:");
        person2.printPerson();

        // Person3
        Person person3 = new Person();

        // Use Setter
        person3.setName("Marinescu Marin");
        person3.setAge(60);
        person3.setMarried(false);

        // Use Getter
        System.out.println();
        System.out.println("Person3:");
        person3.printPerson();

        // Product()
        System.out.println("");
        System.out.println("");
        System.out.println("Product():");
        System.out.println("----------");
        System.out.println("");

        // Product1
        Product product1 = new Product();

        // Use Setter
        product1.setName("Book");
        product1.setPrice(10.25f);
        product1.setQuantity(100);
        product1.setCategory("School");

        // Use Getter
        System.out.println("Product1:");
        product1.printProduct("school");

        // Product2
        // Use Constructor
        Product product2 = new Product("Desk", 249.99f, 500, "Furniture");

        // Use Getter
        System.out.println();
        System.out.println("Product2:");
        product2.printProduct("Grocery");

        // Product3
        Product product3 = new Product();

        // Use Setter
        product3.setName("TV Set");
        product3.setPrice(1000.55f);
        product3.setQuantity(200);
        product3.setCategory("Electronics");

        // Use Getter
        System.out.println();
        System.out.println("Product3:");
        product3.printProduct("ELECTRONICS");
    }
}
