package dosw.bitacora.semana3.FactoryMetod1.Factory;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pago con Tarjeta de Crédito por $ " + amount);
    }
}