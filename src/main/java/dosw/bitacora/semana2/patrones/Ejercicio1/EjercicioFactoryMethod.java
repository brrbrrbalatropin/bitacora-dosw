package dosw.bitacora.semana2.patrones.Ejercicio1;

public class EjercicioFactoryMethod {

    public static void main(String[] args) {
        //crear diferentes notificaciones
        Notificacion notifEmail = NotificacionFactory.crearNotificacion("email");
        Notificacion notifSMS = NotificacionFactory.crearNotificacion("sms");
        Notificacion notifPush = NotificacionFactory.crearNotificacion("push");

        //enviar mensajes (pruebas)
        notifEmail.enviar("Tu pedido ha sido confirmado");
        notifSMS.enviar("Código de verificación: 123456");
        notifPush.enviar("Tienes un nuevo mensaje");

    }
}