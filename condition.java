import java.util.Scanner;

public class condition {
    
    public static void main(String[] args) {
       try (/* Scanner sc = new Scanner(System.in);
                int age = sc.nextInt();
                if (age > 18) {
                    System.out.println("Adult");
                }
                else
                {
                    System.out.println("Not adult");
                }*/
        Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
   
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
            System.out.println(a%b);
        }
     }
}
