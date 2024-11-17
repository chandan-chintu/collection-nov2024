package sets;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<String> treeset1 = new TreeSet<>();

        treeset1.add("Mango");
        treeset1.add("Guava");
        treeset1.add("Orange");
        treeset1.add("Banana");
        treeset1.add("Mango");

        System.out.println("treeset1 is : "+treeset1);

        treeset1.remove("Orange");
        System.out.println("after removing :"+treeset1);

        // traversing the hashset
        for(String h1:treeset1){
            System.out.println(h1);
        }
    }
}
