//04. Largest of Three Numbers
//
//Definition: Find the greatest value among three given numbers.
//
//Example:
//
//Input: 10, 25, 15
//Output: 25 is the Largest Number
package basicnumbers;
import java.util.Scanner;
class numberss{
    public void   LargestOfThree(int num1,int num2,int num3){
        if (num1>num2 && num1>num3) {
            System.out.println(num1+" "+"is a LargestOfThree.");

        } else if (num2>num1 && num2>num3) {
            System.out.println(num2+" "+"is a  LargestOfThree.");

        } else  {
            System.out.println(num3+" "+"is a  LargestOfThree.");

        }

    }
}
public class  LargestOfThree {
    static void main() {
        Scanner get = new Scanner(System.in);
        numberss put = new numberss();
        System.out.print("Enter a Checking Number 1 :");
        int num1 = get.nextInt();
        System.out.print("Enter a Checking Number 2 :");
        int num2 = get.nextInt();
        System.out.print("Enter a Checking Number 2 :");
        int num3 = get.nextInt();
        put. LargestOfThree(num1,num2,num3);
    }
}
