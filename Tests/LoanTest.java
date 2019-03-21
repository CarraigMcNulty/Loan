import org.junit.Test;

import static org.junit.Assert.*;

public class LoanTest {

    Loan loan = new Loan(5000.00,4);

    Loan loan1 = new Loan();

    @Test
    public void testGetAmount() {assertEquals(5000.00, loan.getAmount(),0.1);}

    @Test
    public void testGetPeriod() {assertEquals(4, loan.getPeriod());}

    @Test
    public void testGetRate(){assertEquals(6.0,loan.getRate(), 0.1);}

    @Test
    public void testGetMonthlyPayment(){assertEquals(117.43,loan.getMonthlyPayment(), 0.1);}

    @Test
    public void testGetTotalPayment(){assertEquals(5636.41,loan.getTotalPayment(), 0.1);}


}

