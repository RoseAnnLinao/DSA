package sum_ave_max;

/**
 *
 * @author User
 */
import java.util.*;
import java.util.Random;
public class Sum_Ave_Max {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = { 10, 100, 50, 33, 5 };
        int sum = 0; int max = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
            System.out.println("array["+i+"]= " + array[i]);
            sum += array[i];
        }
        double average = (double) sum / array.length;
        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Max = " + max);
    }
    
}