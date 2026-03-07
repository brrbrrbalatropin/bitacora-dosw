package dosw.bitacora.corte1.semana1.streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio2Palabras {

    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("hola", "mundo", "java", "streams", "api", "programming", "pepe");

        List<String> resultado = palabras.stream()
                .filter(p -> p.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        long cantidad = resultado.size();

        System.out.println("palabras: " + resultado);
        System.out.println("cantidad palabras: " + cantidad);
    }
}