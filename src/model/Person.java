package model;
import java.util.Scanner;

public abstract class Person {
    private String firstName, lastName;
    private int birth;
    private String city;

    protected static Scanner sc = new Scanner(System.in);

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birth) {
        this(firstName, lastName);
        this.birth = birth;
    }

    public Person(String firstName, String lastName, int birth, String city) {
        this(firstName, lastName, birth);
        this.city = city;
    }

    protected abstract void newInput();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void newInputDialogue() {
        newInput();
        
        System.out.print("firstName: ");
        firstName = sc.nextLine();
        System.out.print("lastName: ");
        lastName = sc.nextLine();
        System.out.print("birth: ");
        birth = sc.nextInt();
        sc.nextLine();
        System.out.print("city: ");
        city = sc.nextLine();
    }

    public static void newInputDialogue(Person person) {
        System.out.print("firstName: ");
        person.firstName = sc.nextLine();
        System.out.print("lastName: ");
        person.lastName = sc.nextLine();
        System.out.print("birth: ");
        person.birth = sc.nextInt();
        sc.nextLine();
        System.out.print("city: ");
        person.city = sc.nextLine();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        
        Person other = (Person) obj;
        
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        
        if (birth != other.birth)
            return false;
        
            if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        
        return true;
    }

    

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birth=" + birth + ", city=" + city
                + "]";
    }
}
