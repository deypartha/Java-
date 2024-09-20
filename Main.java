
// import java.util.Arrays;
// public class first {
//    public static void main(String[] args) {
//       int[] marks = new int[3];
//       boolean[] age = new boolean[5];
//       marks[0] = 97;
//       marks[1]  =92;
//       marks[2] = 99;
//       age[0] = true;
//       age[1]  = false;
//       age[2] = true;
//       System.out.println(marks[0]);
//       // System.out.println(marks[4]);
//       System.out.println(marks.length);
//       System.out.println(age[0]);
//       System.out.println(age[3]);
//       Arrays.sort(marks);
//       System.out.println(marks[0]);
//    }
// }


// public class first {
// public static void main(String[] args) {
//    int[] arr = {10,20,30};
//    System.out.println(arr[2]);
// }
// }


// casting in java(when we add two num in double data type then it is no problem
// but if we add int and double then it is not possible because
// size of double is 8 and int is 4 so you can put (int) before the double value
// and if you want to add double and int then no problem occur)
// public class first {
//    public static void main(String[] args) {
//       double a = 25.0;
//       double b=a;
//       System.out.println(a+b);
//       int a1= 55;
//       int b1 = a1 + (int)25.11;
//       System.out.println(b1);
//       int a2=85;
//       double a3 = a2+25;
//       System.out.println(a3);
//    }
// }



// public class first {
// public static void main(String[] args) {
//    int a = 5;
   // int b = 2;
   // int sum = a+b;
   // int div = a/b;
   // System.out.println(sum);
   // System.out.println(div);
   // float sum1 = a+b;
   // float div1 = a/b;
   // System.out.println(div1);
   // double sum2 = a+b;
   // double div2 = a%b;
   // System.out.println(div2);
   // a++;
   // System.out.println(a++) ;
   // ++a;
   // System.out.println(++a);
// }
// }


// math in-built function (max, min, random)------------------------
// public class first {
//    public static void main(String[] args) {
//       // System.out.println(Math.max(55,98));
//       // System.out.println(Math.min(55,98));
//       // System.out.println((int)(Math.random()));
//       System.out.println((int)(Math.random()*100));
//    }
// }


// for taking input from user------------------------
// import java.util.Scanner;
// public class first {
//    public static void main(String[] args) {
//       Scanner fun = new Scanner(System.in); 
//       System.out.println("Input your age: ");
//       int age= fun.nextInt();
//       System.out.println("Age is: "+age);
//    }
// }


// import java.util.Scanner;
// public class first{
//    public static void main(String[] args){
//       Scanner ss = new Scanner(System.in);
//       int num = ss.nextInt();
//       System.out.println("nuber is: "+num);
//    }
// }



// import java.util.Scanner;
// public class first{
//    public static void main(String[] args){
//       // boolean isSunUp = true;
//       // if(isSunUp==true){
//       //    System.out.println("It's day now.");
//       // }
//       // else{
//       //    System.out.println("It's night now");
//       // }

//       // int age = 18;
//       // if(age>=18){
//       //    System.out.println("You can vote");
//       // }
//       // else{
//       //    System.out.println("You can't vote");
//       // }

//       // int a = 50;
//       // int b = 48;
//       // if(a>45 && b>45){
//       //    System.out.println("Both are greater than 45");
//       // }
//       // else if(a>45 && b<45){
//       //    System.out.println("a is greater than 45 but not b");
//       // }
//       // if(a>45 || b>45){
//       //    System.out.println("atleast one is greater than 45");
//       // }

//       // Scanner ss = new Scanner (System.in);
//       // int cash = ss.nextInt();
//       // if(cash < 10){
//       //    System.out.println("Can't buy nothing");
//       //    System.out.println("you get more cash");
//       // }
//       // else if(cash > 10 && cash < 50){
//       //    System.out.println("You can buy only one thing");
//       // }
//       // else{
//       //    System.out.println("You can buy anything");
//       // }

//       // int i;
//       // for(i=0;i<10;i++){
//       //    System.out.println(i);
//       // }

