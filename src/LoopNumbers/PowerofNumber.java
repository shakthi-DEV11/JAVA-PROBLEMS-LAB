package LoopNumbers;
class power{
    public void PowerofNumber( int instal, int power){

        int result = 1;
        for (int i = 0; i <power ; i++) {
result*=2;
        }
        System.out.println(result);
    }
}
public class PowerofNumber {
    static void main() {
        power get = new power();
        get.PowerofNumber(2,3);
        get.PowerofNumber(4,2);
    }
}
