class Bank
{

   
    private int balance;
    Bank(int balance)
    {
        this.balance = balance;
    }
    
    void balance()
    {
        System.out.println("Balance : "+ balance);
    }
    void withdraw(int amount)
    {
        balance= balance-amount;
        System.out.println("withdraw :" + balance);
    }
    void  deposit(int amount)
    {
        balance = balance + amount;
        System.out.println("Deposit :"+ balance);
    }

   
}