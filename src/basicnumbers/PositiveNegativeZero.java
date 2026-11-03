//01. Positive, Negative or Zero
//
//Definition: Check whether a given number is positive, negative, or zero.
//
//Example:
//
//Input: -5
//Output: Negative Number
package basicnumbers;
import java.util.Scanner;
class checknumber{
    public int PositivNegativZer(int num ){
        if (num>0){
            System.out.println(num+" "+"is a positive number.");
        } else if (num<0) {
            System.out.println(num + " "+"is a Negative number.");
        } else if (num==0) {
            System.out.println(num+" "+"is a Zero number.");
        }
        return num;
    }
}
public class PositiveNegativeZero {
    static void main() {
        Scanner get = new Scanner(System.in);
        checknumber put = new checknumber();
        System.out.print("Enter a Checking Number :");
        int num = get.nextInt();
        put.PositivNegativZer(num);
    }
}
