package one.digitalinnovation.gof.strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.print("Movendo-se defensivamente");
    }
}
