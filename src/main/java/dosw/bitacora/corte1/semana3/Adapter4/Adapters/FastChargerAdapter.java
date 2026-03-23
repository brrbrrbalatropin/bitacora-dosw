package dosw.bitacora.corte1.semana3.Adapter4.Adapters;

import dosw.bitacora.corte1.semana3.Adapter4.Chargers.FastElectricCharger;
import dosw.bitacora.corte1.semana3.Adapter4.Interfaces.FuelService;

public class FastChargerAdapter implements FuelService {
    private FastElectricCharger charger;

    public FastChargerAdapter(FastElectricCharger charger) {
        this.charger = charger;
    }

    @Override
    public void supply(int liters) {
        double kWh = convertLitersToKWh(liters);
        charger.fastCharge(kWh);
    }

    private double convertLitersToKWh(int liters) {
        return liters * 8.0;
    }
}