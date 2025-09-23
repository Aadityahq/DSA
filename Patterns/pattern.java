package Patterns;
public class pattern {

    //Pyramid pattern
    static void pattern7(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2*i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }   
    }

    //inverted pyramid
    static void pattern8(int n)
    {
        for(int i = 1; i < n; i++)
        {
            for(int j = 1; j <  i ; j++)
            {
               System.out.print(" ");
            }

            for(int j = 1; j <= 2*n - 2*i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }   
    }

    //Diamond Star Pattern
    static void pattern9(int n)
    {
       pattern7(n);
       pattern8(n); 
    }

    //Half- Diamond Star pattern
    static void pattern10(int n)
    {
        for(int i = 1; i <= 2*n - 1  ; i++)
        {

            // if (i <= n)
            // {
            //     for(int j = 1; j <= i ; j++)
            //     {
            //             System.out.print("*"); 
            //     }
            // }
            // else
            // {
            //     for(int j = 1; j <= 2*n - i; j++)
            //     {
            //         System.out.print("*");
            //     }
            // }

            int stars = i;
          
          // for the second half of the rotated triangle.
            if(i>n) 
            {
                stars = 2*n-i;
            }
          
          // for printing the stars in each row.
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Binary Numver Triangle
    static void pattern11(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                int sum = i + j;
                if(sum % 2 == 0)
                    System.out.print(" 1 ");
                
                else
                    System.out.print(" 0 ");
                
            }
            System.out.println();
        }

    }

    //Number Crown Pattern
    static void pattern13(int n)
    {
        int number = 1;
        for(int i = 1; i <= n; i++)
        {
           
            for(int j = 1; j <= i ; j++)
            {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    //Increasing Letter Triangle
    static void pattern14(int n)
    {   
       
        for(int i = 1; i <= n; i++)
        {
            for(char ch = 'A' ; ch < 'A' + i; ch++)
            {
                System.out.print(ch + " ");
    
            }
            System.out.println();
        }
    }

    //Decreasing letter triangle
    static void pattern15(int n)
    {   
       
        for(int i = 1; i <= n; i++)
        {
            for(char ch = 'A' ; ch <= 'A' + n - i; ch++)
            {
                System.out.print(ch + " ");
    
            }
            System.out.println();
        }
    }

    //Alpha - Ramp Pattern
    static void pattern16(int n)
    {   
        char ch = 65;
        for(int i = 1; i <= n; i++)
        {
           for(int j = 1; j <= i; j++)
           {
             System.out.print(ch + " ");
           }
            ch++;
            System.out.println();
        }
    }


    public static void main(String[] args) {
        //pattern7(5);
        //System.out.println();
        //pattern8(5);
        //pattern9(5);
        //pattern10(5);
        //pattern11(5);
        //pattern13(5);
        //pattern14(5);
        // pattern15(5);
        pattern16(5);

        
       
    }
    
}