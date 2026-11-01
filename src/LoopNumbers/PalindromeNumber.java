package LoopNumbers;
import java.util.Scanner;
class digi{
    public void palindrome(int num){
        int revers = 0;
        int num2 = num;
        while (num>0){
            int lastdigit = num%10;
            revers = revers*10+lastdigit;
             num=num/10;
        }
        if (num2 == revers){
            System.out.println("yes Palindrome Number.");
        } else {
            System.out.println("N0t a Palindrome Number.");
        }
    }
}
public class PalindromeNumber {
    static void main() {
        Scanner get = new Scanner(System.in);
        digi put = new digi();
        System.out.print("Enter a value =");
        int num = get.nextInt();
        put.palindrome(num);
    }

}
