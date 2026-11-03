//### 02\. Strong Number
//**Definition:** A number is called a Strong Number if the sum of the factorials of its digits equals the original number.
//**Example:**
//``` text
//Input: 145
//1! = 1
//4! = 24
//5! = 120
//Sum = 1 + 24 + 120 = 145
//Output: Strong Number
package MathematicalNumber.SpecialNumberPrograms;
import java.util.Scanner;
public class StrongNumber {
    static void main() {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter a value = ");
        int valu = get.nextInt();
        int valu2 = valu;

        int sum =0;
        while (valu>0){
            int factorial = 1;
            int lastdigit = valu%10;
            for (int i = 1; i <=lastdigit ; i++) {
                factorial*=i;
            }
            sum+=factorial;
            valu=valu/10;
        }
        if (valu2 == sum){
            System.out.println("Strong number");
        }else {
            System.out.println("Not a Strong number");
        }

    }
}
