package ar.com.ada.online.second.objectexerciseone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Scanner keyboard = new Scanner(System.in);
        Item item = new Item();

        System.out.print("Ingrese el nombre del Item: ");
        item.name = keyboard.nextLine(); // next();

        System.out.print("Ingrese el precio del Item: ");
//        item.price = keyboard.nextDouble();
        item.price = Double.valueOf(keyboard.next());

        System.out.print("Ingrese la fecha de vencimiento del Item (dd-MM-yyyy): ");
        String date = keyboard.next();
        item.expirationDate = dateFormat.parse(date);
//        item.expirationDate = dateFormat.parse(keyboard.next());

        item.calculateTax();

        if (item.canItBeSold()) {
            Double totalToPay = item.getTotalToPay();
            System.out.printf(
                "- Nombre: %s\n- Precio: %.2f\n- Impuesto: %.2f\n- Total a pagar: %.2f",
                item.name,
                item.price,
                item.tax,
                totalToPay // or item.getTotalToPay()
            );
        } else {
            System.out.println("Este Ítem no está habilitado para la venta");
        }

    }
}
