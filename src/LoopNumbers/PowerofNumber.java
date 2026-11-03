//18. Power of a Number Without Math.pow()
//
//Definition: Calculate the power of a number using repeated multiplication without using the built-in Math.pow() method.
//
//Example:
//
//Input: Base = 2, Exponent = 3
//
//Calculation: 2 × 2 × 2
//
//Output: 8
package LoopNumbers;
class power{
    public void PowerofNumber( int instal, int power){

        int result = 1;
        for (int i = 0; i <power ; i++) {
result*=2;
        }
        System.out.println(result);
    }
}
public class PowerofNumber {
    static void main() {
        power get = new power();
        get.PowerofNumber(2,3);
        get.PowerofNumber(4,2);
    }
}
