//16. Factorial of a Number
//
//Definition: Calculate the product of all positive integers from 1 to the given number.
//
//Example:
//
//Input: 5
//
//Calculation: 5 × 4 × 3 × 2 × 1
//
//Output: 120
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
