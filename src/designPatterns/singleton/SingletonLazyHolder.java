package src.designPatterns.singleton;

/**
 *
 * Singleton "Lazy Holder"
 *
 **/

public class SingletonLazyHolder {

    private static class  Holder{
        public static SingletonLazyHolder instancia;
    }

    private SingletonLazyHolder(){}

    public static SingletonLazyHolder getIntancia(){
        return Holder.instancia;
    }
}
