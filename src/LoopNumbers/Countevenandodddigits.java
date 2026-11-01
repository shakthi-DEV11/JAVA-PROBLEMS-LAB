package LoopNumbers;
class count{
    public void evenandoddcount(int num){
        int evencount=0;
        int oddcount =0;
        for (int i = 1; i <=num ; i++) {
            if (i%2==0){
                evencount++;
            } else if (i%2!=0){
                oddcount++;
            }
        }
        System.out.println("Even numbers count ="+evencount);
        System.out.println("Odd numbers count ="+oddcount);
    }
}
public class Countevenandodddigits {
    static void main() {
        count get = new count();
        get.evenandoddcount(100);
    }
}
