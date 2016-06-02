package wirth_countingthenegativepowerofnumbertwo;

import java.util.Scanner;

/**
 *
 * @author yngbear
 */
public class Wirth_CountingTheNegativePowerOfNumberTwo {
    
    public static void main(String[] args) {
        final int exponentValue;
        int index1, index2, remainder;
                
        System.out.println("Give an exponent value");
        Scanner in = new Scanner(System.in);
        exponentValue = in.nextInt();
        
        int[] number = new int[exponentValue];
        System.out.println("The negative power values of the number two "
                + "by using exponent " + exponentValue + ", are:");
        
        for(index1 = 0; index1 < exponentValue; index1++){
            System.out.print(".");
            remainder = 0;
            for(index2 = 0; index2 < index1; index2++) {
                remainder = 10 * remainder + number[index2];
                number[index2] = remainder / 2;
                remainder = remainder - 2 * number[index2];
                System.out.print(number[index2]);
            }
            number[index1] = 5;
            System.out.println(5);
        }
    }    
}
