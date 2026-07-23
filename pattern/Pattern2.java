import java.util.Scanner;
class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int start;
        // outer loop
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
                start=1;
            else
                start=0;
        for(int j=0;j<=i;j++)
        {
            System.out.print(" "+start+" ");
                start=1-start;
        }
           System.out.println();
        }

    }
}