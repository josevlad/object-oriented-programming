package ar.com.ada.online.second.tesacamosunojo;

public class Tool extends Product {

    @Override
    public void calculateDiscount() {
        if (ShoppingCart.paymentMethod.equals("tdc"))
            discount = price * 0.05;
        else
            discount = 0d;
    }
}
