package basicnumbers;
import java.util.Scanner;
class numm{
    public void SquareAndCube(int num){
        System.out.println("Square of"+" "+num +"=" +Math.pow(num,2));
        System.out.println("Square of"+" "+num +"=" +Math.pow(num,3));
    }
}
public class SquareAndCube {
    static void main() {
        Scanner get = new Scanner(System.in);
        numm put = new numm();
        System.out.print("Enter a Check Number :");
        int num = get.nextInt();
        put.SquareAndCube(num);
    }
}
