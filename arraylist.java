import java.util.*;
import java.util.Collections;
public class arraylist {

    public static void main(String[] args) {
       ArrayList <Integer> list1 = new ArrayList();

    //    element add

        list1.add(1 );
        list1.add(3);
        System.out.println(list1);


        // element select

       int element =  list1.get(1);

System.out.println(element);


//  add element in bt 

list1.add(1,4);
System.out.println(list1);



// set element 
list1.set(1, 0);
System.out.println(list1);


// delet element

list1.remove(2);
System.out.println(list1);



// sorting
Collections.sort(list1);
System.out.println(list1);


    }
}