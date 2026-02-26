package dosw.bitacora.semana3.Adapter4;

import dosw.bitacora.semana3.Adapter4.Adapters.FastChargerAdapter;
import dosw.bitacora.semana3.Adapter4.Adapters.SlowChargerAdapter;
import dosw.bitacora.semana3.Adapter4.Chargers.FastElectricCharger;
import dosw.bitacora.semana3.Adapter4.Chargers.SlowElectricCharger;
import dosw.bitacora.semana3.Adapter4.Interfaces.FuelService;

public class SmartGasStation {
    public static void main(String[] args) {
        FuelService gasolinePump = new GasPump();

        FuelService fastElectricPump =
                new FastChargerAdapter(new FastElectricCharger()); //aca se adapta al rapido

        FuelService slowElectricPump =
                new SlowChargerAdapter(new SlowElectricCharger()); //aca se adapta al lento

        gasolinePump.supply(30);
        fastElectricPump.supply(30);
        slowElectricPump.supply(30);
    }
}