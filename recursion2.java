/**
 * recursion2
 */
// public class recursion2 {
// public static void Tower(int n , String src , String helper , String dest) {
// if (n == 1) {
// System.out.println(" transerfer disk " + n + " from "+ src + " to "+ dest);
// return ;
// }
// Tower(n-1, src, dest, helper);
// System.out.println(" transerfer disk " + n + " from "+ src + " to "+ dest );
// Tower(n-1, helper, src, dest);

// }
// public static void main(String[] args) {
// int n = 2;
// Tower(n, "S", "H", "D");
// }
// }

// import java.util.HashSet;

/**
 * recursion2
 */
// public class recursion2 {
// public static void Revers(String str , int idx){
// if (idx== 0 ) {
// System.out.println(str.charAt(idx));
// return;
// }
// System.out.print(str.charAt(idx));
// Revers(str, idx- 1);
// }
// public static void main(String[] args) {
// String str = "abcd";
// Revers(str, str.length()-1);
// }
// }

// public class recursion2 {
// public static int first = -1;
// public static int last = -1;
// public static void getIndices(String str, char el, int idx) {
// if(idx == str.length()) {
// return;
// }
// if(str.charAt(idx) == el) {
// if(first == -1) {
// first = idx;
// } else {
// last = idx;
// }
// }
// getIndices(str, el, idx+1);
// }
// public static void main(String args[]) {
// String str = "tabcdfghijakkk";
// char el = 'a';
// getIndices(str, el, 0);
// System.out.println("First occurence : " + first);
// System.out.println("Last occurence : " + last);
// }
// }

// public class recursion2 {
// public static boolean checkIfIncreasing(int arr[], int idx) {

// if (idx == arr.length - 1) {
// return true;
// }
// if (!checkIfIncreasing(arr, idx + 1)) {
// return false;
// }
// return arr[idx] < arr[idx + 1];
// }

// public static void main(String args[]) {
// int arr1[] = { 1, 2, 3, 4, 5 };
// int arr2[] = { 1, 6, 3, 4, 5 };
// if (checkIfIncreasing(arr2, 0)) {
// System.out.println("Strictly Increasing");
// } else {
// System.out.println("NOT Strictly Increasing");
// }
// }
// }

// public class recursion2 {
// public static void MoveAll(String str, int idx, int count, String newString)
// {
// if (idx == str.length()) {
// for (int index = 0; index < count; index++) {
// newString+= 'x' ;
// }
// System.out.println(newString);
// return;
// }
// char currchar = str.charAt(idx);
// if (currchar == 'x') {
// count++;
// MoveAll(str, idx + 1, count, newString);
// } else {

// newString += currchar;
// MoveAll(str, idx + 1, count, newString);
// }
// }

// public static void main(String[] args) {
// String str = "axbcxxd";
// MoveAll(str, 0, 0, "");
// }
// }

// public class recursion2 {
// public static boolean[] map = new boolean[26];

// public static void RemoveallDublicate(String str, int idx, String newString)
// {
// if (idx == str.length()) {
// System.out.println(newString);
// return;
// }
// char currchar = str.charAt(idx);
// if (map[currchar - 'a']) {
// RemoveallDublicate(str, idx + 1, newString);
// } else {
// newString += currchar;
// map[(currchar - 'a')] = true;
// RemoveallDublicate(str, idx + 1, newString);
// }

// }

// public static void main(String[] args) {
// String str = "abbccda";
// RemoveallDublicate(str, 0, "");

// }
// }

// public class recursion2 {
// public static void SubSequances(String str, int idx, String newString) {
// if (idx == str.length()) {
// System.err.println(newString);
// return;
// }
// char currchar = str.charAt(idx);

// // to be
// SubSequances(str, idx + 1, newString + currchar);

// // not to be
// SubSequances(str, idx + 1, newString);

// }

// public static void main(String[] args) {
// String str = "abc";
// SubSequances(str, 0, "");
// }
// }
// import java.util.HashSet;

// public class recursion2 {
// public static void SubSequances(String str, int idx, String newString,
// HashSet<String> set) {
// if (idx == str.length()) {

// if (set.contains(newString)) {
// return;

// } else {
// System.out.println(newString);
// set.add(newString);
// return;
// }
// }
// char currchar = str.charAt(idx);
// SubSequances(str, idx + 1, newString + currchar, set);

// SubSequances(str, idx + 1, newString, set);

// }

// public static void main(String[] args) {
// String str = "aaa";
// HashSet<String> set = new HashSet<>();
// SubSequances(str, 0, "", set);
// }
// }





public class recursion2 {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

public static  void PrintCom(String str , int idx , String Combination ) {
if (idx == str.length()) {
    System.out.println(Combination);
    return;
}
char currchat = str.charAt(idx);
  String mapping   = keypad[currchat -  '0'];
for (int index = 0; index < str.length(); index++) {
    PrintCom(str, idx+1, Combination+mapping.charAt(index));
}
}

    public static void main(String[] args) {
String str = "23";
PrintCom(str, 0, "");
    }
}