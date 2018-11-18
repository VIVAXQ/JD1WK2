package Task3;

public class DoRadix {
    public String DoMath(TaskEquation taskEquation){
        //  хотел бы спросить как стоит вызывать методы из классов сервисов(?)
        //  так как ниже сделано или как в прошлых заданиях?
        if (!(new TaskEqService().isPositive(new TaskEqService().discriminant(taskEquation)))) {
            return "NO RADIX";
        }
        else {
            if (new TaskEqService().isZero(new TaskEqService().discriminant(taskEquation))) {
                return "Radix: "+Integer.toString((0-taskEquation.getB())/(2*taskEquation.getA()));
            }
            else {
                return "Radix: "+(((0-taskEquation.getB())+Math.sqrt(new TaskEqService().discriminant(taskEquation)))/(2*taskEquation.getA()))
                        +" and "+(((0-taskEquation.getB())-Math.sqrt(new TaskEqService().discriminant(taskEquation)))/(2*taskEquation.getA()));
            }
        }
    }
}
