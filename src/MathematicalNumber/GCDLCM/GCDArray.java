package MathematicalNumber.GCDLCM;

public class GCDArray {
    static void main() {
        int gcd =1;
        int []arr = {12,24,34,46};
        for (int i = 1; i <=arr[0] ; i++) {
            boolean comman = true;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[j]%i!=0){
                    comman =false;
                    break;
                }
            }
            if (comman){
                gcd=i;
            }

        }
        System.out.println("GCD of Two Numbers ="+gcd);
    }
}
