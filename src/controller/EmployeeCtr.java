package controller;

import model.*;

public class EmployeeCtr {
    public static void main(String[] args) {
        Lecturer lect1 = new Lecturer("Liese", "Prysellius");
        Lecturer lect2 = new Lecturer("Dr", "Specht");
        Staff staff1 = new Staff("Liese", "Prysellius");
        Staff staff2 = new Staff("David", "Kushner");
        Employee emp1 = new Lecturer("Liese", "Prysellius");
        Employee emp2 = new Staff("Miley", "Cyrus");
        Employee emp3 = lect1;
        Employee emp4 = lect2;
        Employee emp5 = staff1;

        // die Objekte haben die selbe Identität
        System.out.println(lect1.toString());
        System.out.println(emp3.toString());
        System.out.println(emp3 == lect1); // true
        System.out.println(emp3.equals(lect1)); // true

        // weitere Vergleiche
        System.out.println(emp1.toString());
        System.out.println(staff1.toString());
        System.out.println(emp1.equals(lect1)); // true
        System.out.println(lect1.equals(emp1)); // true
        System.out.println(staff1.equals(emp5)); // true

        System.out.println(staff2.toString());
        System.out.println(emp2.toString());
        System.out.println(emp4.toString());
        System.out.println(lect1.toString());
        System.out.println(emp3.toString());
        System.out.println(emp3 == lect1); // true
        System.out.println(emp3.equals(lect1)); // true

        // weitere Vergleiche
        System.out.println(emp1.toString());
        System.out.println(staff1.toString());
        System.out.println(emp1.equals(lect1)); // true
        System.out.println(lect1.equals(emp1)); // true
        System.out.println(staff1.equals(emp5)); // true

        System.out.println(staff2.toString());
        System.out.println(emp2.toString());
        System.out.println(emp4.toString());

        emp1.print();
        emp2.print();
        emp3.print();
        emp4.print();
        emp5.print();

        System.out.println(emp1.getFunction());
        System.out.println(((Lecturer) emp1).getName());

    }

}
