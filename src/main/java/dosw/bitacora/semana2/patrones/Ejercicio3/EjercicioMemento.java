package dosw.bitacora.semana2.patrones.Ejercicio3;

public class EjercicioMemento {

    public static void main(String[] args) {
        Editor editor = new Editor();
        HistorialTexto historial = new HistorialTexto();

        //guarda los estados
        editor.escribir("Hola");
        historial.guardarEstado(editor.guardar());

        editor.escribir("Hola mundo");
        historial.guardarEstado(editor.guardar());

        editor.escribir("Hola mundo la venganza");
        historial.guardarEstado(editor.guardar());

        editor.escribir("Hola mundo ahora es personal: resurrecciones");
        historial.guardarEstado(editor.guardar());

        // Mostrar historial
        historial.mostrarHistorial();

        //restaura estado 2
        editor.restaurar(historial.obtenerEstado(2));

        //restaura estado 1
        //editor.restaurar(historial.obtenerEstado(1));

        //restaura estado 0
        //editor.restaurar(historial.obtenerEstado(0));

        System.out.println("Estado actual:" + editor.getContenido());
    }
}