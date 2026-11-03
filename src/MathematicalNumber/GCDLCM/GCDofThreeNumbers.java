//22. GCD of Three Numbers
//Definition: Find the greatest common divisor that divides all three given numbers exactly.
//
//Example:
//Input: 12, 18, 24
//
//Output: GCD = 6
package MathematicalNumber.GCDLCM;

public class GCDofThreeNumbers {
    static void main() {
        int a  = 12;
        int b = 18;
        int c = 24;
        int gcd =1;
        for (int i = 1; i <=a && i<=b && i<=c; i++) {
            if (a%i==0 && b%i==0 && c%i==0){
                gcd =i;
            }

        }
        System.out.println("GCD of Three Numbers ="+gcd);
    }

}
