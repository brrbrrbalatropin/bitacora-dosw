package dosw.bitacora.corte1.semana3.FactoryMetod1.Factory;

public class PaypalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pago con PayPal por $ " + amount);
    }
}