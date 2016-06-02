package wirth_selectiveupdating;

import java.util.Scanner;
/**
 *
 * @author yngbear
 */
public class Wirth_SelectiveUpdating {
    public static void main(String[] args) {
        
        int[] setOfValues = {1, 2, 3, 4, 5, 6};
        boolean whetherTheValueIsInTheArray = false;
        int searchedValue;
        
        System.out.println("Give the searched value");
        Scanner in = new Scanner(System.in);
        searchedValue = in.nextInt();
        
        for(int x : setOfValues) {
            if(x == searchedValue) {
                whetherTheValueIsInTheArray = true;
                break;
            }
        }
        if(whetherTheValueIsInTheArray)
            System.out.println("The searched value is in the array");
        else
            System.out.println("The searched value isn't in the array");
    }
}
