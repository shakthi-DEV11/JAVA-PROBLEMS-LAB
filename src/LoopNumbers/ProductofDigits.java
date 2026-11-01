package LoopNumbers;
import java.util.Scanner;
class summ{
    public int productofDigit(int num){
        int sum =1;
        while (num>0){
            int lastdigit = num%10;
            sum = sum *lastdigit;
            num=num/10;
        }

        System.out.println(sum);
        return sum;
    }
}
public class ProductofDigits {

    static void main() {
        Scanner get = new Scanner(System.in);
        summ put = new summ();
        System.out.print("Enter a value =");
        int num = get.nextInt();
        put.productofDigit(num);

    }
}


