package dosw.bitacora.corte1.semana3.AbstractFactory2.PlayStation;

import dosw.bitacora.corte1.semana3.AbstractFactory2.Interfaces.Game;

public class PlayStationGame implements Game {
    @Override
    public void start() {
        System.out.println("Abriendo juego");
    }
}