
import java.util.ArrayList;

class Book
{
    int id;
    String author;
    String title;

    Book(int id,String author,String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }
    
}


class LibraryMangment
{
    public static void main(String[] args) 
    {
       ArrayList<Book>books = new ArrayList<>();
       books.add(new Book(101, "charles darvin","THE MEN"));
       books.add(new Book(102, "tony Stark","IRONMAN"));
       books.add(new Book(103, "mangrous","KERALA VIBES"));
       books.add(new Book(104, "charles ","THE HUMAN THINGS"));
       for(Book b:books)
       {
            System.out.println(b.id+" "+b.title+" "+b.author);
       }



    }
}
