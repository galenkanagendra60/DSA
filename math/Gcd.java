package math;
import java.util.Scanner;
class Gcd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // This code is of gcd of two numbers
        /*System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        for(int i = Math.min(a, b); i >= 1; i--)
        {
            if (a % i == 0 && b % i == 0)
            {
                System.out.println("The GCD of " + a + " and " + b + " is: " + i);
                break;
            }
        }
        */
       // this code is for armstrong number 
       System.out.print("Enter the input value : ");
       int n = sc.nextInt();
       int rem, sum =0;
       int originalnumber=n;
       while(n!=0)
       {
         rem= n%10;
         sum = sum + (rem*rem*rem);
         n=n/10;
       }
       if(originalnumber==sum)
       {
         System.out.println(originalnumber + " is an Armstrong number");
       }
       else
       {
         System.out.println(originalnumber + " is not an Armstrong number");
       }                        

    }
}