package dosw.bitacora.corte2.semana2;

public class Email implements Estrategia{
    @Override
    public String enviar(String mensaje) {
        return "Mensaje enviado por Email: "+mensaje;
    }
}
