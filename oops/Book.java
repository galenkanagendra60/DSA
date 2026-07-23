class Book
{
    private int id;
    private String bookname;
    private String author;

    Book(int bookid,String bookname,String author) {
        this.id=bookid;
        this.bookname = bookname;
        this.author = author;
    }
    int getId()
    {
        return id;
    }
    String getbookname()
    {
        return bookname;
    }
    String getauthor()
    {
        return author;
    }

    void displaybook()
    {
        System.out.println("Book-ID : "+id);
        System.out.println("Book-Name : "+bookname);
        System.out.println("Author : "+ author);
    }
        

  

}