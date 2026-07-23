class Library 
{
    Book[] books= new Book[100];
    int count = 0;

    void  addbook(Book book)
    {
        books[count] = book;
        count++;
        System.out.println("THE BOOK IS ADDED SUCUESSFULLY !!!");
    }
    void displaybooks()
    {
        if(count==0)
        {
            System.out.println("THERE IS NO BOOK !!!!");

        }
        for (int i = 0; i < count; i++)
        {
            books[i].displaybook();
            
        }

    }
    void deletebook(int id)
    {

        for(int i= 0; i < count ;i++)
        {
            if(books[i].getId()==id)
            {
                for(int j=i; j<count-1;j++)
                {
                    books[j]=books[j+1];
                }
                books[count-1]=null;
                count--;
                System.out.println("BOOK IS DELETED !!!!");
                return;

            }
        
        }
        System.out.println("BOOK IS NOT FOUND!!!");

    }

}
    
