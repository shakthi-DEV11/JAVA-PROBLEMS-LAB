package MathematicalNumber.GCDLCM;
//Find GCD of Two Numbers Using While Loop.
public class GCD {
    static void main() {
        int a = 12;
        int b= 18;
        int gcd =1;
        int i=1;
        while (i<=a && i<=b){
            i++;
            if (a%i==0&&b%i==0){
                gcd=i;
            }

        }
        System.out.println("GCD of Two Numbers ="+gcd);
    }
}
