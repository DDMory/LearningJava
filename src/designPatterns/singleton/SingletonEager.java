package src.designPatterns.singleton;

/**
 *
 * Singleton "apressada"
 *
 **/

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getIntancia(){
        return instancia;
    }
}
