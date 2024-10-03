

public class HebraConsumidora implements Runnable{

    VariableCompartida vc;

    public HebraConsumidora(VariableCompartida vc) {
        this.vc = vc;
    }

    public void getter(){
        System.out.println(vc.getV());
    }

    @Override
    public void run() {
        getter();
    }
}
