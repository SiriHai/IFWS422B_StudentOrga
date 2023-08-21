package model;

public class Students {
    private Student[] studentArray;
    int anzahl;

    public Students(int anzahl) {
        studentArray = new Student[anzahl];
        anzahl = 0;
    }

    public void add(Student student) {
        if (anzahl < studentArray.length)
            studentArray[anzahl++] = student;
        else
            System.out.println("Kein Platz mehr.");
    }

    public void remove(Student student) {
        for (int i = 0; i < anzahl; i++) {
            if (studentArray[i] != null && studentArray[i].equals(student)) {
                for (int j = i; j < anzahl -1; j++) {
                    studentArray[j] = studentArray[j + 1];
                }
                // anzahl-- reicht auch
                studentArray[--anzahl] = null;
                return;
            }
        }
        System.out.println("Student nicht gefunden.");
    }

    public void remove(String firstName, String lastName) {
        for (int i = 0; i < anzahl; i++) {
            if (studentArray[i] != null && 
                studentArray[i].getFirstName().equals(firstName) &&
                studentArray[i].getLastName().equals(lastName)) {
                    remove(studentArray[i]);
                return;
            }
        }
        System.out.println("Student nicht gefunden.");
    }

    // Ausgabe aller gespeicherten Objekte
    public void print() {
        System.out.println("Studenten in students");
        for (int i = 0; i<anzahl; i++) {
            System.out.println(studentArray[i]);
        }
    }
}
