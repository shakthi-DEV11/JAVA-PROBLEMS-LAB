package basicnumbers;
import java.util.Scanner;
class depart{
    public void reversnum(int num){
        int revers =0;
        while (num>0){
            int lastdigit = num%10;
            revers = revers *10 + lastdigit;
            num = num/10;

        }
        System.out.println( revers);
    }
}
public class ReversNumbers {
    static void main() {
        Scanner get = new Scanner(System.in);
       depart put = new depart();
        System.out.print("Enter a value =");
        int num = get.nextInt();
        put.reversnum(num);
    }
}
