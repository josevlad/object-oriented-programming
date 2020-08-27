package ar.com.ada.online.second.objectexerciseone;

import java.util.Date;

public class Item {

    String name;
    Double price;
    Double tax;
    Date expirationDate;

    Double getTotalToPay() {
        Double result = this.price + this.tax;
        return result;
        // return this.price + this.tax;
    }

    void calculateTax() {
        this.tax = this.price * 0.12;
    }

//    Boolean canItBeSold() {
//        Date today = new Date();
//        Boolean result = expirationDate.after(today);
//        return result;
//    }

    Boolean canItBeSold() {
        Date today = new Date();
        Boolean canItBeSold = true;

        if (today.after(this.expirationDate)) {
            canItBeSold = false;
        }

        return canItBeSold;
    }
}
