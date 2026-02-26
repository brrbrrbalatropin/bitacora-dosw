package dosw.bitacora.semana3.AbstractFactory2.Xbox;

import dosw.bitacora.semana3.AbstractFactory2.Interfaces.UI;

public class XboxUI implements UI {
    @Override
    public void render() {
        System.out.println("Interfaz de la caja equis");
    }
}