package ar.com.ada.online.second.objectexerciseone;

import java.util.Date;

public class Item {
    String name;
    Double price;
    Double tax;
    Date expirationDate;

    void calculateTax() {
        this.tax = this.price * 0.12;
    }

    Double getTotalToPay() {
        Double totalToPay = this.price + this.tax;
        return totalToPay;
    }

    Boolean canItBeSold() {
        Date today = new Date();
        Boolean canItBeSold = true;
        
        if (expirationDate.compareTo(today) < 0)
            canItBeSold = false;
        
        return canItBeSold;
    }
}
