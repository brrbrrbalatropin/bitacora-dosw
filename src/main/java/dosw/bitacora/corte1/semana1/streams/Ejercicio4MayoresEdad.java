package dosw.bitacora.corte1.semana1.streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio4MayoresEdad {

    public static void main(String[] args) {
        List<Usuario> usuarios = Arrays.asList(
                new Usuario(1, "Juan", 17, true),
                new Usuario(2, "Maria", 20, false),
                new Usuario(3, "Carlos", 15, true),
                new Usuario(4, "Ana", 22, true),
                new Usuario(5, "Pedro", 18, false)
        );

        List<String> nombresMayores = usuarios.stream()
                .filter(u -> u.getAge() >= 18)
                .map(Usuario::getName)
                .toList();

        System.out.println("Mayores de edad: " + nombresMayores);
    }
}