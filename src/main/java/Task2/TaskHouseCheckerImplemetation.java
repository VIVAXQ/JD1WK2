package Task2;

// "Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым."
//  если это в плане того что они углами не поворачиваются, то я наверное правильно понял задание
//  и как его нужно реализовывать

//  ещё закинул фотку как я разрисовал модель алгоритма

//  возможно стоило делать через больше, а не через меньше или равно и поменять местами
//  тру и фолс, но я не знаю как лучше
//  логика выводит что от "больше" типо меньше действий, но опыт
//  подсказывает что есть какие-то нюансы и всё должно быть 100% наоборот
public class TaskHouseCheckerImplemetation {
    public boolean getResultTask2(TaskHouse taskHouse1,TaskHouse taskHouse2,TaskHouse taskArea)
    {
        if     ((taskHouse1.getWeight()+taskHouse2.getWeight()<=taskArea.getWeight())&(taskHouse1.getLenght()<=taskArea.getLenght())&(taskHouse2.getLenght()<=taskArea.getLenght())) {
            return true;
        }
        else {
            if ((taskHouse1.getWeight()+taskHouse2.getWeight()<=taskArea.getLenght())&(taskHouse1.getLenght()<=taskArea.getWeight())&(taskHouse2.getLenght()<=taskArea.getWeight())) {
                return true;
            }
            else {
                if ((taskHouse1.getWeight()+taskHouse2.getLenght()<=taskArea.getWeight())&(taskHouse1.getLenght()<=taskArea.getLenght())&(taskHouse2.getWeight()<=taskArea.getLenght())) {
                    return true;
                }
                else {
                    if ((taskHouse1.getWeight()+taskHouse2.getLenght()<=taskArea.getLenght())&(taskHouse1.getLenght()<=taskArea.getWeight())&(taskHouse2.getWeight()<=taskArea.getWeight())) {
                        return true;
                    }
                    else {
                        if ((taskHouse1.getLenght()+taskHouse2.getLenght()<=taskArea.getLenght())&(taskHouse1.getWeight()<=taskArea.getWeight())&(taskHouse2.getWeight()<=taskArea.getWeight())) {
                            return true;
                        }
                        else {
                            if ((taskHouse1.getLenght()+taskHouse2.getLenght()<=taskArea.getWeight())&(taskHouse1.getWeight()<=taskArea.getLenght())&(taskHouse2.getWeight()<=taskArea.getLenght())) {
                                return true;
                            }
                            else {
                                if ((taskHouse1.getLenght()+taskHouse2.getWeight()<=taskArea.getLenght())&(taskHouse1.getWeight()<=taskArea.getWeight())&(taskHouse2.getLenght()<=taskArea.getWeight())) {
                                    return true;
                                }
                                else {
                                    if ((taskHouse1.getLenght()+taskHouse2.getWeight()<=taskArea.getWeight())&(taskHouse1.getWeight()<=taskArea.getLenght())&(taskHouse2.getLenght()<=taskArea.getLenght())) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
