// public class quicksort {
//     public static int partiontaion(int arr[], int low, int high) {
//         int pivate = arr[high];
//         int i = low - 1;
//         for (int j = low; j < high; j++) {
//             if (arr[j] < arr[pivate]) {
//                 i++;

//                 // swapping

//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;

//             }
//         }
//         i++;
//         int temp = arr[i];
//         arr[i] = arr[pivate];
//         arr[high] = temp;
//         return i;
//     }

//     public static void quickSort(int arr[], int low ,int high) {
//         if (low <high) {
//             int pidx = partiontaion(arr , low , high);
            
//                 quickSort(arr, low, pidx-1);
//                 quickSort(arr, pidx+1, high);

            
//         }
        
//     }

//     public static void main(String[] args) {
//         int arr[] = { 6, 3, 9, 5, 2, 8 };
//         int n = arr.length;
//         quickSort(arr, 0, n-1);
//         for (int  i = 0; i <n; i++) {
//             System.out.println(arr[i] + " ");
//         }
// System.out.println();
//     }

    
// }
