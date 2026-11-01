package LoopNumbers;
import java.util.Scanner;
class numbers{
    public void armstrongnumber(int num){
        int num2 = num;
        int num3 = num;
        double sum =0;
        int count =0;
        while (num>0){
            int last = num%10;
            count++;
            num = num/10;

        }
        while (num2>0){
            int lastdigit = num2%10;
            sum+=(int) Math.pow(lastdigit,count);
            num2/=10;
        }
        if (num3 == sum){
            System.out.println(num3+" "+"is a Armstrong Number.");
        }else {
            System.out.println(num3+" "+"not a Armstrong Number.");
        }
    }
}
public class ArmstrongNumber {
    static void main() {
        Scanner get = new Scanner(System.in);
        numbers put = new numbers();
        System.out.print("Enter a value =");
        int num = get.nextInt();
        put.armstrongnumber(num);
    }
}
