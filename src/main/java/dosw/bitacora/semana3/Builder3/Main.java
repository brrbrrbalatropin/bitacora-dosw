package dosw.bitacora.semana3.Builder3;

import dosw.bitacora.semana3.Builder3.Builder.ActionDollBuilder;
import dosw.bitacora.semana3.Builder3.Builder.ClassicDollBuilder;
import dosw.bitacora.semana3.Builder3.Factory.ToyFactory;
import dosw.bitacora.semana3.Builder3.Model.ToyDoll;

public class Main {
    public static void main(String[] args) {
        ToyFactory factory = new ToyFactory();

        ActionDollBuilder actionBuilder = new ActionDollBuilder();
        factory.constructDoll(actionBuilder);
        ToyDoll actionDoll = actionBuilder.getResult();

        ClassicDollBuilder classicBuilder = new ClassicDollBuilder();
        factory.constructDoll(classicBuilder);
        ToyDoll classicDoll = classicBuilder.getResult();

        actionDoll.showInfo();
        classicDoll.showInfo();
    }
}