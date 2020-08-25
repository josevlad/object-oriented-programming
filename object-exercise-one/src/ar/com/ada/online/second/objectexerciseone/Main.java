package ar.com.ada.online.second.objectexerciseone;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // esta instancia es para convertir un string de fecha a un objeto Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Scanner keyboard = new Scanner(System.in);

        // Creo una instancia (o un objeto) de la clase Item
        Item item = new Item();

        // Pido los datos y los voy seteando a los atributos del objeto
        System.out.print("Ingrese el nombre del Item: ");
        item.name = keyboard.nextLine();

        System.out.print("Ingrese el precio del Item: ");
        item.price = Double.valueOf(keyboard.nextLine());

        System.out.print("Ingrese la fecha de vencimiento del Item (dia-mes-año): ");
        item.expirationDate = dateFormat.parse(keyboard.nextLine());

        // ejecuto el metodo para calcular el impuesto
        item.calculateTax();

        // verifico si se puede vender el item
        if (item.canItBeSold()) {
            System.out.printf(
                    "\nNombre: %s\nPrecio %.2f\nImpuesto: %.2f\nTotal a pagar: %.2f",
                    item.name,
                    item.price,
                    item.tax,
                    item.getTotalToPay()
            );
        } else {
            System.out.println("Este Ítem no está habilitado para la venta");
        }

    }
}
