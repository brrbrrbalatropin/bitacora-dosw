package dosw.bitacora.corte1.semana3.FactoryMetod1.Model;

import dosw.bitacora.corte1.semana3.FactoryMetod1.Factory.Payment;
import dosw.bitacora.corte1.semana3.FactoryMetod1.Factory.PaypalPayment;

public class PaypalProcessor extends PaymentProcessor {
    @Override
    protected Payment createPayment() {
        return new PaypalPayment();
    }
}