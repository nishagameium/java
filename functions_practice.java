import java.util.Scanner;

public class functions_practice {
    
    public static int printTable(int n){
    
        for(int i=1 ; i <= n ; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
        return 1;

    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        
        printTable(n);
    }

    /* Print Odd Even number
    public static void OddEven(int n){
        if (n % 2 == 0) {
            System.out.println(n+" is Even number");
        }
        else
        {
            System.out.println(n+" is Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();

        OddEven(n);
    }
    */
}
