public class Reverse_String {
    public static void main(String[] args) {

        //fibonacci series
        // int n = 10;
        // int a = 0;
        // int b = 1;
        // int c ;

        // System.out.print(a + ", " + b);

        // for(int i = 2; i <= n; i++){
        //     c = a + b;
        //     System.out.print(", "+c);
        //     a=b;
        //     b=c;
            
        // }


        //Ques:2 Prime no
        int n = 44;
        int flag = 0;
        int m =n/2; //which convert iteration into half

        if(n == 0 || n == 1) {
            System.out.println("No is not prime");
        }

        for(int i=2; i < m; i++){
            if(n % i == 0){
                System.out.println("Not prime");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Prime no");
        }
    }
}