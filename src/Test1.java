/**
 * Created by TInf on 15.05.2017.
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

    @Test
    public void test() {
        //fail("Not yet implemented");
        String result;
        System.out.println("Welcome to the Movie Store");
        Movie m1 = new Movie("Terminator", 1);
        Movie m2 = new Movie("Terminator2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("Max");
        c1.addRental(r1);   c1.addRental(r2);
        System.out.println("Let's get the Statement");
        result = c1.statement();
        System.out.println(result);

    }

}