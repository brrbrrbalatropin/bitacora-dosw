package dosw.bitacora.corte1.semana3.FactoryMetod1.Model;

import dosw.bitacora.corte1.semana3.FactoryMetod1.Factory.CreditCardPayment;
import dosw.bitacora.corte1.semana3.FactoryMetod1.Factory.Payment;

public class CreditCardProcessor extends PaymentProcessor {
    @Override
    protected Payment createPayment() {
        return new CreditCardPayment();
    }
}