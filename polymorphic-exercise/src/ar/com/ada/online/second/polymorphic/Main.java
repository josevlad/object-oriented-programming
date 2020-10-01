package ar.com.ada.online.second.polymorphic;

import ar.com.ada.online.second.polymorphic.sub.ElectricalVehicle;
import ar.com.ada.online.second.polymorphic.sub.SportsVehicle;
import ar.com.ada.online.second.polymorphic.sub.Truck;
import ar.com.ada.online.second.polymorphic.sup.Vehicle;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicleArrayList = new ArrayList<Vehicle>();

        //ElectricalVehicle
        vehicleArrayList.add(new ElectricalVehicle("Tesla", "Model 3", 2006, 351));
        vehicleArrayList.add(new ElectricalVehicle("Tesla", "Model S", 2009, 100));
        vehicleArrayList.add(new ElectricalVehicle("Tesla", "Model X", 2015, 421));
        vehicleArrayList.add(new ElectricalVehicle("Hyundai", "Kona", 2019, 204));

        //SportsVehicle
        vehicleArrayList.add(new SportsVehicle("Mercedes", "AMG", "2017", 49));
        vehicleArrayList.add(new SportsVehicle("Volvo", "S60 Polestar", "2017", 150));
        vehicleArrayList.add(new SportsVehicle("Ford", "Focus RS", "2017", 450));
        vehicleArrayList.add(new SportsVehicle("Porsche", "718 Cayman", "2017", 4500));

        //Truck
        vehicleArrayList.add(new Truck("Scania", "G 440", 2010, 80));
        vehicleArrayList.add(new Truck("Scania", "G 380", 2015, 120));
        vehicleArrayList.add(new Truck("Scania", "P 230", 2016, 50));
        vehicleArrayList.add(new Truck("Scania", "P 420", 2020, 1000));

        for (Vehicle vehicle : vehicleArrayList) {
            System.out.println();
            System.out.println(vehicle.technicalSheet());
        }


//        Vehicle[] vehicles = {
//                //ElectricalVehicle
//                new ElectricalVehicle("Tesla", "Model 3", 2006, 351),
//                new ElectricalVehicle("Tesla", "Model S", 2009, 100),
//                new ElectricalVehicle("Tesla", "Model X", 2015, 421),
//                new ElectricalVehicle("Hyundai", "Kona", 2019, 204),
//                //SportsVehicle
//                new SportsVehicle("Mercedes", "AMG", "2017", 49),
//                new SportsVehicle("Volvo", "S60 Polestar", "2017", 150),
//                new SportsVehicle("Ford", "Focus RS", "2017", 450),
//                new SportsVehicle("Porsche", "718 Cayman", "2017", 4500),
//                //Truck
//                new Truck("Scania", "G 440", 2010, 80),
//                new Truck("Scania", "G 380", 2015, 120),
//                new Truck("Scania", "P 230", 2016, 50),
//                new Truck("Scania", "P 420", 2020, 1000)
//        };


//        for (Vehicle vehicle : vehicles) {
//            System.out.print("\n");
//            System.out.println(vehicle.technicalSheet());
//        }

//        for (int i = 0; i < vehicles.length; i++) {
//            System.out.print("\n");
//            System.out.println(vehicles[i].technicalSheet());
//        }

    }
}
