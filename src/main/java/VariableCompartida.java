

public class VariableCompartida{

    private int v;
    private boolean flag = false;

    public VariableCompartida(int v) {
        this.v = v;
    }

    /*
    * Antes de llamar a los métodos wait() y notify() únicamente la hebra consumidora devolvía
    * el último resultado(99) ya que los hilos se ejecutaban desordenados. Una vez que se han sincronizado
    * el get(utilizado por la HebraProductora) y set(utilizado por la HebraConsumidora) y utilizado los
    * métodos wait() y notify() los resultados se han sincronizado
    * Se utiliza una variable booleana de cara a controlar el método wait()
    *
    */

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
