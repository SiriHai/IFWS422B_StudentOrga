package demo;

public class WrapperDemo {

    public static void main(String[] args) throws Exception {
       
        // Klassenmethode valueOf von Hüllklassen
        Integer intObj = Integer.valueOf("1234");  //Klassenmethode der Klasse Integer, neues Integer-Objekt 
        Integer intObj2 = Integer.valueOf(1234);
        Integer intObj3 = 1234;
        
        Float fObj = Float.valueOf("1.1234");
        Double dObj = Double.valueOf(1.4958674);

        System.out.println("Dual zu dezimal 101: " + Integer.valueOf("101", 2));

        // Umgekehrt
        int i = intObj.intValue();
        int i2 = intObj2.intValue();
        int i3 = intObj3.intValue();
        
        float f = fObj.floatValue();
        double d = dObj.doubleValue();    
        
        System.out.println("i: " + i +" i2: " + i2 + " i3:" + i3);
        System.out.println("f: " + f + " d: " + d);

        // Boxing
        System.out.print("Bitte eine Zahl eingeben: ");
        String s1 = System.console().readLine();
        int z1 = Integer.parseInt(s1);
        int z2 = Integer.valueOf(s1);
        System.out.println("z1: " + z1 + " z2: "+ z2);
       
        Integer b = 3;  //boxing
        Integer a = 5;

        int c;
        c = a.intValue() * b.intValue();
        System.out.println(c);
        c = a * b.intValue();
        System.out.println(c);
        c = a * b;
        System.out.println(c);

        String affe="AFFE";
        Integer e=Integer.valueOf(affe,16);
        System.out.println(e);  
        
        // Umwandlung von Strings in Zahlen
        System.out.print("Bitte eine Zahl eingeben: ");
        String p1 = System.console().readLine();
        System.out.println("intValue: " + Integer.valueOf(p1).intValue()*2);
        System.out.println("parseInt: " + Integer.parseInt(p1)*2);
        
       


    }
}
