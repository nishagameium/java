public class patter_practice {
    public static void main(String[] args) {
       // int n=5;
             
        // l1
        // for(int i=1; i<=5 ; i++){
        //     for(int j=1; j<=n-i; j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for (int j=1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n; i++){  
        //     for(int j=1; j<=n-i; j++){
                
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
                
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // } 


        // for(int i=1;i<=n; i++){  
        //     for(int j=1; j<=n-i; j++){
                
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){
                
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 
        // for(int i=n;i>=1; i--){  
        //     for(int j=1; j<=n-i; j++){
                
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){
                
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n =4 ;
        // int m =5 ;
        // for(int i=1;i<=n; i++)
        // {
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=m; j++) 
        //     {
        //         if ( i==1 || j==1 || i==n || j==m )  
        //         {
        //             System.out.print("*");
        //         } else 
        //         {
        //             System.out.print(" "); 
        //         } 
        //     }
        //     System.out.println(); 
        // }

        // int n=5;
        // for(int i=1; i<=n ; i++){
        //     for(int j=1; j<=n-i; j++)
        //     {
        //         //System.out.print(j+" ");
        //         System.out.print(i);
        //     }
        //     for(int j=1; j<=n-i; j++)
        //     {
        //         System.out.print(" ");
        //     }System.out.println();
        // }

        int n=5;
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=n; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
