import java.util.Arrays;

/**
 * TwoSum_Leet_Pr
 */
public class TwoSum_Leet_Pr {

    public static void main(String[] args) {
        
        int[] arr = {2,7,1,15};
        int[] result = sumOfTwo(arr);
        System.out.println(Arrays.toString(result));  
        
    }

    static int[] sumOfTwo(int[] arr){

        int targValue = 16;

        for (int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] +arr[j] == targValue){
                    return new int[] {i,j};
                }
            }
            
        }
        return new int[] {};
    }
}