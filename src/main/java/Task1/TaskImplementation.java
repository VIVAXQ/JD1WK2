package Task1;

//  имплементейшн в плане реализация, ну т.е. я реализую класс даты, кажется что более подходит чем сервис
public class TaskImplementation {

    public TaskDate TaskActionAllSeem(TaskDate taskDate) {
        if ((taskDate.getDay()+1)>30) {
            taskDate.setDay(1);
            if ((taskDate.getMonth()+1)>12){
                taskDate.setMonth(1);
                taskDate.setYear(taskDate.getYear()+1);
                return taskDate;
            }
            taskDate.setMonth(taskDate.getMonth()+1);
            return taskDate;
        }
        else {
            taskDate.setDay(taskDate.getDay()+1);
            return taskDate;
        }
    }

    //  не понял условие, достаточно ли просто реализовать алгоритм или нужно распознавать длину месяцев(28,29,30,31),
    //  но оставил место чтобы дописать при необходимости
    //  может это вообще изначально нужно было конструировать через кейс (свич его объясняли в лекции),
    //  но я не был уверен что из возможных вариантов корректнее
    //  и реализовал то что интуитивно виделось верным

    public TaskDate TaskActionRealistic(TaskDate taskDate) {
        return taskDate;
    }
}
