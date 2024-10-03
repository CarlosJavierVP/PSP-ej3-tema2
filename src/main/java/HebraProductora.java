
public class HebraProductora implements Runnable{

    VariableCompartida vc;

    public HebraProductora(VariableCompartida vc) {
        this.vc = vc;
    }

    @Override
    public void run() {
        for(int i = 0; i <100; i++){
            vc.setV(i);

        }

    }
}
