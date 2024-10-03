package src.designPatterns.strategy;

public class ComportamentoNormal implements Comportamento{
    @Override
    public void mover() {
        System.out.println("MOVENDO NORMALMENTE");
    }
}
