package Task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskEqServiceTest {
    @Test
    public void discriminant() throws Exception {
        assertEquals(5,new TaskEqService().discriminant(new TaskEquation(1,3,1)));
    }
}