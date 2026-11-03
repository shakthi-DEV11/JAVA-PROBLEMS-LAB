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