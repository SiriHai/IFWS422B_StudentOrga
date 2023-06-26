package demo;

import java.util.Random;
public class RandomDemo {

    public static void main(String[] args) {
        
        Random rand = new Random(5);
        System.out.println(rand.nextInt());
        rand.setSeed(5);
        System.out.println(rand.nextInt());
        
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt());
        System.out.println(rand.nextInt());

        System.out.println(rand.nextInt(5));
        System.out.println(rand.nextInt(5));
        System.out.println(rand.nextInt(5));
        System.out.println(rand.nextInt(5));
        System.out.println(rand.nextInt(5));
        System.out.println(rand.nextInt(5));
    }
    

    
}