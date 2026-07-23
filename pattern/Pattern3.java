import java.util.Scanner;
class Pattern3
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        // left side triangle
        for (int i=1;i<=n;i++)
        {
            // Print Stars 
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            // print spaces 
            for(int j=0;j<2*(n-i);j++)
            {
                System.out.print(" ");
            }
            // print Stars 
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        

    }
}