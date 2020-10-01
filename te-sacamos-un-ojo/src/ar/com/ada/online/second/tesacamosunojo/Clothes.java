package ar.com.ada.online.second.tesacamosunojo;

public class Clothes extends Product {

    private String departement;

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public void calculateDiscount() {
        if (departement.equals("kids") || departement.equals("women"))
            discount = price * 0.15;
        else
            discount = 0d;
    }
}
