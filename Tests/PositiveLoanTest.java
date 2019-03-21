import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class PositiveLoanTest {



        private double totalAmount;
        private double rate;
        private double monthlyAmount;
         private double amount;
         private int period;


        public PositiveLoanTest(double expectedTotalAmount,int period,double expectedAmount,double expectedRate,double expectedMonthlyAmount) {
            this.totalAmount = expectedTotalAmount;
            this.period=period;
            this.monthlyAmount = expectedMonthlyAmount;
            this.amount = expectedAmount;
            this.rate = expectedRate;
        }

        @Parameterized.Parameters (name= "{index}: checkInput({1})={0}")
        public static Collection<Object[]> getTestParameters() {
            return Arrays.asList(new Object[][] {
                    {664.49, 2,600,10.0,27.69},
                    {11322.74, 5,10000,5.0,188.71},
                    {527.50,1,500,10.0,43.96}


            });
        }

        @Test
        public void testcheckMonthlyPayment()
        {
            Loan positiveLoanTest = new Loan(amount,period);
            assertEquals(monthlyAmount,positiveLoanTest.getMonthlyPayment(),0.01);
        }

    @Test
    public void testcheck()
    {
        Loan positiveLoanTest = new Loan(amount,period);
        assertEquals(totalAmount,positiveLoanTest.getTotalPayment(),0.01);
    }


    @Test
    public void testcheckPeriodAmount()
    {
        Loan positiveLoanTest = new Loan(amount,period);
        assertEquals(rate,positiveLoanTest.getRate(),0.01);
    }


}

