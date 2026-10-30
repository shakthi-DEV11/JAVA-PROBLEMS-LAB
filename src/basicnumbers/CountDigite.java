package basicnumbers;
import java.util.Scanner;
class nummm{
    public void countdigit(int num){
        int count =0;
        while (num>0){
            int lastdigit = num%10;
            count++;
            num=num/10;

        }
        System.out.println(count+" "+"is a total count digit.");
    }

}
public class CountDigite {
    static void main() {
        Scanner get = new Scanner(System.in);
        nummm put = new nummm();
        System.out.print("Enter a value =");
        int num = get.nextInt();
        put.countdigit(num);
    }
}
