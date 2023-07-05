package demo;

public class ArrayDemo {

    // Array mit zwei Werten
    public static int[] makeArray(int value1, int value2) {
        return new int[] { value1, value2 };
    }

    // erste Methode überladen, Array mit beliebiger Länge
    // Varargs: variable Argumentenlisten
    public static int[] makeArray(int... values) {
        return values;
    }

    // Ausgabe der Arrayelemente eines int-Arrays auf dem Terminal
    public static void printArray(int[] intArray) {
        if (intArray != null) {
            // for (int i = 0; i < intArray.length; i++)
            // System.out.print(" " + intArray[i]);

            for (int value : intArray) // for each component value ...
                System.out.print(" " + value);

            System.out.println();
        } else
            System.out.println("*** no array available ***");
    }

    // Die Methode printArray kann !! nicht !! mit einer Varargs überladen werden
    public static void printValues(int... values) {
        if (values.length > 0) {
            for (int value : values) // for each component value ...
                System.out.print(" " + value);

            System.out.println();
        } else
            System.out.println("*** no values available ***");
    }

    // erste Methode überladen
    // Ausgabe der Arrayelemente eines String-Array auf dem Terminal
    public static void printArray(String[] stringArray) {
        if (stringArray != null) {
            for (int i = 0; i < stringArray.length; i++) {
                System.out.print(" " + stringArray[i]);
            }
            System.out.println();
        } else {
            System.out.println("*** no array available ***");
        }
    }

    public static void main(String[] args) {

        // options, how to generate an array
        int[] x1; // int x1[]
        x1 = new int[4];

        x1[0] = 1;
        x1[1] = 2;

        int x2[] = new int[] { 1, 2, 3, 4 };
        System.out.println("x2: " + x2.length);

        int[] x3 = { 1, 2, 3, 4 };
        x3[0] = 9;

        // Arraytest 1
        int[] zahlen = new int[10];
        // int zahlen[] = new int[10]; // ginge hier auch

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = i * 100;
        }

        for (int i = 0; i < zahlen.length; i++) {
            System.out.print(zahlen[i] + " ");
        }

        System.out.println();

        String[] tage = { "Mo", "Di", "Mi", "Do", "Fr", "Sa", "So" };
        for (int i = 0; i < tage.length; i++) {
            System.out.print(tage[i] + " ");
        }

        // Arraytest 2
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }

        System.out.println();

        for (String tag : tage) {
            System.out.print(tag + " ");
        }

        System.out.println();

        // Varargs: variable Argumentenlisten
        int[] primes = makeArray(1, 3, 5, 7, 11, 13);
        printArray(primes);
        printValues(primes);

        int[] test = makeArray();
        printArray(test);

        // geht:
        printValues(3);      
        printValues();

        // Zuweisungen und Speicherverwaltung
        int[] a1 = { 0, 1, 2 };
        int[] a2 = { 4, 5, 6, 7 };
        int[] a3 = null;


        printArray(a1);
        printArray(a2);

        a3 = a1;
        // Arrayelement wird auch in a1 geändert
        a3[0] = 7;
        printArray(a1);

        a1 = null;
        a2 = null;

        // Hinweis: mit clone(), Standardmethode von Object, können zwei Arrays kopiert werden
        int[] a3Copy = a3.clone();
        a3Copy[0] = 1;
        printArray(a3Copy);
        printArray(a3);

        // mehrdimensionale Arrays
        // var b1 = new int[4][3];
        int[][] b1 = new int[4][3];
        long[][][] b2 = new long[2][3][6];
        int[][] b = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };
        int l1 = b1.length;

        System.out.println("b1 hat die Länge " + l1);

        for (int i = 0; i < b2.length; i++)
            for (int ii = 0; ii < b2[i].length; ii++)
                for (int iii = 0; iii < b2[i][ii].length; iii++)
                    b2[i][ii][iii] = iii;

        for (int i = 0; i < b.length; i++)
            printArray(b[i]);

    }

}
