package Task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoRadixTestPositive {
    @Test
    public void doMath() throws Exception {
        assertEquals("Radix: 3.0 and -1.0",new DoRadix().DoMath(new TaskEquation(1,-2,-3)));
    }
}