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
