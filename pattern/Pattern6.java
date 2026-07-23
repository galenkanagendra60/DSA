import java.util.Scanner;
class Pattern6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of n : ");
        int n = sc.nextInt();
        /*for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
           {
            System.out.print((char)character);
           }
           character++;
            System.out.println();   
        }
        */
       for(int i=0;i<n;i++)
       {
        // print the  left spaces
        for(int j=0; j<n-i-1; j++)
        {
            System.out.print(" ");
        }
        // create the breakpoint for the stars 
        char ch='A';
        int breakpoint = (2*i+1)/2;
        // print the stars 
        for(int j =1 ; j <=2 * i + 1; j++)
        {

            System.out.print(ch);
            if(j<=breakpoint)
            {
                ch++;
            }
            else
            {
                ch--;
            }

        }
        // print the right spaces 
        for(int j=0;j<n-i-1;j++)
        {
            System.out.print(" ");
        }
        System.out.println();
       }
    }
}