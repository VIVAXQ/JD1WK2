package Task3;

public class TaskEqService {
    public boolean isPositive(int valNecesToCheck) {
        if (valNecesToCheck<0) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean isZero(int valNecesToCheck) {
        if (valNecesToCheck==0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int discriminant(TaskEquation taskEquation) {
        return (int) Math.pow(taskEquation.getB(),2)-(4*taskEquation.getA()*taskEquation.getC());
    }


}
