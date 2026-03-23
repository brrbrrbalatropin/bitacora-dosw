package dosw.bitacora.corte1.semana3.Builder3.Factory;

import dosw.bitacora.corte1.semana3.Builder3.Builder.ToyDollBuilder;

public class ToyFactory {
    private ToyDollBuilder builder;

    public void constructDoll(ToyDollBuilder builder) {
        this.builder = builder;
        builder.buildHead();
        builder.buildBody();
        builder.buildArms();
        builder.buildLegs();
        builder.addAccessories();
    }
}