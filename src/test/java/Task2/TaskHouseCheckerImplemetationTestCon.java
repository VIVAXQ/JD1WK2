package Task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskHouseCheckerImplemetationTestCon {
    @Test
    public void getResultTask2() throws Exception {
        TaskHouseCheckerImplemetation taskHouseCheckerImplemetation = new TaskHouseCheckerImplemetation();
        assertEquals(true,taskHouseCheckerImplemetation.getResultTask2
                (new TaskHouse(5,6),new TaskHouse(7,3),new TaskHouse(12,6)));
    }
}