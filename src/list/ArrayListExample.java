package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // wrapper class
//        int a=10;
//        int b=null;// cannot take null values
//        Integer a=10;
//        Integer b=null; // allows null values


        // defining the arraylist
        List<Integer> list1 = new ArrayList<Integer>();

        //adding or inserting data
        list1.add(23);
        list1.add(12);
        list1.add(44);
        list1.add(33);
        list1.add(null);
        list1.add(66);
        list1.add(33);

        System.out.println("list1 is :"+list1);

        // remove data
        list1.remove(2);
        System.out.println("list1 after removing index 2 : "+list1);

        // search the data at specific position
        System.out.println("list1 element at 2nd index : "+list1.get(2));
        System.out.println("list1 element at 4th index : "+list1.get(4));

        // update the data
        list1.set(3, 88);
        System.out.println("list1 after updating the 3rd index data : "+list1);

        // size of the list
        System.out.println("list1 length or size is : "+list1.size());

        // sort the lsit
        Collections.sort(list1);
        System.out.println("list1 after sorting : "+list1);

        // traversing the list
        System.out.println("traversing using foreach loop");
        for(Integer l1:list1){
            System.out.println(l1);
        }


    }
}
