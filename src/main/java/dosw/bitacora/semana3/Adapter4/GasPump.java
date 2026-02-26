package dosw.bitacora.semana3.Adapter4;

import dosw.bitacora.semana3.Adapter4.Interfaces.FuelService;

public class GasPump implements FuelService {
    @Override
    public void supply(int liters) {
        System.out.println("llenando con" + liters);
    }
}