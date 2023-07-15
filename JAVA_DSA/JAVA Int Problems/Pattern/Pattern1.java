import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        
        //Print star pattern
        /*
         * 
         * *
         * * *
         * * * *
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the row no");
         int row = sc.nextInt();
        //  System.out.println("Enter the no of columns");
        //  int col = sc.nextInt();

         for(int i = 1; i <= row; i++) {
            for(int j = 1 ; j <= i; j++){
                System.out.println("*");
            }
         }
         System.out.println();

    }
}