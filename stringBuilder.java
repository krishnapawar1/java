/**
 * stringBuilder
//  */
// public class stringBuilder {

//     public static void main(String[] args) {
//         // StringBuilder sb = new StringBuilder("tony");
//         // System.out.println(sb);

//         // System.out.println(sb.charAt(0));
//         // // sb.setCharAt(0, 'p');

//         // // System.out.println(sb);

//         // System.out.println(sb.insert(2, 'n'));
//         // System.out.println(sb.delete(2, 3));
//         // System.out.println(sb);

//         // StringBuilder sb = new StringBuilder();
//         // sb.append("h");
//         // sb.append("e");

//         // sb.append("l");
//         // sb.append("l");
//         // sb.append("o");
//         // System.out.println(sb);

//         StringBuilder sb = new StringBuilder("hello");

//         for (int i = 0; i < sb.length() / 2; i++) {
//             int front = i;
//             int back = sb.length() - 1 - i;

//             char frontchar = sb.charAt(front);
//             char backchar = sb.charAt(back);

//             char frontchar1 = sb.charAt(front);
//             char backchar1 = sb.charAt(back);

//             sb.setCharAt(front, backchar);
//             sb.setCharAt(back, frontchar);

//         }
//         System.out.println(sb);

//     }
// }