
public class HebraProductora implements Runnable{

    VariableCompartida vc;

    public HebraProductora(VariableCompartida vc) {
        this.vc = vc;
    }


    public void setter(){
        for(int i = 0; i <100; i++){
            vc.setV(vc.getV()+10);
        }
    }

    @Override
    public void run() {
        setter();

    }
}
