// public class mergesort {
//     public static void Conquer(int arr[],int si ,int ei,int mid){
// int merged []= new int[ei-si +1];
//   int idx1= si ;
//   int idx2= mid +1 ;
//   int x = 0;

//   while(idx1<=mid && idx2<=ei){
//     if(arr[idx1]<=arr[idx2]){
//         merged[x++] =arr[idx1++];

//     }else{
//         merged[x++]=arr[idx2++];
//     }
  
//   while (idx1<=mid) {
//     merged[x++]= arr[idx1++];
//   }
// while (idx2<=ei) {
//     merged[x++]=arr[idx2];
// }
//     }
//     for (int i= 0, j=0 ; i < merged.length; i++  ,j++) {
//         arr[j]=merged[i];
        
//     }
    
//     }

//     public static void divide(int arr[], int si, int ei ) {
//         if (si <= ei) {
//             return;
//         }

//               mid = si + (ei - si) / 2;
//         divide(arr, si, mid, ei);
//         divide(arr, si, ei, mid + 1);
//     Conquer(arr,si,mid,ei);

//     }

//     public static void main(String[] args) {
//         int arr[] = {6,3,9,5,2,8};
//         int n = arr.length;
//         divide(arr, , n-1);
//         for (int  index = 0; index < n; index++) {
//             System.out.println(arr[index] + " ");
//         }
//         System.out.println();
//     }
// }
