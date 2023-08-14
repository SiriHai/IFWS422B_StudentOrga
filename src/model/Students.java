package model;

public class Students {

    private Student[] studentArray;

    public Students(int anzahl) {
        studentArray = new Student[anzahl];
    }

    public void add(Student student) {
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i] == null) {
                studentArray[i] = student;
                return;
            }
        }
        System.out.println("Kein Platz mehr.");
    }

    public void remove(Student student) {
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i] != null && studentArray[i].equals(student)) {
                studentArray[i] = null;
                return;
            }
        }
        System.out.println("Student nicht gefunden.");
    }

    // Ausgabe aller gespeicherten Objekte
    public void print() {
        System.out.println("Studenten in students");
        for (Student student : studentArray) {
            if (student != null)
                System.out.println(student);
        }
    }

}
