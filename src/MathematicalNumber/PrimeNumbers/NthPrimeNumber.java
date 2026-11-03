//30. Nth Prime Number
//Definition: Find the prime number at a given position in the sequence of prime numbers.
//
//Example:
//Input: N = 5
//
//Prime Numbers:
//2, 3, 5, 7, 11
//
//Output: 11
package MathematicalNumber.PrimeNumbers;

public class NthPrimeNumber {
    public static boolean isprime(int num){
        if (num<2){
            return false;
        }

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    static void main() {
        int n= 5;
        int count = 0;
        int num =1;
        while (count<n){
        num++;
        if (isprime(num)){
            count++;
        }
        }

        System.out.println(n + "th Prime Number: " + num);
    }
}
