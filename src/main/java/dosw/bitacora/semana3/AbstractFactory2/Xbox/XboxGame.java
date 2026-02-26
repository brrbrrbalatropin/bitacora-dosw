package dosw.bitacora.semana3.AbstractFactory2.Xbox;

import dosw.bitacora.semana3.AbstractFactory2.Interfaces.Game;

public class XboxGame implements Game {
    @Override
    public void start() {
        System.out.println("Abriendo juego xbox");
    }
}