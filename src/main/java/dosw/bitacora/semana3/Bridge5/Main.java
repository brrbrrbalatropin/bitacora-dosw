package dosw.bitacora.semana3.Bridge5;

import dosw.bitacora.semana3.Bridge5.Colors.Azul;
import dosw.bitacora.semana3.Bridge5.Colors.Rojo;
import dosw.bitacora.semana3.Bridge5.Shapes.Circulo;
import dosw.bitacora.semana3.Bridge5.Shapes.Cuadrado;
import dosw.bitacora.semana3.Bridge5.Shapes.Forma;

public class Main {
    public static void main(String[] args) {
        Forma circuloRojo  = new Circulo(new Rojo());
        Forma cuadradoRojo = new Cuadrado(new Rojo());

        Forma circuloAzul  = new Circulo(new Azul());
        Forma cuadradoAzul = new Cuadrado(new Azul());

        circuloRojo.dibujar();
        cuadradoRojo.dibujar();
        circuloAzul.dibujar();
        cuadradoAzul.dibujar();
    }
}