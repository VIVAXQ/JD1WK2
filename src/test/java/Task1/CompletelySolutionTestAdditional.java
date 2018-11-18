package Task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompletelySolutionTestAdditional {
    @Test
    public void getResultTest() throws Exception {
        CompletelySolution completelySolution = new CompletelySolution();
        TaskDate taskDate1 = new TaskDate(1,2,1);
        TaskDate taskDate2 = completelySolution.getResultTest(new TaskDate(30,1,1));
        assertEquals(taskDate1.getDay(),taskDate2.getDay());
        assertEquals(taskDate1.getMonth(),taskDate2.getMonth());
        assertEquals(taskDate1.getYear(),taskDate2.getYear());
    }
}