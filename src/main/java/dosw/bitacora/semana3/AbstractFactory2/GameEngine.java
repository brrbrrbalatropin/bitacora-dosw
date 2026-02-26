package dosw.bitacora.semana3.AbstractFactory2;

import dosw.bitacora.semana3.AbstractFactory2.Interfaces.ConsoleFactory;
import dosw.bitacora.semana3.AbstractFactory2.Interfaces.Controller;
import dosw.bitacora.semana3.AbstractFactory2.Interfaces.Game;
import dosw.bitacora.semana3.AbstractFactory2.Interfaces.UI;

public class GameEngine {
    private Controller controller;
    private Game game;
    private UI ui;

    public GameEngine(ConsoleFactory factory) {
        this.controller = factory.createController();
        this.game = factory.createGame();
        this.ui = factory.createUI();
    }

    public void run() {
        controller.connect();
        game.start();
        ui.render();
    }
}