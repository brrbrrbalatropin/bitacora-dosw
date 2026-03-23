package dosw.bitacora.corte1.semana3.Bridge5.Shapes;

import dosw.bitacora.corte1.semana3.Bridge5.Colors.Color;

public class Circulo extends Forma {

    public Circulo(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("circulo de color " + color.aplicarColor());
    }
}