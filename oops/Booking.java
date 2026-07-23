import math.Movie;

package oops;
class Booking
{
    private String customername;
    private Movie movie;
    private int tickets;
    private double totalamount;
    
    void bookingticket(String customername,Movie movie,int tickets)
    {
        if(tickets>movie.getavaliableseats())
        {
            System.out.println("NO Seats Avaliable !!!");
            return;
        }
        this.customername = customername;
        this.movie = movie;
        this.tickets = tickets;
        totalamount= tickets * movie.getticketprice();
        movie.setavaliableseats(movie.getavaliableseats()-tickets);
        System.out.println("BOOKED SUCCESSFULLY !!!!");

    }
    void displaybooking()
    {
        if(movie == null)
        {
            System.out.println("TICKET IS NOT BOOKED !!!");
            return;
        }
        System.out.println("---------------------------");
        System.out.println("CUSTOMER-NAME :"+customername);
        System.out.println("MOVIE :"+movie);
        System.out.println("NO.OF TICKETS ::"+tickets);
        System.out.println("TOTAL-AMOUNT :"+totalamount);
        System.out.println("---------------------------");
    }

}