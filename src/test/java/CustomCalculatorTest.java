import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator cal;

    @Test
    public void 더하기테스트(){
        CustomCalculator customCalculator = new CustomCalculator();
        int result = customCalculator.add(3, 4);
        assertTrue(result == 7);
    }

    @Test
    public void 빼기테스트(){
        CustomCalculator customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(4,3);
        assertTrue(result == 1);
    }

}