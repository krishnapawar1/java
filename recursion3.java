// public class recursion3 {
//     public static void printPer(String str, String permutation) {

//         if (str.length() == 0) {
//             System.out.println(permutation);
//             return;
//         }
//         for (int index = 0; index < str.length(); index++) {

//             char currChar = str.charAt(index);
//             String newString= str.substring(0, index) + str.substring(index + 1);
//             printPer(newString, permutation + currChar);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         printPer(str, "");
// }





// public class recursion3 {
//     public static int Countpath(int i, int j, int n, int m) {
//         if (i == n || j==m) {
//             return 0 ;  
//           }
//         if (i== n-1 &&  j == m- 1) {
//             return 1 ;
//         }

//         // downdord

//         int down = Countpath(i + 1, j, n, m);

//         // rightword

//         int right = Countpath(i, j + 1, n, m);

//         return down + right;

//     }

//     public static void main(String[] args) {
// int n = 3 ; int m = 3; 
//  int Return = Countpath(0, 0, n, m);
//  System.out.println(Return);
//     }
// }






// public class recursion3 {
//     public static int PLacetiles(int n, int m) {
//         if (n== m ) {
//             return 2;

//         }
//         if (n<m ) {
//             return 1;
//         }
//         int placehorizental = PLacetiles(n - m, m);

//         int placevertical = PLacetiles(n - 1, m);

//         return placehorizental + placevertical;
//     }

//     public static void main(String[] args) {
// int n = 4 , m = 2;
// int tiles = PLacetiles(n, m);
// System.out.println(tiles);
//     }
// }






// public class recursion3{
//     public static int Guestinvite (int n  ){
//         if (n <=1  ) {
//             return 1;
//         }
// int ways1 = Guestinvite(n-1);
//  int ways2 =  (n-1) *Guestinvite(n-2);
//  return ways1 +ways2;
//     }
//     public static void main(String[] args) {
//         int  n = 4;

//         int Invite =  Guestinvite(n);
//         System.out.println(Invite);
//     }
// }








// import java.util.ArrayList;

// public class recursion3 {

//     public static void printSubsets(ArrayList<Integer> subset) {
//         for (int i = 0; i < subset.size(); i++) {
//             System.out.print(subset.get(i) + " ");
//         }
//         System.out.println();
//     }

//     public static void findSubsets(int n, ArrayList<Integer> subset) {
//         if (n == 0) {
//             printSubsets(subset);
//             return;
//         }

//         findSubsets(n - 1, subset);
//         subset.add(n);
//         findSubsets(n - 1, subset);
//         subset.remove(subset.size() - 1);
//     }

//     public static void main(String args[]) {
//         int n = 3;
//         findSubsets(n, new ArrayList<Integer>());
//     }
// }
