package model;

/**
 * Programmaufbau
 * 
 * @author Iris Hanheide
 */
public class Student {
    private String name;
    private int id;

    // Standardkonstruktor
    public Student() {

    }

    // Konstruktor
    public Student(String name) {
        this.name = name;
    }

    // Konstruktor überladen
    public Student(String name, int id) {
        this(name); // anderen Konstruktor aufrufen
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }

    public String info() {
        return "Name: " + name + " Id: " + id;
    }

    public static void main(String[] args) throws Exception {
        // wir befinden uns in derselben Datei, deshalb kann für
        // den Zugriff auf Attribute die "Punktnotation" verwendet werden,
        // obwohl die Attribute den Modifizierer "private" haben.
        Student student1 = new Student();
        student1.name="Nathan Evans";
        student1.id=1001;

        Student student2 = new Student();
        student2.name ="Miksu Macloud";
        student2.id = 1002;

        System.out.println("Name: " + student1.name + " Id: " + student1.id);
        System.out.println(student2.info());
    }
}
