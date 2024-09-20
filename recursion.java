import java.util.Scanner;
class world{
    public static int calPower(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xpower1 = calPower(x,n-1);
        int xpown = x*xpower1;
        return xpown;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1=sc.nextInt();
        int n1=sc.nextInt();
        System.out.println(calPower(x1,n1));
    }
}