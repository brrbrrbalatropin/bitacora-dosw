package dosw.bitacora.corte1.semana3.Bridge5.Shapes;

import dosw.bitacora.corte1.semana3.Bridge5.Colors.Color;

public abstract class Forma {
    protected Color color;

    public Forma(Color color) {
        this.color = color;
    }

    public abstract void dibujar();
}
