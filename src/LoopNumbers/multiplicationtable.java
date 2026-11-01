package LoopNumbers;
import java.util.Scanner;
class multiple{
    public void multiplication(int num){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i +"*"+num+"="+i*num);
        }
    }
}

public class multiplicationtable {
    static void main() {
        Scanner get = new Scanner(System.in);
        multiple put = new multiple();
        System.out.print("Enter a value =");
        int num = get.nextInt();
        put.multiplication(num);
    }
}
