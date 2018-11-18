package Task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoRadixTestNegative {
    @Test
    public void doMath() throws Exception {
        assertEquals("NO RADIX",new DoRadix().DoMath(new TaskEquation(8,1,2)));
    }
}