import java.util.Arrays;

public class P1_Swap_Values {
    public static void main(String[] args) {
        //Ques : Swap the values at the given index
        int[] arr = {10,20,50,60,40,80,30};

        int i1 = 0;
        int i2 = 6;
        swapValues(arr, i1, i2);
        System.out.println(Arrays.toString(arr));

    }

    static void swapValues(int[] arr , int i1 , int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
