//### 05\. Neon Number
//**Definition:** A number is called a Neon Number if the sum of the digits of its square equals the original number.
//**Example:**
//Input: 9
//9 × 9 = 81
//Sum = 8 + 1 = 9
//Output: Neon Number
package MathematicalNumber.SpecialNumberPrograms;
import java.util.Scanner;
public class NeonNumber {
    static void main() {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter a value =");
        int valu = get.nextInt();
        int multiple = valu*valu;
        int sum = 0;
       while (multiple>0){
           int lastdigit = multiple%10;
           sum+=lastdigit;
           multiple/=10;

       }
       if (sum == valu){
           System.out.println("Neon Number");
       } else {
           System.out.println("Not a Neon Number.");
       }
    }
}
