public class Palindrome {
    public static void main(String[] args) {
        
        int no = 454;
        int x =0;
        int r;
        int temp = no; //Storing the no in temp var

        while(no > 0) {
            r = no % 10;
            x = (x * 10) + r; //141
            no = no / 10;
        }

        if(x == temp ){
            System.out.println("No is palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
