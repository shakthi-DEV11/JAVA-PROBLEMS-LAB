//08. Find the Last Digit
//
//Definition: Extract the last digit of a given number using the modulo operation.
//
//Example:
//
//Input: 1234
//Output: 4
package basicnumbers;
import java.util.Scanner;
class chec{
    public int lastdigit(int num){
        int lasddigit = num%10;
        System.out.println(lasddigit + " "+"is a Last digit");
        return lasddigit;
    }
}
public class LastDigit {
    static void main() {
        Scanner get = new Scanner(System.in);
        chec put = new chec();
        System.out.print("Enter a value =");
        int num = get.nextInt();
       put.lastdigit(num);
    }
}
