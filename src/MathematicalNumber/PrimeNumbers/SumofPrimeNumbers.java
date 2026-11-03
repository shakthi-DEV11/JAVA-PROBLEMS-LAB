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
