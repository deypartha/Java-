// class Pen{
//     String type;
//     String color;
//     public void write(){
//         System.out.println("Write anything . . .");
//     }
//     public void getcolor(){
//         System.out.println(this.color);
//     } 
//     public void gettype(){
//         System.out.println(this.type);
//     }
// }
// class Student{
//     String name;
//     int age;
//     Student(String n, int a){
//         this.name = n;
//         this.age = a;
//     }
//     public void getInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
// }
// public class oops {
//     public static void main(String[] args){
//         // Pen p1 = new Pen();
//         // p1.color = "Blue";
//         // p1.getcolor();
//         // p1.type = "Gel";
//         // p1.gettype();
//         // p1.write();

//         Student s1 = new Student();
//         s1.name = "Ram";
//         s1.age = 25;
//         s1.getInfo();
//         Student s2 = new Student("Krisna", 20);
//         s2.getInfo();
//     }
// }



// import java.util.Scanner;
// class max{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int max = arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }