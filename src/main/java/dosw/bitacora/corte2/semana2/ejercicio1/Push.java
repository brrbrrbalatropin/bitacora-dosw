package dosw.bitacora.corte2.semana2.ejercicio1;

public class Push implements Estrategia {

    @Override
    public String enviar(String mensaje) {
        return "Mensaje enviado por notificacion push: "+mensaje;
    }
}
