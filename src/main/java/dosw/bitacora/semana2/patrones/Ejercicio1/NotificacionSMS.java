package dosw.bitacora.semana2.patrones.Ejercicio1;

public class NotificacionSMS implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
        System.out.println("mensaje SMS exitoso");
    }
}