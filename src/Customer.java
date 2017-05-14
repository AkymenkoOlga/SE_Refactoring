import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Customer {
    private String name;
    private List<Rental> rentals;

    public Customer (String name){
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }
    public String getName (){
        return name;
    }

    public String statement() {
        StringBuilder builder = new StringBuilder();
            builder.append("Rental Record for ");
            builder.append(this.name);
            builder.append("\n");
            builder.append("\t");
            builder.append("Title");
            builder.append("\t");
            builder.append("\t");
            builder.append("Days");
            builder.append("\t");
            builder.append("Amount");


        for (Rental rental : rentals){
            builder.append("\n");
            builder.append(rental.getMovie().getTitle());
            builder.append("\t");
            builder.append("\t");
            builder.append(rental.getDaysRented());
            builder.append("\t");
            builder.append(Double.toString(rental.getCharge()));
        }

             builder.append("\n");
             builder.append("Amount owed is: ");
             builder.append(Double.toString(getTotalCharge()));
             builder.append("\n");
             builder.append("You earned ");
             builder.append(Double.toString(getTotalFrequentRenterPoints()));
             builder.append(" frequent renter points");
             builder.append("\n");

             return builder.toString();
    }

    private double getTotalCharge() {
        double result = 0;
        for (Rental rental: rentals) {
            result = result + rental.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints(){
        int result = 0;
        for (Rental rental: rentals) {
            result = result + rental.getFrequentRenterPoints();
        }
        return result;
    }


    private double amountFor(Rental each) {
        double thisAmount = 0;
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (each.getDaysRented() > 2)
                    thisAmount += (each.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += each.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (each.getDaysRented() > 3)
                    thisAmount += (each.getDaysRented() - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

}
    