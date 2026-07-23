import java.util.Scanner;
class Encapsulation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int balance = sc.nextInt();
        Bank b1 = new Bank(balance);
        b1.balance();
        b1.withdraw(amount);
        b1.deposit(amount);
        
        
        
    }
}