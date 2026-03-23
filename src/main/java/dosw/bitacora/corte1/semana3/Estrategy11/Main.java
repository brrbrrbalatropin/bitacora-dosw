package dosw.bitacora.corte1.semana3.Estrategy11;

public class Main {
    public static void main(String[] args) {
        NavigationApp app = new NavigationApp(new FastestRoute());
        app.startNavigation();

        app.setRouteStrategy(new ScenicRoute());
        app.startNavigation();

        app.setRouteStrategy(new CheapestRoute());
        app.startNavigation();
    }
}