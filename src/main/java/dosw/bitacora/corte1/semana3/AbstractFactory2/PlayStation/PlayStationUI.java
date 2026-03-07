package dosw.bitacora.corte1.semana3.AbstractFactory2.PlayStation;

import dosw.bitacora.corte1.semana3.AbstractFactory2.Interfaces.UI;

public class PlayStationUI implements UI {
    @Override
    public void render() {
        System.out.println("Interfaz de play");
    }
}