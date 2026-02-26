package dosw.bitacora.semana3.AbstractFactory2.Xbox;

import dosw.bitacora.semana3.AbstractFactory2.Interfaces.Controller;

public class XboxController implements Controller {
    @Override
    public void connect() {
        System.out.println("control de la exboks");
    }
}