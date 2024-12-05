// import java.util.*;


// public class strings {
//    public static void main(String args[]) {
//        String name1 = "Tony";
//        String name2 = "Tony";


//        if(name1.equals(name2)) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }


//        //DO NOT USE == to check for string equality
//        //Gives correct answer here
//        if(name1 == name2) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }


//        //Gives incorrect answer here
//        if(new String("Tony") == new String("Tony")) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }
      
//    }
// }

/**
 * strings
 */
public class strings {

    public static void main(String[] args) {
       String sentence = "my name is tony";
       String name = sentence.substring(11, sentence.length());
       System.out.println(name);
}}