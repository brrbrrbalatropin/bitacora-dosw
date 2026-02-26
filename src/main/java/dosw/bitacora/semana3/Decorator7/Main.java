package dosw.bitacora.semana3.Decorator7;

import dosw.bitacora.semana3.Decorator7.Decorators.AntitorpedosDecorator;
import dosw.bitacora.semana3.Decorator7.Decorators.BlindajeDecorator;
import dosw.bitacora.semana3.Decorator7.Decorators.MisilesDecorator;
import dosw.bitacora.semana3.Decorator7.Decorators.RadarDecorator;
import dosw.bitacora.semana3.Decorator7.Model.Barco;
import dosw.bitacora.semana3.Decorator7.Model.BarcoBase;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Barco barcoBase = new BarcoBase();

        Map<String, Function<Barco, Barco>> mejoras = Map.of(
                "BLINDAJE",     BlindajeDecorator::new,
                "RADAR",        RadarDecorator::new,
                "MISILES",      MisilesDecorator::new,
                "ANTITORPEDOS", AntitorpedosDecorator::new
        );

        List<String> configuracion = List.of(
                "BLINDAJE",
                "RADAR",
                "MISILES"
        );

        Barco barcoFinal = configuracion.stream()
                .map(mejoras::get)
                .reduce(barcoBase,
                        (barco, decorador) -> decorador.apply(barco),
                        (b1, b2) -> b2);

        System.out.println(barcoFinal.getDescripcion());
        System.out.println("Ataque: " + barcoFinal.poderAtaque());
        System.out.println("Defensa: " + barcoFinal.defensa());
    }
}