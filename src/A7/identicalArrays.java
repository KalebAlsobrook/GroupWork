package A7;

import java.util.*;

/**
 *
 * @author Kaleb Alsobrook
 */
public class identicalArrays 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter list1: "); // 2 1 3
        int[] number1 = new int[scan.nextInt()];
        for (int i = 0; i < number1.length; i++) 
        {
            number1[i] = scan.nextInt();
        }
        
        System.out.print("Enter list2: ");
        int[] number2 = new int[scan.nextInt()];
        for (int j = 0; j < number2.length; j++) 
        {
            number2[j] = scan.nextInt();
        }

        if (equals(number1, number2) == true) 
        { // you pass the array names
            System.out.println("Arrays are identical!");
        } 
        else 
        {
            System.out.println("Arrays are NOT identical!");
        }

    }//:)

    public static boolean equals(int []list1, int []list2) //the method accepts 2 arrays
    {
        return java.util.Arrays.equals(list1, list2); //this method will return true or false if the arrays are equal or not
    }
}
