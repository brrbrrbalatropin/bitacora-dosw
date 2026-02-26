package dosw.bitacora.semana3.AbstractFactory2.PlayStation;

import dosw.bitacora.semana3.AbstractFactory2.Interfaces.UI;

public class PlayStationUI implements UI {
    @Override
    public void render() {
        System.out.println("Interfaz de play");
    }
}