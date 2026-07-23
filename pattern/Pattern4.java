import java.util.Scanner;
class Pattern4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size n:");
        int n = sc.nextInt();
        /*int value=1;
        for(int i=0; i<n;i++)
        { 
              for(int j=0;j<=i;j++)
              {
                System.out.print(" "+ value);
                value++ ;
              }
              System.out.println();
        }
        */
     
       for(int i=0;i<n;i++)
       {
        for(char ch='A';ch<='A'+i;ch++)
        {
           System.out.print(ch);
           
        } 
        System.out.println();
       }

    }
}