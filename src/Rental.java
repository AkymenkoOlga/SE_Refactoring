public class Rental {
    private Movie movie;
    private int daysRented;


    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

    public double getCharge() {
        //return getMovie().getCharge(getDaysRented());
        return 0;
    }

    public int getFrequentRenterPoints() {
        //return getMovie().getFrequentRenterPoints(getDaysRented());
        return 0;
    }


}
