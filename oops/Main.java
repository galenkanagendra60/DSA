
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
       Library library = new Library();
     int choice =0;
    
    while(choice!=7)
     {
        System.out.println("*****************");
        System.out.println("01.ADD THE NUMBER ");
        System.out.println("02.DISPLAY THE BOOKS");
        System.out.println("03.DELETE THE BOOK");
        System.out.println("*****************");
        choice= sc.nextInt();

        switch(choice)
        {
             
            case 1:
                System.out.print("Enter the book-id :");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the bookname :");
                String bookname = sc.nextLine();
                System.out.print("Enter the author :");
                String author = sc.nextLine(); 
                Book book = new Book( id,bookname,author);
                library.addbook(book);
                break;
            case 2: 
                    library.displaybooks();
                    break;
            case 3:
                System.out.println("ENTER THE BOOK-ID : ");
                id = sc.nextInt();
                library.deletebook(id);
                
            default:
                break;
        }
        }
        System.out.println("BREAK THE OUT OF LOOP :");
        }
        

     }

