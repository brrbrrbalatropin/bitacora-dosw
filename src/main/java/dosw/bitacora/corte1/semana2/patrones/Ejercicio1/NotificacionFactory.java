package dosw.bitacora.corte1.semana2.patrones.Ejercicio1;

public class NotificacionFactory {

    public static Notificacion crearNotificacion(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "email" -> new NotificacionEmail();
            case "sms" -> new NotificacionSMS();
            case "push" -> new NotificacionPush();
            default -> throw new IllegalArgumentException("Tipo de notificacion invalido: " + tipo);
        };
    }
}