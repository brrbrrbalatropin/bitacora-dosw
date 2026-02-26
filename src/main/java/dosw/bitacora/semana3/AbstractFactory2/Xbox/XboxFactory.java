package dosw.bitacora.semana3.AbstractFactory2.Xbox;

import dosw.bitacora.semana3.AbstractFactory2.Interfaces.ConsoleFactory;
import dosw.bitacora.semana3.AbstractFactory2.Interfaces.Controller;
import dosw.bitacora.semana3.AbstractFactory2.Interfaces.Game;
import dosw.bitacora.semana3.AbstractFactory2.Interfaces.UI;

public class XboxFactory implements ConsoleFactory {
    @Override
    public Controller createController() {
        return new XboxController();
    }

    @Override
    public Game createGame() {
        return new XboxGame();
    }

    @Override
    public UI createUI() {
        return new XboxUI();
    }
}