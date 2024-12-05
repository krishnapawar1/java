// import java.util.Scanner;

// public class qustion {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c= sc.nextInt();

// int avarage =( a + b+ c) / 3 ;
// System.out.println(avarage);
// }

// }

// 2 question

// import java.util.Scanner;

// public class Solution {
// public static void printSum(int n) {
// int sum = 0;

// for(int i=1; i<=n; i++) {
// if(i % 2 != 0) {
// sum = sum + i;
// }else{
// System.out.println("this number is even");
// }
// }

// System.out.println(sum);
// }
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// printSum(n);
// }
// }

// question 3

// import java.util.Scanner;

// /**
// * Solution
// */
// public class Solution {

// public static int getGreater(int a , int b ) {

// if (a > b ) {
// return a ;
// }else {
// return b ;
// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// System.out.println(getGreater(a , b));
// }
// }

// qustion 4

/**
 * Solution
 */
// public class Solution {

// public static Double getCircumFerence(Double radius) {
// return 2 * 3.14 * radius;

// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// Double radius = sc.nextDouble();
// System.out.println(getCircumFerence(radius));
// }
// }

// import java.util.Scanner;

// /**
// * Solution
// */
// public class Solution {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = 5 ;
// int a = sc.nextInt(n);
// int b= sc.nextInt(n);

// for (int i = 1; i <=5; i++) {
// System.out.print(1);

// for (int j = i; j<=5; j++) {

// System.out.print(1);
// }
// System.out.println();
// }
// }
// }

/**
 * Solution
 */

/**
 * Solution
 */

// class GfG {

//     // Function to check whether any pair exists
//     // whose sum is equal to the given target value
//     static boolean twoSum(int[] arr, int target){
//         int n = arr.length;

//         // Iterate through each element in the array
//         for (int i = 0; i < n; i++) {
//             // For each element arr[i], check every
//             // other element arr[j] that comes after it
//             for (int j = i + 1; j < n; j++) {
//                 // Check if the sum of the current pair
//                 // equals the target
//                 if (arr[i] + arr[j] == target) {
//                     return true;
//                 }
//             }
//         }
//         // If no pair is found after checking
//         // all possibilities
//         return false;
//     }

//     public static void main(String[] args){

//         int[] arr = { 0, -1, 2, -3, 1 };
//         int target = -2;

//         // Call the twoSum function and print the result
//         if (twoSum(arr, target))
//             System.out.println("true");
//         else
//             System.out.println("false");
//     }
// }

/**
 * Solution
//  */
// public class Solution {

//     public static void main(String[] args) {
//         int maxProfit (vector<int>$ prices);
//         int profit = 0 ; 
//         for (int  i = 1; i < prices.size(); i++) {
//             if 
//                 (profit[i] >profit[i-i]){

//                 }

//         }
//     }
// }

// import java.util.Scanner ;

// /**
//  * Solution
//  */
// public class Solution {

//     public static void main(String[] args) {
//        int n = 5 ;
//        int m = 4;
//        for (int i = 1; i<=n; i++) {
//         for (int j = 1; j <=m; j++) {
//           System.out.print("*");  
//         }
//         System.out.println();
//        }
//     }
// }

/**
 * Solution
 */
// public class Solution {

//     public static void main(String[] args) {
//         int n = 5;
//         int m = 5;

//         for (int i = 1; i<=n; i++) {

//             for (int j= 1; j <=m; j++) {
//                 if (i== 1 || j == 1|| i == n || j == m) {
//               System.out.print("*");
//                 }else{
//                 System.out.print(" ");
//                 }

//             }
// System.out.println();

//             }
//         }
//     }

/**
 * Solution
 */
// public class Solution {

//     public static void main(String[] args) {
//         int n = 6;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {

//                 System.out.print("*");

//             }
//             System.out.println();
//         }

//     }
// }

// /**
//  * Solution
//

// public class Solution {

//     public static void main(String[] args) {
//         int n = 5; 
//         for (int  i= 1; i <=n; i++) {
//             for ( int j = 1; j <=2*i-1; j++) {
              
//                System.out.print("*");

//             }
//         System.out.println();
//         }}}


