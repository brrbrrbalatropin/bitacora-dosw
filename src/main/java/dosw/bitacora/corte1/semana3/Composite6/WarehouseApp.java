package dosw.bitacora.corte1.semana3.Composite6;

import dosw.bitacora.corte1.semana3.Composite6.Model.Box;
import dosw.bitacora.corte1.semana3.Composite6.Model.Product;

public class WarehouseApp {
    public static void main(String[] args) {
        Product laptop   = new Product("Laptop", 1200);
        Product mouse    = new Product("Mouse", 40);
        Product keyboard = new Product("Keyboard", 80);

        Box accessoriesBox = new Box("Accessories Box");
        accessoriesBox.add(mouse);
        accessoriesBox.add(keyboard);

        Box mainBox = new Box("Main Box");
        mainBox.add(laptop);
        mainBox.add(accessoriesBox);

        System.out.println("precio total:" + mainBox.getPrice());
    }
}