import java.util.Scanner;

public class functions_practice {

    public static void printPrimeNumber(int n) {
        int m = 0, flag = 0;
        m = n / 2;
        if (n == 1 || n == 0) {
            System.out.println(n + " is not prime number");
        } else {
            if (n % m == 0) {
                System.out.println(n + " is not prime number");
                flag = 1;
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }
    }

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();

        printPrimeNumber(n);
    }
    /*
     * Print table
     * public static int printTable(int n){
     * 
     * for(int i=1 ; i <= n ; i++){
     * System.out.println(n+" * "+i+" = "+n*i);
     * }
     * return 1;
     * 
     * }
     * 
     * public static void main(String[] args) {
     * Scanner s1 = new Scanner(System.in);
     * int n = s1.nextInt();
     * 
     * printTable(n);
     * }
     */

    /*
     * Print Odd Even number
     * public static void OddEven(int n){
     * if (n % 2 == 0) {
     * System.out.println(n+" is Even number");
     * }
     * else
     * {
     * System.out.println(n+" is Odd number");
     * }
     * }
     * public static void main(String[] args) {
     * Scanner s1 = new Scanner(System.in);
     * int n = s1.nextInt();
     * 
     * OddEven(n);
     * }
     */

}
