package src.designPatterns.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("MOVENDO DEFENSIVAMENTE");
    }
}
