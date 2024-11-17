package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet1 = new LinkedHashSet<>();

        hashSet1.add("Mango");
        hashSet1.add("Guava");
        hashSet1.add("Orange");
        hashSet1.add("Banana");
        hashSet1.add(null);
        hashSet1.add("Mango");

        System.out.println("hashset1 is : "+hashSet1);

        hashSet1.remove("Orange");
        System.out.println("after removing :"+hashSet1);

        // traversing the hashset
        for(String h1:hashSet1){
            System.out.println(h1);
        }
    }
}
