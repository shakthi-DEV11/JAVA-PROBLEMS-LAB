//21. GCD_LCM Problems
//01. GCD of Two Numbers
//Definition: Find the Greatest Common Divisor (GCD) of two given numbers. GCD is the largest number that divides both numbers exactly.
//
//Example:
//Input: 12, 18
//
//Factors of 12: 1, 2, 3, 4, 6, 12
//Factors of 18: 1, 2, 3, 6, 9, 18
//
//Output: GCD = 6
package MathematicalNumber.GCDLCM;
public class GCDofTwoNumbers {
    static void main() {
        int a  = 12;
        int b = 18;
        int gcd =1;
        for (int i = 1; i <=a && i<=b; i++) {
            if (a%i==0 && b%i==0){
                gcd =i;
            }

        }
        System.out.println("GCD of Two Numbers ="+gcd);
    }


}