//       // int i=1;
//       // int sum = 0;
//       // while(i<=10){
//       //    sum+=i;
//       //    i++;
//       // } 
//       // System.out.println("Sum is : "+sum);

//       // int i = 1;
//       // do{
//       //    if(i%2==0){
//       //       System.out.println(i);
//       //    }
//       //    i++;
//       // }while(i<=10);

//       Scanner num = new Scanner(System.in);
//       System.out.println("num is: ");
//       int input=0; 
//       do { 
//          input = num.nextInt();
//           System.out.print("Num is always positive: ");
//           System.out.println(input);
//       } while (input>=0);
//       System.out.print("The End");
//    }
// }


// public class Main{
//    public static void main(String[] args){
//        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//        for(int i=0;i<3;i++){
//            int sum = 0;
//            for(int j=0;j<3;j++){
//                sum+=arr[i][j];
//                System.out.println(" "+sum);
//            }
//        }
//    }
// }


// import java.util.Scanner;
// public class Main{
//     public static void add(int p){
//         for(int i=1;i<=10;i++){
//             System.out.println(p+"*"+i+" = "+i*p);
//         }
//     }
//     public static void main(String[] args){
//         System.out.println("Hello World");
//         Scanner input = new Scanner(System.in);
//         int inp = input.nextInt();
//         System.out.println("Table of: "+inp);
//         add(inp);
        
//     }
// }


// public class Main{
//     public static void main(String[] args){
//         for(int i=1;i<5;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print("* ");
//             }
//             System.out.print("\n");
//         }
//     }
// }


// public class Main{
//     public static void main(String[] args){
//         int a = 10;
//         int b = 5;
//         int result = (a*b)/(a-b);
//         System.out.println(result);
//     }
// }


// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         String inp = input.nextLine();
//         System.out.print("Hello "+inp);
//     }
// }


// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner sss = new Scanner(System.in);
//         int a = sss.nextInt();
//         int b = sss.nextInt();
//         int sum = a+b;
//         System.out.print("sum is: "+sum);
//     }
// }


// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner sss = new Scanner(System.in);
//         int age = sss.nextInt();
//         if(age<=18){
//             System.out.println("Not Adult");
//         }else{
//             System.out.println("Adult");
//         }
//     }
// }

// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner sss = new Scanner(System.in);
//         int num = sss.nextInt();
//         if(num%2==0){
//             System.out.print("Even num");
//         }else{
//             System.out.print("Odd num");
//         }
//     }
// }


// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner sss = new Scanner(System.in);
//         int a=sss.nextInt();
//         int b = sss.nextInt();
//         if(a==b){
//             System.out.println("Equal");
//         }
//         else if(a>b){
//             System.out.print("A is greater");
//         }
//         else{
//             System.out.println("B is greater");
//         }
//     }
// }


// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner sss = new Scanner(System.in);
//         int press = sss.nextInt();
//         // if(press == 1){
//         //     System.out.println("Hello");
//         // }else if(press==2){
//         //     System.out.println("Namastey");
//         // }else if(press==3){
//         //     System.out.println("Bonjour");
//         // }else{
//         //     System.out.println("Invalid Output");
//         // }
//         switch(press){
//             case 1: System.out.println("Hello");
//             break;
//             case 2: System.out.println("Namastey");
//             break;
//             case 3: System.out.println("Bonjour");
//             break;
//             default: System.out.println("Invalid Input");
//             break;
//         }
//     }
// }


// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int
//     }
// }


// patterns of java--------------
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter row: ");
//         int row =sc.nextInt();
//         System.out.print("enter col: ");
//         int col = sc.nextInt();
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// hollow pattern---------------------------
// *****
// *   *
// *   *
// *****
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("enter row: ");
//         // int row =sc.nextInt();
//         // System.out.print("enter col: ");
//         // int col = sc.nextInt();
//         int row = 4;
//         int col = 5;
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 if(i==0 || j==0 || j==col-1 || i==row-1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// right angle triangle-------------------
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter row: ");
//         int row =sc.nextInt();
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// pattern of reverse right angle triangle-------------------
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter row: ");
//         int row =sc.nextInt();
//         for(int i=row;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// reverse pattern-----------------
//    *
//   **
//  ***
// ****
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter row: ");
//         int row =sc.nextInt();
//         for(int i=1;i<=row;i++){
//             for(int s= row-i;s>=1;s--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// 1
// 1 2
// 1 2 3
// 1 2 3 4
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter row: ");
//         int row =sc.nextInt();
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// 1
// 2 3
// 4 5 6 
// 7 8 9 10
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter row: ");
//         int row =sc.nextInt();
//         int num = 1;
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }


// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter row: ");
//         int row =sc.nextInt();
//         for(int i=1;i<=row;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j)%2==0){
//                     System.out.print("1 ");
//                 }
//                 else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         Scanner ss = new Scanner(System.in);
//         int r=ss.nextInt();
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             int space = 2*(r-i); 
//             for(int b=1;b<=space;b++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=r;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             int space = 2*(r-i);
//             for(int j=1;j<=space;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//     *****
//    *****
//   *****
//  *****
// *****
// class Main{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             // int space = 2*(n-i);
//             for(int j=n-i;j>=1;j--){
//                 System.out.print(" ");
//             }
//             for(int j = 1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=n-i;j>=1;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//     1 
//   2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5
// class Main{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// functions----------------
// import java.util.Scanner;
// class Main{
//    public static void printMyName(String name){
//       System.out.println("My name is: "+name);
//       return;
//    }
//    public static void main(String[] args){
//       Scanner sc = new Scanner (System.in);
//       String name = sc.next();
//       printMyName(name);
//    }
// }


// import java.util.Scanner;
// class Main{
//     public static void printSum(int a, int b){
//         System.out.println("sum is: "+(a+b));
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int aa = sc.nextInt();
//         int bb = sc.nextInt();
//         printSum(aa,bb);
//     }
// }


// import java.util.Scanner;
// class Main{
//     public static void printFact(int a){
//         int result = 1;
//         for(int i=1;i<=a;i++){
//             result*=i;
//         }
//         System.out.println("Factorial of the number is: "+result);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int aa = sc.nextInt();
//         // int f = printFact(aa);
//         printFact(aa);
//     }
// }


// arrays----------------------
// import java.util.Scanner;
// class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int size=sc.nextInt();
//         int[] marks = new int[size];
//         marks[0] = 97;
//         marks[1] = 95;
//         marks[2] = 98;
//         for(int i=0;i<size;i++){
//             System.out.println(marks[i]);
//         }
//     }
// }


// find the index of target value---------------------
// import java.util.Scanner;
// class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int size=sc.nextInt();
//         int[] nums = new int[size];
//         for(int i=0;i<size;i++){
//             nums[i] = sc.nextInt();
//         }
//         System.out.print("Enter target value: ");
//         int target = sc.nextInt();
//         for(int i=0;i<size;i++){
//             if(nums[i]==target){
//                 System.out.print(i);
//                 break;
//             }
//         }
//     }
// }


// first print a 2d array and then find an array element from the 2d array---------------------------
// import java.util.Scanner;
// class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         int[][] arr = new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         // for(int i=0;i<row;i++){
//         //     for(int j=0;j<col;j++){
//         //         System.out.print(arr[i][j]+" ");
//         //     }
//         //     System.out.println();
//         // }
//         System.out.print("Enter target ele: ");
//         int target = sc.nextInt();
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 if(arr[i][j]==target){
//                     System.out.print("index is: "+(i+","+j));
//                     break;
//                 }
//             }
//         }
//     }
// }


// transpose of a 2d array-------------------------
// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int r=sc.nextInt();
//         int c=sc.nextInt();
//         int[][] arr = new int[r][c];
//         for(int i =0 ; i<r;i++){
//             for(int j= 0;j<c;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Original array: ");
//         for(int i =0 ; i<r;i++){
//             for(int j= 0;j<c;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println("Transpose array is: ");
//         for(int i =0 ; i<r;i++){
//             for(int j= 0;j<c;j++){
//                 System.out.print(arr[j][i]+" ");
//             }
//             System.out.println();
//         }
//     }
// }