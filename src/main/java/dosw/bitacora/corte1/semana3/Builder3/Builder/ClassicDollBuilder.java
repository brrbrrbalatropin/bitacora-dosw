package dosw.bitacora.corte1.semana3.Builder3.Builder;

import dosw.bitacora.corte1.semana3.Builder3.Model.ToyDoll;

public class ClassicDollBuilder implements ToyDollBuilder {
    private ToyDoll doll;

    public ClassicDollBuilder() {
        this.doll = new ToyDoll();
    }

    @Override
    public void buildHead() {
        doll.setHead("Cabeza normal");
    }

    @Override
    public void buildBody() {
        doll.setBody("Cuerpo normal");
    }

    @Override
    public void buildArms() {
        doll.setArms("Brazos normales");
    }

    @Override
    public void buildLegs() {
        doll.setLegs("Piernas normales");
    }

    @Override
    public void addAccessories() {
        doll.setHasAccessories(false);
    }

    public ToyDoll getResult() {
        return doll;
    }
}