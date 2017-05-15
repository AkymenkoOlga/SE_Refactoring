/**
 * Created by TInf on 15.05.2017.
 */
interface Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    abstract int getFrequentRenterPoints(int daysRented);
}
