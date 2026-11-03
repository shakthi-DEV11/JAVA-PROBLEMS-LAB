//29. Sum of Prime Numbers
//Definition: Find the sum of all prime numbers within a given range.
//
//Example:
//Input:
//Start = 1
//End = 10
//
//Prime Numbers: 2, 3, 5, 7
//
//Sum = 2 + 3 + 5 + 7
//
//Output: 17
package MathematicalNumber.PrimeNumbers;
class countt{
    public void primenumbe(int num) {
        int count =0;
        for (int i = 2; i <=num ; i++) {
            boolean isprime = true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    isprime =false;
                    break;
                }

            }
            if (isprime){
                count+=i;

            }
        }
        System.out.println("Prime number count ="+count);
    }
}
public class SumofPrimeNumbers {
    static void main() {
        countt put = new countt();
        put.primenumbe(10);
    }
}
