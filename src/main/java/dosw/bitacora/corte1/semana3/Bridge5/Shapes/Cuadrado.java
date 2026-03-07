package dosw.bitacora.corte1.semana3.Bridge5.Shapes;

import dosw.bitacora.corte1.semana3.Bridge5.Colors.Color;

public class Cuadrado extends Forma {

    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Cuadrado de color " + color.aplicarColor());
    }
}