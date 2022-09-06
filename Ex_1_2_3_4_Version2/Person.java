package Curs6;

public class Person {

    private String name;
    private int age;
    private boolean married;

    public Person() { // Default Constructor
    }

    public Person(String newName, int newAge, boolean newMarried) { // Constructor
        name = newName;
        age = newAge;
        married = newMarried;
    }

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
}
