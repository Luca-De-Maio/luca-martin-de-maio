package Singleton;

import java.util.ArrayList;

public class Logger {
    private static Logger log;

    private ArrayList<String> value = new ArrayList<String>();

    public static Logger getInstance(){
        if ( log==null ) {
            log = new Logger();
        }
        return log;
    }

    public ArrayList<String> getValue() {
        return value;
    }

    private Logger(){
        value.add("BOOTCAMP Base Datos");
        value.add("Usuario");
        value.add("Contrasnha");
        value.add("Puerto 3087");
    }

}
