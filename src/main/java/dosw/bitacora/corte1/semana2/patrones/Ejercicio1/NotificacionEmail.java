package dosw.bitacora.corte1.semana2.patrones.Ejercicio1;

public class NotificacionEmail implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje);
        System.out.println("mensaje EMAIL exitoso");
    }
}