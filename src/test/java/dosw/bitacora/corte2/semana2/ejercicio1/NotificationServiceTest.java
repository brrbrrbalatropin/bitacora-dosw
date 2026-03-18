package dosw.bitacora.corte2.semana2.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;


public class NotificationServiceTest {

    @Test
    void pruebaSingleton(){
        NotificationService s1 = NotificationService.getInstance();
        NotificationService s2 = NotificationService.getInstance();
        assertSame(s1, s2); // verifica que son el mismo objeto
    }

    @Test
    void pruebaEmail(){
        NotificationService servicio = NotificationService.getInstance();
        servicio.setEstrategia(new Email());
        String resultado = servicio.enviar("Hola");
        assertEquals("Mensaje enviado por Email: Hola", resultado);
    }

    @Test
    void pruebaSms(){
        NotificationService servicio = NotificationService.getInstance();
        servicio.setEstrategia(new Sms());
        String resultado = servicio.enviar("Hola");
        assertEquals("Mensaje enviado por Sms: Hola", resultado);
    }

    @Test
    void pruebaPush(){
        NotificationService servicio = NotificationService.getInstance();
        servicio.setEstrategia(new Push());
        String resultado = servicio.enviar("Hola");
        assertEquals("Mensaje enviado por notificacion push: Hola", resultado);
    }

}
