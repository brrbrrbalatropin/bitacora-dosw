package dosw.bitacora.corte1.semana3.Adapter4.Adapters;

import dosw.bitacora.corte1.semana3.Adapter4.Chargers.SlowElectricCharger;
import dosw.bitacora.corte1.semana3.Adapter4.Interfaces.FuelService;

public class SlowChargerAdapter implements FuelService {
    private SlowElectricCharger charger;

    public SlowChargerAdapter(SlowElectricCharger charger) {
        this.charger = charger;
    }

    @Override
    public void supply(int liters) {
        double kWh = convertLitersToKWh(liters);
        charger.slowCharge(kWh);
    }

    private double convertLitersToKWh(int liters) {
        return liters * 7.0;
    }
}