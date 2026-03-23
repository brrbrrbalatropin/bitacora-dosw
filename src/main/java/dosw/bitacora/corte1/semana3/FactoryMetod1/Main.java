package dosw.bitacora.corte1.semana3.FactoryMetod1;

import dosw.bitacora.corte1.semana3.FactoryMetod1.Model.BankTransferProcessor;
import dosw.bitacora.corte1.semana3.FactoryMetod1.Model.CreditCardProcessor;
import dosw.bitacora.corte1.semana3.FactoryMetod1.Model.PaymentProcessor;
import dosw.bitacora.corte1.semana3.FactoryMetod1.Model.PaypalProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor;

        processor = new CreditCardProcessor();
        processor.processPayment(100);

        processor = new PaypalProcessor();
        processor.processPayment(250);

        processor = new BankTransferProcessor();
        processor.processPayment(500);
    }
}