package MathematicalNumber.PrimeNumbers;
class count{
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
                count++;

            }
        }
        System.out.println("Prime number count ="+count);
    }
}
public class CountPrimeNumbers {
    static void main() {
        count put = new count();
        put.primenumbe(10);
    }
}
