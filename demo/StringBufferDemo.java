package demo;

public class StringBufferDemo {

    public static void main(String[] args) {
        String s = "abcd";
        StringBuffer sb1 = new StringBuffer("abcd");
        StringBuffer sb2 = new StringBuffer("abcd");
        StringBuffer sb3 = sb2;
        StringBuffer sb4 = new StringBuffer("Hallo");
        
        System.out.println(sb1);
        System.out.println(sb1.length());
        sb1.setLength(8);
        System.out.println(sb1 + "ef");
        sb1.setLength(2);
        System.out.println(sb1 + "gh");
        sb1.setLength(4);
        System.out.println(sb1 + "ij");

        System.out.println();
        
        System.out.println(s + " " + sb1.toString());
        System.out.println(s.equals(sb1.toString()));

        System.out.println(sb3);

        System.out.println(sb2);
        sb2.append(5);
        System.out.println(sb2);

        System.out.println();

        System.out.println(sb2);
        sb2.insert(1,"cd");
        System.out.println(sb2);

        System.out.println();

        System.out.println(sb2.delete(1,3));
        
        System.out.println();

        System.out.println(sb2.replace(0,2,"uvwxyz"));

        System.out.println();

        System.out.println(sb4);
    }
}