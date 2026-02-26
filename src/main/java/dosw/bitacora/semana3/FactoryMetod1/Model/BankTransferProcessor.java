package dosw.bitacora.semana3.FactoryMetod1.Model;

import dosw.bitacora.semana3.FactoryMetod1.Factory.BankTransferPayment;
import dosw.bitacora.semana3.FactoryMetod1.Factory.Payment;

public class BankTransferProcessor extends PaymentProcessor {
    @Override
    protected Payment createPayment() {
        return new BankTransferPayment();
    }
}