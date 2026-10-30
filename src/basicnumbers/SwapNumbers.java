package basicnumbers;
import java.util.Scanner;
class num{
    public int  SwapNumbers(int a,int b){
       a = a+b;
       b = a-b;
       a = a-b;
        System.out.println("valu 1 ="+a);
        System.out.println("valu 2 ="+b);
       return a;

    }
}
public class SwapNumbers {
    static void main() {
        Scanner get = new Scanner(System.in);
        num put = new num();
        System.out.print("Enter a Swap Number 1 :");
        int a = get.nextInt();
        System.out.print("Enter a Swap Number 2 :");
        int b = get.nextInt();
        put.SwapNumbers(a,b);
    }
}
