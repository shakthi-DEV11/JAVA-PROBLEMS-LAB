//20. Largest Digit in a Number
//
//Definition: Find the maximum digit present in a given number.
//
//Example:
//
//Input: 58321
//Output: 8
package LoopNumbers;
class largest{
    public void largrstdigite(int num){
        int result =0;
        while (num>0){
            int lastdigit = num%10;
            if (result<lastdigit){
                result = lastdigit;
            }
            num/=10;

        }
        System.out.println(result);
    }
}
public class largestdigitinnumber {
    static void main() {
        largest put = new largest();
        put.largrstdigite(12345912);
    }
}
