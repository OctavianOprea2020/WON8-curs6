public class Person {
	private String name;
    private int age;
    private boolean married;

    public String getName() {
        return name;
    }
  
    public void setName(String newName) {
        this.name = newName;
    }
  
    public int getAge() {
        return age;
    }
  
    public void setAge(int newAge) {
        this.age = newAge;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean newMarried) {
        this.married = newMarried;
    }

    public void printPerson() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Married: " + married);
    }

    public static void main(String[] args) {
        // (1)
    	Person person = new Person(); // Use Default Constructor

        // Print values
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Married: " + person.married);

        // (2)
        // Set values
    	person.name = "Marinescu Marin";
    	person.age = 40;
    	person.married = true;

        // Use a method to print
        person.printPerson();

        // (3)
        // Use Setter
    	person.setName("Popescu Pop");
    	person.setAge(60);
    	person.setMarried(false);

        // Use Getter
    	System.out.println();
    	System.out.println("Name: " + person.getName());
    	System.out.println("Age: " + person.getAge());
    	System.out.println("Married: " + person.isMarried());
	}
}
