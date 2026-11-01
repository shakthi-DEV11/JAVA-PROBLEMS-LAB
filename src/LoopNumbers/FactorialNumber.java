package LoopNumbers;
import java.util.Scanner;
class duplicat{
    public void factorialnumber(int num){
        int sum = 0;
        int factorial =1;
        for (int i = 1; i <=num ; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

    }
}
public class FactorialNumber {
    static void main() {
        Scanner get = new Scanner(System.in);
        duplicat put = new duplicat();
        System.out.print("Enter a value =");
        int num = get.nextInt();
        put.factorialnumber(num);
    }
}
