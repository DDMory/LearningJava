package src.designPatterns.singleton;

/**
 *
 * Singleton "preguiçoso"
 *
 **/

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){}

    public static SingletonLazy getIntancia(){
        if(instancia==null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
