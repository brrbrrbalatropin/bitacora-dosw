package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio5Transacciones {

    public static void main(String[] args) {
        List<Transaction> transacciones = Arrays.asList( //lista generada con IA
                new Transaction("T001", 1500.50, true),
                new Transaction("T002", 2300.00, true),
                new Transaction("T003", 500.75, false),
                new Transaction("T004", 1200.00, true),
                new Transaction("T005", 800.25, true)
        );

        boolean loteValido = validarLote(transacciones);

        System.out.println("este lote es:" + loteValido);
    }

    public static boolean validarLote(List<Transaction> transacciones) {
        boolean hayNoAprobada = transacciones.stream()
                .peek(t -> System.out.println("Procesando: " + t))
                .anyMatch(t -> !t.isApproved());

        return !hayNoAprobada;
    }
}
