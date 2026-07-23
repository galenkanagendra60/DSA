
import java.util.Stack;

class Stacksimulation
{
    public static void main(String[] args)
    {
        Stack<String> books = new Stack<>();
        books.push("java");
        books.push("html");
        books.push("python");
        books.push("c");
        System.out.println("Books in the  stack:");
        System.out.println(books);
        while(!books.isEmpty())
        {
            String book = books.pop();
            System.out.println("REMOVED: "+book);
        }
        System.out.println("After the process:");
        System.out.println(books);
    }
}