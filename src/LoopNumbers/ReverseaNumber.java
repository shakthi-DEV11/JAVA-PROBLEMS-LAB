//11. Reverse a Number
//
//Definition: Reverse the order of digits in a given number.
//
//Example:
//
//Input: 1234
//Output: 4321
package LoopNumbers;

import java.util.Scanner;
class departt{
    public void reversnumm(int num){
        int revers =0;
        while (num>0){
            int lastdigit = num%10;
            revers = revers *10 + lastdigit;
            num = num/10;

        }
        System.out.println( revers);
    }
}
public class ReverseaNumber {
    static void main() {
        Scanner get = new Scanner(System.in);
      departt put = new departt();
        System.out.print("Enter a value =");
        int num = get.nextInt();
        put.reversnumm(num);
    }
}

