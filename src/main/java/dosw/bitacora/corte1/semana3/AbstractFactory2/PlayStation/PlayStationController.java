package dosw.bitacora.corte1.semana3.AbstractFactory2.PlayStation;

import dosw.bitacora.corte1.semana3.AbstractFactory2.Interfaces.Controller;

public class PlayStationController implements Controller {
    @Override
    public void connect() {
        System.out.println("Control de la plei");
    }
}