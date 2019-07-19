package Singleton;

public class MainCoders {
    public static void main(String[] args) {
        Logger logote = Logger.getInstance();
        Logger logotote = Logger.getInstance();

        logote.getValue();
        System.out.println(logotote.getValue());
    }
}
