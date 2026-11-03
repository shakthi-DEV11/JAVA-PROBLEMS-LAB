//03. Largest of Two Numbers
//
//Definition: Find the greatest value between two given numbers.
//
//Example:
//
//Input: 10, 20
//Output: 20 is the Largest Number
package basicnumbers;
import java.util.Scanner;
class number{
    public void  LargestOfTwo(int num1,int num2){
       if (num1>num2) {
            System.out.println(num1+" "+"is a LargestOfTwo.");

        } else if (num2>num1) {
            System.out.println(num2+" "+"is a LargestOfTwo.");

        } else if (num1 == num2) {
           System.out.println("both number of equal.");

       }

    }
}
public class LargestOfTwo {
    static void main() {
        Scanner get = new Scanner(System.in);
        number put = new number();
        System.out.print("Enter a Checking Number 1 :");
        int num1 = get.nextInt();
        System.out.print("Enter a Checking Number 2 :");
        int num2 = get.nextInt();
        put.LargestOfTwo(num1,num2);
    }
}
