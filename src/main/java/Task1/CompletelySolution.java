package Task1;

import java.util.Scanner;

public class CompletelySolution {

    //  это для ввода с консоли по условию задания
    public TaskDate getResultTask() {
        Scanner in = new Scanner(System.in);
        int inputDay = in.nextInt();
        int inputMonth = in.nextInt();
        int inputYear = in.nextInt();
        TaskImplementation taskImplementation = new TaskImplementation();
        TaskDate taskDate = new TaskDate(inputDay,inputMonth,inputYear);
        return taskImplementation.TaskActionAllSeem(taskDate);
    }

    //  это для тестирования
    public TaskDate getResultTest(TaskDate taskDate) {
        TaskImplementation taskImplementation = new TaskImplementation();
        return taskImplementation.TaskActionAllSeem(taskDate);
    }
}
