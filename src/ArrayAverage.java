import java.util.*;

public class ArrayAverage 
{
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        int average;
        
        System.out.print("Insert Array: ");
        int numbers[] = new int[scan.nextInt()];
        ArrayAverage.fillArray(numbers);
        average = findAverage(numbers);
        System.out.print("\n The Average is: " + average + "\n");
        ArrayAverage.printArray(numbers);
    }
    
    public static void fillArray(int list[])
    {
        for (int i = 0; i < list.length; i++)
        {
            list[i] = scan.nextInt();
        }
    }
    
    public static int findAverage(int list[])
    {
        int total = 0;
        for(int i = 0; i < list.length; i++)
        {
            total = total + list[i];
        }
        total = total / (list.length);
        return total;
    }
    
    public static void printArray(int list[])
    {
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
    }
}
