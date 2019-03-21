import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class NegativeLoanTest {
    private double amount;
    private int period;


    public NegativeLoanTest(double Amount, int period) {
        this.amount = Amount;
        this.period=period;

}

    @Parameterized.Parameters (name= "{index}: checkInput({1})={0}")
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][] {
                {499.00, 3},
                {11000.00 , 3},
                {'a', 5},
                {null , 2},//Doesnt run null argument in amount
                {-1, 2},
                {600.00 , 0},
                {10000.00, 7},
                {9000.00 ,'b'},
                {6000.00,null},//Doesnt run null argument in amount
                {500.00 , -5},
                {499.00,5},
                {10001.00 , -5},
                {500.00,0},
                {500.00 , 6},


        });
    }

    @Test (expected = IllegalArgumentException.class)
    public void testcheckPeriodAmount()
    {
        Loan negativeLoanTest = new Loan(amount,period);
    }

}