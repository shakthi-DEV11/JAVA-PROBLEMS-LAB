//07. Divisibility by 5 and 11
//
//Definition: Check whether a given number is divisible by both 5 and 11 without leaving a remainder.
//
//Example:
//
//Input: 55
//Output: Divisible by 5 and 11
package basicnumbers;
import java.util.Scanner;
class check{
  public  void Divisable(int num){
      if (num%5==0 && num%11==0){
          System.out.println(num + " "+"is divisable both 5 and 11.");

      }
  }
}
public class Divosable5and11 {
    static void main() {
        Scanner get = new Scanner(System.in);
        check put = new check();
        System.out.print("Enter a check number =");
        int num = get.nextInt();
        put.Divisable(num);
    }
}
