//27. Prime Numbers in a Range
//Definition: Print all prime numbers between a given starting number and ending number.
//
//Example:
//Input:
//Start = 1
//End = 20
//
//Output:
//2, 3, 5, 7, 11, 13, 17, 19
package MathematicalNumber.PrimeNumbers;
class primee{
    public void primenumberr(int num) {
        for (int i = 2; i <=num ; i++) {
            boolean isprime = true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    isprime =false;
                    break;
                }

            }
            if (isprime){
                System.out.println(i+" ");
            }
        }

    }
}
public class PrimeRange {
    static void main() {
        primee put = new primee();
        put.primenumberr(10);
    }
}