package Task1;

public class TaskDate {

    private int Day;
    private int Month;
    private int Year;

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    //  просто стандартная пререгрузка, не знаю нужно её оставлять или нет
    TaskDate() {
        Day = 0;
        Month = 0;
        Year = 0;
    }

    //  делал без super и this т.к. ещё не могу до конца осознать нейминг конвеншн для переменных
    // (может быть я зря это пишу и оно тут и не нужно и я ничего не понимаю, но на всякий случай)

    TaskDate(int inputDay, int inputMonth, int inputYear) {
        Day = inputDay;
        Month = inputMonth;
        Year = inputYear;

    }

    //  я так и не понял с чем конкретно нужно работать поэотму просто добавил т.к.
    //  это требовалось по условию задания
    @Override
    public String toString() {
        return "TaskDate{" +
                "Day=" + Day +
                ", Month=" + Month +
                ", Year=" + Year +
                '}';
    }
}
