package dosw.bitacora.semana3.AbstractFactory2.PlayStation;

import dosw.bitacora.semana3.AbstractFactory2.Interfaces.Game;

public class PlayStationGame implements Game {
    @Override
    public void start() {
        System.out.println("Abriendo juego");
    }
}