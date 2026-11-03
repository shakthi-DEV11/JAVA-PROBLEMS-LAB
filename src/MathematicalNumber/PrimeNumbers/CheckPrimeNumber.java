//26. Check Prime Number
//Definition: Check whether a given number is a Prime Number. A prime number has exactly two factors: 1 and itself.
//
//Example:
//Input: 7
//
//Factors: 1, 7
//
//Output: Prime Number
package MathematicalNumber.PrimeNumbers;
class prime{
    public void primenumber(int num){
        boolean istrue = true;
        if (num <= 1) {
            istrue = false;
        }
        for (int i = 2; i*i <=num ; i++) {
            if (num%i==0){
                istrue = false;
                break;
            }
        }
        if (istrue){
            System.out.println(num +" "+"is a prime number");
        }else {
            System.out.println(num +" "+"is not a prime number");
        }
    }
}
public class CheckPrimeNumber {
    static void main() {
        prime put = new prime();
        put.primenumber(4);
        put.primenumber(3);
    }
}
