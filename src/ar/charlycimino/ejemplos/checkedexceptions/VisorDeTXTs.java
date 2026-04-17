
package ar.charlycimino.ejemplos.checkedexceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;


/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class VisorDeTXTs {
    public void mostrarTxt(String ruta) throws FileNotFoundException, IOException {
        Objects.requireNonNull(ruta, "La ruta no puede ser null");

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea = br.readLine();

            if (linea != null) {
                System.out.println(linea);
            } else {
                System.out.println("El archivo está vacío");
            }
        }
    }
}
