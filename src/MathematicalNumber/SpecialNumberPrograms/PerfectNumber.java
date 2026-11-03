//01. Perfect Number
//
//Definition: A number is called a Perfect Number if the sum of its proper divisors (excluding itself) is equal to the original number.
//
//Example:
//
//Input: 28
//Divisors: 1, 2, 4, 7, 14
//Sum: 1 + 2 + 4 + 7 + 14 = 28
//
//Output: Perfect Number
package MathematicalNumber.SpecialNumberPrograms;

public class PerfectNumber {
    static void main() {
        int num = 28;
        int sum =0;
        //int fac =1;
        for (int i = 1; i <num ; i++) {
                 if (num%i==0){
                       sum+=i;
                     System.out.print(i+"+");
                 }

        }

        if (sum == num){
            System.out.println("="+sum+" "+"prefect number .");
        } else {
            System.out.println("not a prefect number.");
        }
    }
}
