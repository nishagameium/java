import java.util.Scanner;

public class functions {
    // public static void printMyName(String name){
    //     System.out.println("Name = "+name);
    //     return;
    // }
    // public static int calculate(int a, int b){
    //     int sum = a +b;
    //     return sum;
    // }
    public static void printFactorial(int n){

        if(n <= 0){
            System.out.println("Invalid number");
            return;
        }

        int factorial = 1;
        for(int i=n ; i>=1 ;i--){
            factorial = factorial * i;
        }System.out.println(factorial);
    }
    public static void main(String[] args) {
        // Scanner s1 = new Scanner(System.in);
        // String name = s1.next();
        // printMyName(name);

        // System.out.println("==============");
        
        // Scanner s2= new Scanner(System.in);
        // int a = s2.nextInt();
        // int b = s2.nextInt();
        
        // int sum = calculate(a, b);
        // System.out.println("sum = "+sum);

        System.out.println("==============");
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();

        printFactorial(n);
    }
}
