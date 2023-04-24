import java.util.Arrays;

public class ArrayOperations
 {
    public static void main(String[] args) 
{
        int[] array = {4, 7, 2, 8, 5};
        
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Maximum value in array: " + max);
        
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("Minimum value in array: " + min);
        
        int sum = Arrays.stream(array).sum();
        System.out.println("Sum of values in array: " + sum);
        
        double avg = Arrays.stream(array).average().getAsDouble();
        System.out.println("Average of values in array: " + avg);
    }
}
