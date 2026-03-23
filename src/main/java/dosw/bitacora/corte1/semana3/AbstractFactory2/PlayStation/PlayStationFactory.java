package dosw.bitacora.corte1.semana3.AbstractFactory2.PlayStation;

import dosw.bitacora.corte1.semana3.AbstractFactory2.Interfaces.ConsoleFactory;
import dosw.bitacora.corte1.semana3.AbstractFactory2.Interfaces.Controller;
import dosw.bitacora.corte1.semana3.AbstractFactory2.Interfaces.Game;
import dosw.bitacora.corte1.semana3.AbstractFactory2.Interfaces.UI;

public class PlayStationFactory implements ConsoleFactory {
    @Override
    public Controller createController() {
        return new PlayStationController();
    }

    @Override
    public Game createGame() {
        return new PlayStationGame();
    }

    @Override
    public UI createUI() {
        return new PlayStationUI();
    }
}