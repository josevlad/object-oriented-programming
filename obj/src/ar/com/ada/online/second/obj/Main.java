package ar.com.ada.online.second.obj;

public class Main {

    public static void main(String[] args) {
        XWingStarfighter ship1 = new XWingStarfighter( );
        XWingStarfighter ship2 = new XWingStarfighter("T-65B", 16);
        System.out.println("ship1.toString(): " + ship1.toString());

//        System.out.println("ship1.hashCode(): " + ship1.hashCode());
//        System.out.println("ship2.hashCode(): " + ship2.hashCode());

//        TieStarfighter tieStarfighter = new TieStarfighter("123jhg");
//        System.out.println(ship1.equals(ship2));
    }
}
