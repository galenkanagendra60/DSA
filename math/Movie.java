package math;

class Movie
{
    private int movieid;
    private String moviename;
    private int ticketprice;
    private int avaliableseats;

    public Movie(int movieid, String moviename, int ticketprice, int avaliableseats) {
        this.movieid = movieid;
        this.moviename = moviename;
        this.ticketprice = ticketprice;
        this.avaliableseats = avaliableseats;
    }
    int getmovieid()
    {
        return movieid;
    }
    String getmoviename()
    {
        return moviename;
    }
    int getticketprice()
    {
        return ticketprice;
    }
    int getavaliableseats()
    {
      return avaliableseats;
    }
    void setavaliableseats(int avaliableseats)
    {
        this.avaliableseats = avaliableseats;
    }
    void display()
    {
        System.out.println("------------------------");
        System.out.println("MOVIE-ID:"+movieid);
        System.out.println("MOVIE-NAME :"+moviename);
        System.out.println("TICKETPRICE :"+ticketprice);
        System.out.println("AVALIABLESEATS :"+avaliableseats);
        System.out.println("------------------------");
    }

}