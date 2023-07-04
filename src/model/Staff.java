package model;

public class Staff extends Person {

    private String function;

    public Staff(){

    }
    
    public Staff(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Staff(String firstName, String lastName, String function) {
        super(firstName, lastName);
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void newInputDialogue() {
        System.out.println("New staff");
        super.newInputDialogue();
        
        System.out.print("Funktion: ");
        function = sc.nextLine();
    }

    public static void newInputDialogue(Staff staff) {
        Person.newInputDialogue(staff);
        System.out.print("Funktion: ");
        staff.function = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + " Staff [function=" + function + "]";
    }

    

    

}
