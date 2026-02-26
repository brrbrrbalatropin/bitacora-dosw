package dosw.bitacora.semana3.FactoryMetod1.Model;

import dosw.bitacora.semana3.FactoryMetod1.Factory.Payment;
import dosw.bitacora.semana3.FactoryMetod1.Factory.PaypalPayment;

public class PaypalProcessor extends PaymentProcessor {
    @Override
    protected Payment createPayment() {
        return new PaypalPayment();
    }
}