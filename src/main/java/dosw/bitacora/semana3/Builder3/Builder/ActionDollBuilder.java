package dosw.bitacora.semana3.Builder3.Builder;

import dosw.bitacora.semana3.Builder3.Model.ToyDoll;

public class ActionDollBuilder implements ToyDollBuilder {
    private ToyDoll doll;

    public ActionDollBuilder() {
        this.doll = new ToyDoll();
    }

    @Override
    public void buildHead() {
        doll.setHead("cabeza como la de piramidhead");
    }

    @Override
    public void buildBody() {
        doll.setBody("Cuerpo de adonis");
    }

    @Override
    public void buildArms() {
        doll.setArms("Brazos armados y preparados");
    }

    @Override
    public void buildLegs() {
        doll.setLegs("Piernas con botas");
    }

    @Override
    public void addAccessories() {
        doll.setHasAccessories(true);
    }

    public ToyDoll getResult() {
        return doll;
    }
}