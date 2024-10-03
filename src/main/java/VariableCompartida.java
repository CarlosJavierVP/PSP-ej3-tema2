

public class VariableCompartida{

    private int v;
    private boolean flag = false;

    public VariableCompartida(int v) {
        this.v = v;
    }

    public synchronized int getV() {
        while (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        flag = false;
        notify();
        return v;
    }

    public synchronized void setV(int v) {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.v = v;
        flag = true;
        notify();
    }



}
