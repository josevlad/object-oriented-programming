package ar.com.ada.online.second.instance;

public class Main {

    public static void main(String[] args) {
        System.out.println("Instance:");

        // two intances
        XWingStarfighter ship1 = new XWingStarfighter();
        XWingStarfighter ship2 = new XWingStarfighter();

        // set state
        ship1.model = "T-65";
        ship1.maxAcceleration = 16;

        ship2.model = "T-75";
        ship2.maxAcceleration = 22;

        // excecute method
        ship1.shootLaser();
        ship2.shootLaser();

// ####################################################################

        // copy reference of variable
        XWingStarfighter shipRef1 = ship1;

        // set state from shipRef1
        shipRef1.model = "T-75"; // tecnicamente le estoy cambiando el valor de model a ship1 tambien.

        // excecute method
        shipRef1.shootLaser();
        ship1.shootLaser();

// ####################################################################

        // overloading contructors
        TieStarfighter enimyShip1 = new TieStarfighter();
        TieStarfighter enimyShip2 = new TieStarfighter("Z-23");
        TieStarfighter enimyShip3 = new TieStarfighter(22);
        TieStarfighter enimyShip4 = new TieStarfighter("Z-23",22);
        TieStarfighter enimyShip5 = new TieStarfighter(22,"Z-23");

        System.out.println("");
    }
}
