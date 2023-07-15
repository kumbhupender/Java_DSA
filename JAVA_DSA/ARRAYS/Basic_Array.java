import java.util.Arrays;
import java.util.Scanner;

public class Basic_Array{

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //decleration of the arrays
        int[] arr = new int[5];
        
        System.out.println("Enter the Elements of the Arrays of size 5");

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println("Enter the number: ");
            arr[i] = sc.nextInt();
        }

        //for displaying the array
        System.out.println("Array are : " + Arrays.toString(arr));
    }
}