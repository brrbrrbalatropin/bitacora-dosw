package dosw.bitacora.corte1.semana3.FactoryMetod1.Model;

import dosw.bitacora.corte1.semana3.FactoryMetod1.Factory.Payment;

public abstract class PaymentProcessor {
    protected abstract Payment createPayment();

    public void processPayment(double amount) {
        Payment payment = createPayment();
        payment.pay(amount);
    }
}