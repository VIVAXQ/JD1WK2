package Task2;

public class TaskHouse {
    //  насколько я понял a b c d указаны условно и подписал эти переменные по факту
    private int lenght;
    //  weight типо значение а не вес
    private int weight;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    TaskHouse() {
        lenght = 0;
        weight = 0;
    }

    TaskHouse(int inputLenght, int inputWeight){
        lenght = inputLenght;
        weight = inputWeight;
    }
}
