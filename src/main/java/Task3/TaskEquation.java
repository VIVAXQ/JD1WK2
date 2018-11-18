package Task3;

public class TaskEquation {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    TaskEquation() {
        a=0;
        b=0;
        c=0;
    }

    TaskEquation(int inputA, int inputB, int inputC) {
        a=inputA;
        b=inputB;
        c=inputC;
    }
}
