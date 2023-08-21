package demo;

//import java.util.ArrayList;
import java.util.LinkedList;

public class MyBag {
    public static void main(String[] args) throws Exception {
        //ArrayList<String> myBag = new ArrayList<>(10);
        LinkedList<String> myBag = new LinkedList<>();

        myBag.add("pen");
        myBag.add("pencil");
        myBag.add("ink");
        myBag.add("ink");
        myBag.add(3, "notebook");
        myBag.add("book");
        myBag.add("paper");

        for (int i = 0; i < myBag.size(); i++) {
            System.out.println(i + 1 + ". element of my bag: " + myBag.get(i));
        }

        if (!myBag.contains("pen"))
            myBag.add("pen");

        myBag.remove(0); // Löschen per Index
        myBag.remove("ink"); // Löschen Objektname (nur das erste)

        System.out.println();

        int i = 0;
        for (String s : myBag) {
            System.out.println(i++ + 1 + ". element of my bag: " + s);
        }
    }
}
