package ar.com.ada.online.second.instance;

public class Main {

    public static void main(String[] args) {
        System.out.println("Instance:");
//	    XWingStarfighter ship1 = new XWingStarfighter();
//
//        ship1.model = "T-75";
//        ship1.shootLaser();
//
//        // esta variable toma la referencia en memoria
//        // de la instancia creada en ship1
//        XWingStarfighter shipRef1 = new XWingStarfighter();
//
//        shipRef1.shootLaser();
//        shipRef1.model = "T-65"; // tecnicamente le estoy cambiando el valor de model a ship1 tambien.
//        shipRef1.shootLaser();
//        ship1.shootLaser();


//        XWingStarfighter ship2 = new XWingStarfighter();
//
//        ship2.model = "T-65";
//        ship2.maxAcceleration = 16;
//        ship2.shootLaser();

        TieStarfighter enimyShip1 = new TieStarfighter();
        TieStarfighter enimyShip2 = new TieStarfighter("Z-23");
        TieStarfighter enimyShip3 = new TieStarfighter(22);
        TieStarfighter enimyShip4 = new TieStarfighter("Z-23",22);
        TieStarfighter enimyShip5 = new TieStarfighter(22,"Z-23");
        enimyShip1.toString();

        System.out.println("");
    }
}
