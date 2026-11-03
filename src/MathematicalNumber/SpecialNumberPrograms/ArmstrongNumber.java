//### 03\. Armstrong Number
//**Definition:** A number is called an Armstrong Number if the sum of each digit raised to the power of the total number of digits equals the original number.
//**Example:**
//Input: 153
//1³ = 1
//5³ = 125
//3³ = 27
//Sum = 1 + 125 + 27 = 153
//Output: Armstrong Number
package MathematicalNumber.SpecialNumberPrograms;

import java.util.Scanner;
class numberss{
    public void armstrongnumber(int num){
        int num2 = num;
        int num3 = num;
        double sum =0;
        int count =0;
        while (num>0){
            int last = num%10;
            count++;
            num = num/10;

        }
        while (num2>0){
            int lastdigit = num2%10;
            sum+=(int) Math.pow(lastdigit,count);
            num2/=10;
        }
        if (num3 == sum){
            System.out.println(num3+" "+"is a Armstrong Number.");
        }else {
            System.out.println(num3+" "+"not a Armstrong Number.");
        }
    }
}
public class ArmstrongNumber {
    static void main() {
        Scanner get = new Scanner(System.in);
       numberss put = new numberss();
        System.out.print("Enter a value =");
        int num = get.nextInt();
        put.armstrongnumber(num);
    }
}
