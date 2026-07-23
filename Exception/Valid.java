package Exception;
import java.util.Scanner;


class InvalidloginException extends Exception
{
    InvalidloginException(String  message){
       super(message);
    }
}
class Login
{
    private String username = "nagendra";
    private String password= " 1234567";
    public void validation(String  user, String pass) throws InvalidloginException{
        if(!username.equals(user)|| !password.equals(pass))
        {
            throw new InvalidloginException("Invalid username or password");
        }
        System.out.println("LOGIN SUCCESSFULLY !!");

    }
}


class Valid 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       Login login = new Login();
       System.out.println("Enter the username : !!!");
       String user = sc.nextLine();
       System.out.println("Enter the password  : !!!");
       String pass = sc.nextLine();
       try
       {
         login.validation(user,pass);
       }
       catch(InvalidloginException e)
       {
        System.out.println(e.getMessage());
       }

    }
}