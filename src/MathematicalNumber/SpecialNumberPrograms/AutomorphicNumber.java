//### 04\. Automorphic Number
//**Definition:** A number is called an Automorphic Number if its square ends with the same digits as the original number.
//**Example:**
//Input: 25
//25 × 25 = 625
//Last two digits = 25
//Output: Automorphic Number
package MathematicalNumber.SpecialNumberPrograms;
import java.util.Scanner;
public class AutomorphicNumber {
    static void main() {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter a vlau =");
        int valu1 = get.nextInt();
        int multiple =valu1*valu1;
        int marge =multiple%100;

       if (marge == valu1){
           System.out.println("Automorphic Number");
       }else {
           System.out.println("Not aAutomorphic Number");
       }

    }
}
