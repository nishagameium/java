import java.util.Scanner;

public class Loops {
    public static void main(String args[]){
       /*for(int i= 1; i < 11; i++) {
            System.out.print(" "+i);
        }
        */
       
        /*int i=1;
        while (i<11) {
            System.out.print(" "+i);
            i++;
        }*/
        /*int i=1;
        do{
            System.out.print(" "+i);
            i++;
        }while(i<11);*/
        
        /* 
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum= sum +i;
        }
        System.out.println(sum);
        */

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){
            System.out.println(n*i);
        }*/
    
        int no;
    /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i <=n ; i++){
            if (i%2 == 1) {
                System.out.println(i);
            }
        }*/

        // Scanner sc = new Scanner(System.in);
        // int n;
        // do{
        //     Scanner sc1 = new Scanner(System.in);
        //     int marks = sc1.nextInt();
        //     if (marks >=90) {
        //         System.out.println("Good");
        //     }
        //     else if(marks >=60){
        //         System.out.println("Also good");
        //     }
        //     else{
        //         System.out.println("Good as well");
        //     }

        // System.out.println("Enter 0 or 1: ");
        // n = sc.nextInt();
        // }while(n==1);         
       // }


       //Prime number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=0, flag=0;
        m=n/2;
        if(n==0 || n==1){  
            System.out.println(n+" is not prime number");      
        } 
        else 
        {  
            if(n%m==0){      
                System.out.println(n+" is not prime number");      
                flag=1;      
            }           
            if(flag==0)  { 
                System.out.println(n+" is prime number"); 
            }  
        }
       
    }
}
