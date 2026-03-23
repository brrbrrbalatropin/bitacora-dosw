package dosw.bitacora.corte1.semana2.patrones.Ejercicio1;

public class NotificacionPush implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando PUSH NOTIFICATION: " + mensaje);
        System.out.println("mensaje PUSH exitoso");
    }
}