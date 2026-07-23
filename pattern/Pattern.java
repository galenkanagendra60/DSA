import java.util.Scanner;
class Pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of n:");
        int n= sc.nextInt();
        for(int i=0;i<n;i++) // i=2
        {
            for(int j=0;j<=i;j++) // 0<=1
            { 
               System.out.print("*");
            }
            System.out.println(" ");
        }
         /* right side triangle
        for(int i=1;i<=n;i++)
        {
            // spaces 
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            // print stars
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        */
       
       
    }
}