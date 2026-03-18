package dosw.bitacora.corte2.semana2;

public class NotificationService {
    public Estrategia estrategia;
    private static NotificationService instancia;

    private NotificationService(){}

    public String enviar(String mensaje){
        return this.estrategia.enviar(mensaje);
    }

    public static NotificationService getInstance(){
        if (instancia == null){
            instancia = new NotificationService();
        }
        return instancia;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
}
