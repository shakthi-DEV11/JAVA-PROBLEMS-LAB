package MathematicalNumber.GCDLCM;

public class GCDCOPRIME {
    static void main(String[] args) {
        int a = 7;
        int b=11;
        int gcd =1;
        for (int i = 1; i <=a && i<=b ; i++) {
            if (a%i==0&&b%i==0){
                gcd=i;
            }

        }
        if (gcd==1){
            System.out.println(gcd+" " +"GCD CO-PRIME NUMBER YESS");
        }else {
            System.out.println(+gcd +" "+"GCD CO-PRIME NUMBER NO");
        }
    }
}
