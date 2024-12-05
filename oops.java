//  class Student {
//     String name ;
//     int age ;

//     public void printInfo(){
//         System.out.println(this.name );
//         System.out.println(this.age);
//     }

//     // type 1 constructor  non pearmeter
// // Student(){
// //     System.out.println("constructor called");
// // }

// // type 2 constructor  == parameter 
// // Student (String name , int age){
// // this.name = name;
// // this.age = age;

// // type 3 copy  constructor

// Student (Student s2){
// this.name = s2.name;
//  this.age  = s2.age;
// }
// Student(){

// }

//  }
//  public class oops{
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "krishna";
//         s1.age = 20;
//   Student s2 = new Student(s1);

//         s2.printInfo();
//     }
//  }

// polymorphisms  ++++

// class Student{
//  String name;
//  int age ; 

//  public void printInfo (String name ) {
//  System.out.println(name);

//  }
//  public void printInfo(int age){
//     System.out.println(age);
//  }
//  public void printInfo(String name, int age){
//     System.out.println(name+ " " +  age);

//  }
// }
//  public class oops {

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "krishna";
//         s1.age= 20;

// s1.printInfo(s1.name, s1.age);

//  }
// }






// inheritence ++++

// single level   base classs 1 Sahpe and derived class 1 triangle

// class Shape {

//     public void area() {
//         System.out.println("display printing");
//     }

//     class triangle extends Shape {
//         public void area(int l, int h) {
//             System.out.println(1 / 2 * h * l);
//         }
//     }
//     // mulitiple level inheritence base class 1 Shape and derived class multilevel
//     // like triangle and eqielenriangle

//     class Equilentriangle extends triangle {
//         public void area(int l, int h) {
//             System.out.println(1 / 2 * l * h);
//         }
//     }

//     // herichcal inheritence base class Shape and derived class circle and triangle

//     class circle extends Shape {
//         public void area(int r) {
//             System.out.println(3.14 * r * r);
//         }

//     }
// }

// public class oops {

//     public static void main(String[] args) {

//     }
// }




// abstraction *****


// abstract class Animal {
//     abstract void walk();
//     void breathe() {
//         System.out.println("This animal breathes air");
//     }
//     Animal() {
//         System.out.println("You are about to create an Animal.");
//     }
//  }
 
 
//  class Horse extends Animal {
//     Horse() {
//         System.out.println("Wow, you have created a Horse!");
//     }
//     void walk() {
//         System.out.println("Horse walks on 4 legs");
//     }
//  }
 
 
//  class Chicken extends Animal {
//     Chicken() {
//         System.out.println("Wow, you have created a Chicken!");
//     }
//     void walk() {
//         System.out.println("Chicken walks on 2 legs");
//     }
//  }
 
 
//  public class oops {
//     public static void main(String args[]) {
//        Horse horse = new Horse();
//        horse.walk();
//        horse.breathe();
//     }
//  }
 
 
// interface *****


// interface animal{
//     int eye = 2;
// void walk();

// }
//  interface horvies {

    
// }
// class Horse implements animal, horvies{
//    public void walk(){
// System.out.println("walk on 4leg");
//     }
// }

// public class oops {

//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         horse.walk();
        
//     }
// }