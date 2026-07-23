package Exception;
import java.util.Scanner;

class InvalidAmountException extends Exception{

    public InvalidAmountException(String message) {
        super(message);
    }
    
}

class InvalidBalanceException extends  Exception
{

    public InvalidBalanceException(String message) {
        super(message);
    }
}








class ATM
{
    private int balance;
    ATM(int balance)
    {
        this.balance = balance;
    }
    void withdraw(int amount) throws InvalidAmountException, InvalidBalanceException
    {
        if(amount<=0)
        {
            throw new InvalidAmountException("Amount should be greater than 0");
        }
        if(amount>balance)
        {
            throw new InvalidBalanceException("Amount is greater than balance");
        }
        balance = balance - amount;
        System.out.println("withdraw Successfully");
        System.out.println("BALANCE :"+balance);

    }
}




class ATMexcepiton
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       int balance= sc.nextInt();
       ATM atm = new ATM(balance);
       atm.withdraw();
   }

}