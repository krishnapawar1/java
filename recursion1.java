/**
//  * recursion1
//  */
// // public class recursion1 {
// // public static void printNum(int n) {
// // if (n == 0) {
// // return;
// // }
// // System.out.println(n);
// // printNum(n - 1);

// // }

// // public static void main(String[] args) {
// // int n = 5;
// // printNum(n);
// // }
// // }

// /**
//  * recursion1
//  */
// // public class recursion1 {
// // public static void printNum(int n ){
// // if (n == 6) {
// // return ;
// // }
// // System.out.println(n);
// // printNum(n +1);
// // }
// // public static void main(String[] args) {
// // int n = 1;
// // printNum(n);
// // }
// // }

// /**
//  * recursion1
//  */
// // public class recursion1 {
// // public static void printSum(int i, int n , int sum) {
// // if (i == n) {
// // sum +=i;
// // System.out.println(sum);
// // return;
// // }
// // sum +=i ;
// // printSum(i+1, n, sum);
// // }
// // public static void main(String[] args) {
// // printSum(2, 6, 0);

// // }
// // }

// /**
//  * recursion1
//  */
// //

// // class Recursion1 {
// // public static void printFactorial(int n, int fact) {
// // if(n == 0) {
// // System.out.println(fact);
// // return;
// // }
// // fact *= n;
// // printFactorial(n-1, fact);
// // }
// // public static void main(String args[]) {
// // printFactorial(5, 1);
// // }
// // }

// /**
//  * recursion1
//  */
// // public class recursion1 {
// // public static void printfib(int a, int b, int n) {
// // if (n == 0) {
// // return ;
// // }
// // int c = a + b ;
// // System.out.println(c);
// // printfib(b, c, n-1);

// // }

// // public static void main(String[] args) {
// // int a = 0;
// // int b = 1;
// // System.out.println(a);
// // System.out.println(b);
// // int n = 7;
// // printfib(a, b, n-2);
// // // System.out.println(n);

// // }

// // }

// /**
//  * recursion1
//  */
// // public class recursion1 {

// // public static int powerCal(int x , int n){
// // if (n == 0) {
// // return 1;
// // }
// // if (x == 0) {
// // return 0 ;
// // }
// // int powernm1= powerCal(x, n-1);
// // int Xpower = powernm1 * x ;
// // return Xpower;

// // }
// // public static void main(String[] args) {
// // int x = 3 , n = 5;
// // int ans = powerCal(x, n);
// // System.out.println(ans);
// // }}

// // class Recursion1 {
// // public static int printPower(int x, int n) {
// // if(n == 0) {
// // return 1;
// // }
// // if(n % 2 == 0) {
// // return printPower(x, n/2) * printPower(x, n/2);
// // }
// // else {
// // return x * printPower(x, n/2) * printPower(x, n/2);
// // }
// // }
// // public static void main(String args[]) {
// // int x = 2, n = 5;
// // int output = printPower(x, n);
// // System.out.println(output);
// // }
// // }