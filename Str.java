// import java.util.Scanner;
// class Str{
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         // String name1 = sc.next();
//         // System.out.println("name is: "+name1);
//         String name2 = sc.nextLine();
//         System.out.println("My name is: "+name2);
//     }
// }


// concatenation of two string------------------------------
// import java.util.Scanner;
// class Str{
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter First name: ");
//         String name1 = sc.next();
       
//         System.out.print("Enter Last name: ");
//         String name2 = sc.next();
//         System.out.println();
//         String FullName = name1+" @ "+name2;
//         System.out.println("My name is: "+FullName);
//         System.out.println(FullName.length());
//     }
// }


// print the string using loop------------------------------
// import java.util.Scanner;
// class Str{
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         String name = sc.nextLine();
//         for(int i=0;i<name.length();i++){
//             System.out.println(name.charAt(i));
//         }
//     }
// }


// compare two string---------------------
// class Str{
//     public static void main(String[] args){
//         // String name1 = "Hello";
//         // String name2 = "Hello ";
//         // name1.compareTo(name2) == 0------ equal
//         // name1.compareTo(name2) > 0------ name1 > name2 ---- return a positive value (any +ve num)
//         // name1.compareTo(name2) < 0------ name1 < name2----- return a negative value (any -ve num)
//         // if(name1.compareTo(name2)==0){
//         //     System.out.println("Strings are same");
//         // }else if((name1.compareTo(name2))>0){
//         //     System.out.println("strings are positive value");
//         // }else{
//         //     System.out.println("strings returns negative value");
//         // }
//         // System.out.println(name1.compareTo(name2));


//         // if(name1 == name2){
//         //     System.out.println("Strings are same");
//         // }else {
//         //     System.out.println("Not same");
//         // }


//         // if((new String("Tony"))==(new String("Tony"))){
//         //     System.out.println("Both are same");
//         // }else{
//         //     System.out.println("Not same");
//         // }


//         String st = "hello, How are you?";
//         // System.out.println(st.substring(7, st.length()));
//         // System.out.println(st.substring(0, 5));
//         // System.out.println(st.substring(7));
//     }
// }



// StringBuilder in java--------------------
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         StringBuilder sd = new StringBuilder("hello");
//         System.out.println(sd);
        // change char into a specific index--------------
        // System.out.println(sd.charAt(1));
        // sd.setCharAt(0,'K');
        // System.out.println(sd);
        
        // insert any char in a string------------- 
        // sd.insert(0, 'K');
        // System.out.println(sd);
        
        // insert any char in a string-------------
        // sd.insert(1, 'N');
        // System.out.println(sd);
        
        // delete any char of a string with starting and ending index value---
        // sd.delete(1,2);
        // System.out.println(sd);
        
        // append at last of a string---------------
        // sd.append("e");
        // sd.append("l");
        // sd.append("l");
        // sd.append("o");
        // System.out.println(sd);
        // System.out.println(sd.length());
        
        // for(int i= sd.length()-1;i>=0;i--){
        //     System.out.print(sd.charAt(i));
        // }
        
//         for(int i=0;i<sd.length()/2;i++){
//             int front = i;
//             int back = sd.length() - 1 - i;
//             char frontChar = sd.charAt(front);
//             char backChar = sd.charAt(back);
//             sd.setCharAt(front, backChar);
//             sd.setCharAt(back, frontChar);
//         }
//         System.out.print(sd);
//     }
// }




// pattern------------------------------------------

// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int b=n-i;b>=1;b--){
//                 System.out.print(" ");
//             }
//             for(int b=n-i;b>=1;b--){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int b=0;b<n-i;b++){
//                 System.out.print(" ");
//             }
//             for(int b=0;b<n-i;b++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// left shift and right shift---------------------------------
// import java.util.Scanner;
// class Str{
//         public static void main(String[] args){
//                 Scanner sc = new Scanner(System.in);
//                 int n = sc.nextInt();
//                 // for left shift operator n<<1;
//                 System.out.print("For leftShift optr: ");
//                 System.out.println(n<<1);
//                 // for right shift operator n>>1
//                 System.out.print("For rightShift optr: ");
//                 System.out.println(n>>1);
//         }
// }


// getbit()-------------------------------------------
// bitmask and (& opr) to check the 3 index of a num is 0 or 1---(get position using pos)----------------
// import java.util.*;
// class Str{
//     public static void main(String[] args) {
//         int num = 11;
//         int pos = 2;
//         int bitmask = 1<<pos;
//         if((bitmask & num)==0){
//                 System.out.println("3rd index is zero");
//         }
//         else{
//                 System.out.println("bit is one");
//         }
//     }
// }


// setbit()-------------------------------------------
// bitmask and( | opr) to check the new number which was created by set a bit-------(pos is changable)---------
// class Str{
//         public static void main(String[] args){
//                 int n = 8;
//                 int pos = 2;
//                 int bitmask = 1<<pos;
//                 int newNum = bitmask | n;
//                 System.out.println(newNum);
//         }
// } 


// clear bit()----------------------------------------------------------
// class Str{
//         public static void main(String[] args) {
//             int n= 10;
//             int pos= 2;
//             int bitmask = 1<<pos;
//             int notBit = ~(bitmask);
//             int newNum = notBit & n;
//             System.out.println(newNum);
//         }
// }


//