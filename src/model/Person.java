package model;
import java.util.Scanner;

import modelaccount.Account;

public abstract class Person {
    private String firstName, lastName;
    private int birth;
    private Location residence;
    Account account;

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

    public Person(String firstName, String lastName, int birth, Location residence) {
        this(firstName, lastName, birth);
        this.residence = residence;
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
        return residence.getCity();
    }

    public Location getResidence() {
        return residence;
    }

    public void setResidence(Location residence) {
        this.residence = residence;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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
        if (residence == null)
            residence = new Location();
        residence.newInputDialogue();
    }

    public static void newInputDialogue(Person person) {
        System.out.print("firstName: ");
        person.firstName = sc.nextLine();
        System.out.print("lastName: ");
        person.lastName = sc.nextLine();
        System.out.print("birth: ");
        person.birth = sc.nextInt();
        sc.nextLine();
        
        if (person.residence == null){
            person.residence = new Location();
        }

        Location.newInputDialogue(person.residence);
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
        
            if (residence == null) {
            if (other.residence != null)
                return false;
        } else if (!residence.equals(other.residence))
            return false;
        
        return true;
    }

    

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birth=" + birth + ", residence=" + residence
                + "]";
    }
}
