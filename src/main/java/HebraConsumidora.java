

public class HebraConsumidora implements Runnable{

    VariableCompartida vc;

    public HebraConsumidora(VariableCompartida vc) {
        this.vc = vc;
    }


    @Override
    public void run() {
        for (int i = 0; i<100; i++){
            System.out.println(vc.getV());
        }
    }
}
