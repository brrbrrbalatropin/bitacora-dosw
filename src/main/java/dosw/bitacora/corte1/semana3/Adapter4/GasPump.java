package dosw.bitacora.corte1.semana3.Adapter4;

import dosw.bitacora.corte1.semana3.Adapter4.Interfaces.FuelService;

public class GasPump implements FuelService {
    @Override
    public void supply(int liters) {
        System.out.println("llenando con" + liters);
    }
}