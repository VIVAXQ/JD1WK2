package Task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoRadixTestNull {
    @Test
    public void doMath() throws Exception {
        assertEquals("Radix: -6",new DoRadix().DoMath(new TaskEquation(1,12,36)));
    }
}