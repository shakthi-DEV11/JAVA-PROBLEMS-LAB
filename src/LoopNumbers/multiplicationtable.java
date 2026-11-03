//17. Multiplication Table
//
//Definition: Print the multiplication table of a given number.
//
//Example:
//
//Input: 5
//
//Output:
//5 × 1 = 5
//5 × 2 = 10
//5 × 3 = 15
//5 × 4 = 20
//5 × 5 = 25
//...
//5 × 10 = 50
package LoopNumbers;
import java.util.Scanner;
class multiple{
    public void multiplication(int num){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i +"*"+num+"="+i*num);
        }
    }
}

public class multiplicationtable {
    static void main() {
        Scanner get = new Scanner(System.in);
        multiple put = new multiple();
        System.out.print("Enter a value =");
        int num = get.nextInt();
        put.multiplication(num);
    }
}
