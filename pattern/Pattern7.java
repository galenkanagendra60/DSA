import java.util.Scanner;
class Pattern7
{
    public static void main(String[] args)
    {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter the size of n : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(char ch= (char)('A'+n-1-i );ch<=(char)('A'+n-1);ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}