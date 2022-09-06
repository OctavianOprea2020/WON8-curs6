public class Person_Ex2 {
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

    public static void main(String[] args) {
    	// Person1
    	Person_Ex2 person1 = new Person_Ex2();

    	// Use Setter
    	person1.setName("Ionescu Ion");
    	person1.setAge(20);
    	person1.setMarried(true);

    	// Use Getter
    	System.out.println("Person1:");
    	System.out.println("Name: " + person1.name);
    	System.out.println("Age: " + person1.age);
    	System.out.println("Married: " + person1.married);

    	// Person2
    	Person_Ex2 person2 = new Person_Ex2();

    	// Use Setter
    	person2.setName("Georgescu George");
    	person2.setAge(40);
    	person2.setMarried(true);

    	// Use Getter
    	System.out.println();
    	System.out.println("Person2:");
    	System.out.println("Name: " + person2.getName());
    	System.out.println("Age: " + person2.getAge());
    	System.out.println("Married: " + person2.isMarried());

    	// Person3
    	Person_Ex2 person3 = new Person_Ex2();

    	// Use Setter
    	person3.setName("Marinescu Marin");
    	person3.setAge(60);
    	person3.setMarried(false);

    	// Use Getter
    	System.out.println();
    	System.out.println("Person3:");
    	System.out.println("Name: " + person3.getName());
    	System.out.println("Age: " + person3.getAge());
    	System.out.println("Married: " + person3.isMarried());
	}
}

