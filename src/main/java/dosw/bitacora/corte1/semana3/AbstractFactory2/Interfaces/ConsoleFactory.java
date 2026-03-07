package dosw.bitacora.corte1.semana3.AbstractFactory2.Interfaces;

public interface ConsoleFactory {
    Controller createController();
    Game createGame();
    UI createUI();
}