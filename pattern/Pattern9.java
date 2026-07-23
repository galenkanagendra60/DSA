import java.util.Scanner;
class Pattern9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of n :");  
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            // print the left stars 
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            // print the spaces between the stars
            for(int j=0;j<2*(n-i-1);j++)
            {
                System.out.print(" ");
            }
            // print the right  stars
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++)
        {
            // print the left downward stars
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("*");
            }
            // print the spaces between the stars
            for(int j=0;j<2*(i);j++)
            {
                System.out.print(" ");
            }
            // print the right downward stars
            for(int j=n-i-1;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}