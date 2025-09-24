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

    static void pattern17(int n)
    {
        
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print("  ");
            }
            char ch = 'A';
            int breakPoint = (2*i-1)/2;

            for(int j = 1; j <= 2*i - 1; j++)
            {
                System.out.print(" "+ch);
                if(j <= breakPoint)
                    ch++;
                else
                    ch--;
            }
            
            System.out.println();
        }
    }

    static void pattern18(int n)
    {
        
        //char ch = 'E';
        for(int i = 0; i < n; i++)
        {
            for(char ch = (char) ('A'+n-1 - i); ch <=  (char)('A' + n -1) ; ch++) //'A'+n-1 = E
            {
                System.out.print(ch + " ");
      
            }
            
            System.out.println();
        }
        
    }

    static void pattern21(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 1 || j == 1 || i == n || j == n)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }



//symmetric - void pattern 
static void pattern19(int n)
{

    //upper half
    int spc = 0;
    for(int i = 0; i < n; i++)
    {
        for(int j = 1; j <= n - i; j++)
        {
            System.out.print("*");
        }
        for(int j = 0; j < spc; j++)
        {
            System.out.print(" ");
        }
        for(int j = 1; j <= n-i; j++)
        {
            System.out.print("*");
        }
        spc += 2;
        System.out.println();
    }

    spc = 2*n - 2;
     for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i; j++)
        {
            System.out.print("*");
        }
        for(int j = 0; j < spc; j++)
        {
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++)
        {
            System.out.print("*");
        }
        spc -= 2;
        System.out.println();
    }
}
  
//Symmetric Butterfly pattern
    static void pattern20(int n)
    {
        //Upper Half
        int spc = 2*n - 2;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for(int j = 0; j < spc; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            spc -= 2;
            System.out.println();
        }

        //Lower Half 
        spc = 1;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print("*");
            }
            for(int j = 0; j <= spc; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print("*");
            }
            spc += 2;
            System.out.println();
        }
    }

    //Number-Crown Pattern 
    static void pattern12(int n)
    {
        int spc = 2*n - 2;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            for(int j = 1; j <= spc; j++)
            {
                System.out.print(" ");
            }
             for(int j = i; j >= 1; j--)
            {
                System.out.print(j);
            }
            spc -=2;
            System.out.println();
        }
    }

    //The Number pattern 
    static void pattern22(int n)
    {
        for(int i = 0; i < 2*n - 1; i++)
        {
            for(int j = 0; j < 2*n-1; j++)
            {
            
             int top = i;
             int bottom = j;
             int right = (2*n - 2) - j;
             int left = (2*n - 2) - i;
             System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");

            }
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
        //pattern15(5);
        //pattern16(5);
        //pattern17(4);
        //pattern18(9);
        //pattern21(4);
        //pattern19(5);
        //pattern20(5);
        //pattern12(4);
        pattern22(4);
        


        
       
    }
    
}