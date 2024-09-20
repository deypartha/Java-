// Bubble sort -------------------------
// public class array {
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int arr[] ={7,8,3,1,2} ;
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         printArr(arr);   
//     } 
// }


// selection Sort in java---------------------------
// class Main{
//     public static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int arr[] = {7,8,3,1,2};
//         for(int i=0;i<arr.length-1;i++){
//             int smallest = i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[smallest]>arr[j]){
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest]=arr[i];
//             arr[i]=temp;
//         }
//         printArray(arr);
//     } 
// }


// class Main{
//     public static int binarySearch(int arr[],int target){
//         int start=0;
//         int end = arr.length-1;
//         while(start<=end){
//             int mid = (start+end)/2;
//             if(arr[mid]==target){
//                 return mid;
//             }else if(arr[mid]>target){
//                 end = mid-1;
//             }else{
//                 start = mid+1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int target = 22;
//         int arr1[]={1,9,13,15,22,35,40};
//         System.out.print(binarySearch(arr1, target));
//     }
// }



// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[100];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[j]>arr[i]){
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


// recursion---------------------------------------
// import java.util.Scanner;
// class Hello{
//     public static int loop(int m){
//         if(m==0){
//             return 0;
//         }
//         System.out.print(m+" ");
//         return loop(m-1);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         loop(n);
//     }
// }


// import java.util.Scanner;
// class Hello{
//     public static int loop(int m){
//         if(m==6){
//             return 0;
//         }
//          System.out.print(m+" ");
//         return loop(m+1);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         loop(n);
//     }
// }


// import java.util.Scanner;
// class Hello{
//     public static int loop(int m){
//         if(m==0){
//             return 1;
//         }
//         //  System.out.print(m+" ");
//         return m*loop(m-1);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = 5;
//         System.out.print(loop(n));
//     }
// }


// class Hello{
//     public static int fibo(int a, int b, int n){
//         if(n==0){
//             return 0;
//         }
//         int sum = a+b;
//         System.out.print(sum+" ");
//         return fibo(b,sum, n-1);
//     }
//     public static void main(String[] args){
//         int a = 0;
//         int b= 1;
//         System.out.print(a+" "+b+" ");
//         int n = 10;
//         fibo(a,b,n-2);
//     }
// }