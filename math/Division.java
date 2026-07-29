package math;
import java.util.Scanner;
class Division
{
    public  static void main(String[] args)
    {
        // To find the factors of a number 
        /*for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println("Factors of " + n + " are " + i);
            }
        }
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input value :  ");
        int n= sc.nextInt();
       // TO check whether the number is prime or not 
       for(int i=2;i<=n/2;i++)
       {
           if(n%i==0)
           {
               System.out.println(n + " is not a prime number");
               return;
           }
       }
       System.out.println(n + " is a prime number");

    }
}