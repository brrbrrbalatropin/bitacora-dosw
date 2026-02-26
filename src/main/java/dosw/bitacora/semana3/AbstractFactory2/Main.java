package dosw.bitacora.semana3.AbstractFactory2;

import dosw.bitacora.semana3.AbstractFactory2.Interfaces.ConsoleFactory;
import dosw.bitacora.semana3.AbstractFactory2.PlayStation.PlayStationFactory;
import dosw.bitacora.semana3.AbstractFactory2.Xbox.XboxFactory;

public class Main {
    public static void main(String[] args) {
        ConsoleFactory factory;

        factory = new PlayStationFactory();
        GameEngine psEngine = new GameEngine(factory);
        psEngine.run();

        System.out.println("-----");

        factory = new XboxFactory();
        GameEngine xboxEngine = new GameEngine(factory);
        xboxEngine.run();
    }
}