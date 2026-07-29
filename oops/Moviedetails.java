import java.util.Scanner;

import oops.Booking;
class Moviedetails
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Movie movie1 = new Movie(101,"KANTHRA",100,50);
        Movie movie2= new Movie(102,"MS.DHONI",100,60);
        Movie movie3 = new Movie(103,"THE LION KING",100,70);
        Movie movie4 = new Movie(104,"KOTHA",100,40);
        Booking  booking = new Booking();
        while(true)
        {
            System.out.println("--------------------");
            System.out.println("01.VIEW MOVIE");
            System.out.println("02.BOOK TICKETS");
            System.out.println("03.VIEW BOOKING");
            System.out.println("--------------------");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: movie1.display();
                        movie2.display();
                        movie3.display();
                        movie4.display();
                       break;
                case 2: 
                        System.out.println("ENTER THE CUSTOMER-NAME");
                        String customername = sc.nextLine();
                        System.out.println("ENTER THE MOVIE ID ");
                        int movieid = sc.nextInt();
                        System.out.println("ENTER THE NO.TICKETS:");
                        int tickets = sc.nextInt();
                        if(movieid== 101)
                        {
                        booking.bookingticket(customername,movie1,tickets);  
                        }
                        if(movieid==102)
                        {
                        booking.bookingticket(customername,movie2,tickets);
                        }
                        if(movieid==103)
                        {
                        booking.bookingticket(customername,movie3,tickets);
                        }
                        if(movieid==104)
                        {
                        booking.bookingticket(customername,movie4,tickets);
                        }
                        else
                        {
                            System.out.println("INVALID MOVIE ID");
                        }
                        break;
                case 3:
                    booking.displaybooking();
                    break;
                case 4:
                    System.out.println("THANKYOU");
                    System.exit(0);
                default:
                    System.out.println("INVALID CHOICE:");
                

                        
            }
        }
    }
}