import java.util.Scanner;
class Pattern8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of n :");
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("*");
            }
            // print the spaces 
            for(int j=0;j<2*i;j++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }                   
           
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            // print the spaces
            for(int j=0;j<2*(n-i-1);j++)
            {
                System.out.print(" ");
            }
            // print the stars
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}