package LoopNumbers;
import java.util.Scanner;
class sum{
    public int SumofDigit(int num){
        int sum =0;
        while (num>0){
            int lastdigit = num%10;
            sum = sum + lastdigit;
            num=num/10;
        }

        System.out.println(sum);
        return sum;
    }
}
public class SumofDigits {
    static void main() {
Scanner get = new Scanner(System.in);
sum put = new sum();
        System.out.print("Enter a value =");
        int num = get.nextInt();
        put.SumofDigit(num);

    }
}
