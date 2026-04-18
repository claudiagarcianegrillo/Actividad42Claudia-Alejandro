package ar.charlycimino.ejemplos.trycatch;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharuCimino
 */
public class Test5 {

    private static final Logger logger =
            Logger.getLogger(Test5.class.getName());

    /*
     ¿Dónde se lanza la excepción?
     */
    @SuppressWarnings("java:S1172")
    public static void main(String[] args) {

        int x = Math.incrementExact(2147483647);

        if (logger.isLoggable(Level.INFO)) {
            logger.info(String.valueOf(x));
        }
    }
}
