package basicnumbers;
import java.util.Scanner;
class numbers{
    public int EvenOdd(int num){
        if (num%2==0){
            System.out.println(num + " "+"is a even number.");
        } else if (num%2!=0) {
            System.out.println(num+" "+ "is a Odd number.");
        } else {
            System.out.println("Invalid number.");
        }
        return num;
    }

}
public class EvenOdd {
    static void main() {
        Scanner get = new Scanner(System.in);
      numbers put = new numbers();
        System.out.print("Enter a Checking Number :");
      int num = get.nextInt();
      put.EvenOdd(num);
    }
}
