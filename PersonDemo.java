class Person {
    // Attributes
    String name;
    int age;

    // Parameterized constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor to set default values
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Method to display person's details
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        // Create Person objects
        Person person1 = new Person("Bob", 30);  // Using parameterized constructor
        Person person2 = new Person();           // Using default constructor

        // Display the details of the person objects
        person1.displayPerson();
        person2.displayPerson();
    }
}
