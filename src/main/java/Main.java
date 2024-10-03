

public class Main {
    public static void main(String[] args) {

        VariableCompartida vc = new VariableCompartida(0);

        HebraProductora hp = new HebraProductora(vc);
        HebraConsumidora hc = new HebraConsumidora(vc);

        Thread t1 = new Thread(hp);
        Thread t2 = new Thread(hc);

        t1.start();
        t2.start();


    }
}
