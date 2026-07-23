import  java.util.Scanner;
class Pattern5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of n : ");
        int n = sc.nextInt();
        //for(int i=n;i>=0;i--)
        for(int i=0;i<n;i++)
        {
            //for(char ch='A';ch<='A'+i;ch++)
            for(char ch = 'A';ch<='A'+(n-i-1);ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
        }
    }
