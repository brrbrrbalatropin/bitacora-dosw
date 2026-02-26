package dosw.bitacora.semana3.AbstractFactory2.PlayStation;

import dosw.bitacora.semana3.AbstractFactory2.Interfaces.Controller;

public class PlayStationController implements Controller {
    @Override
    public void connect() {
        System.out.println("Control de la plei");
    }
}