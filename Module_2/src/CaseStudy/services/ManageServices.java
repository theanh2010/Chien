package CaseStudy.services;

import CaseStudy.models.House;
import CaseStudy.models.Room;
import CaseStudy.models.Services;
import CaseStudy.models.Villa;
import CaseStudy.view.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageServices extends Services {

    public static List<Villa> servicesVillaList = new ArrayList<>();
    public static List<House> servicesHouseList = new ArrayList<>();
    public static List<Room> servicesRoomList = new ArrayList<>();

    static {
        servicesVillaList.add(new Villa("Villa 1",1,2,3,"4","5","6",7,2));
        servicesVillaList.add(new Villa("Villa 2",1,2,3,"4","5","6",7,2));
        servicesHouseList.add(new House("House 1",1,2,3,"4","5","6",7));
        servicesHouseList.add(new House("House 2",1,2,3,"4","5","6",7));
        servicesRoomList.add(new Room("Room1 2",1,2,3,"4","5"));
        servicesRoomList.add(new Room("Room1 4",1,2,3,"4","5"));
    }

    public static List<Villa> getServicesVillaList() {
        return servicesVillaList;
    }

    public static List<House> getServicesHouseList() {
        return servicesHouseList;
    }

    public static List<Room> getServicesRoomList() {
        return servicesRoomList;
    }

    public ManageServices(){}

    public ManageServices(String nameService, double area, double rentCost, int maxAmount, String rentType) {
        super( nameService, area, rentCost, maxAmount, rentType);
    }

    public void addNewVilla(){
        Villa villa = new Villa(inputNameServices(), inputAreaServices(), inputCostServices(),inputMaxAmount(), inputRentalType(), inputStandardVilla(), inputComfortableDescriptionVilla(), inputAreaPoolVilla(), inputFloorVilla() );
        servicesVillaList.add(villa);
    }
    public void addNewHouse(){
        House house = new House(inputNameServices(), inputAreaServices(), inputCostServices(),inputMaxAmount(), inputRentalType(), inputStandardVilla(),inputComfortableDescriptionVilla(),inputFloorVilla());
        servicesHouseList.add(house);
    }
    public void addNewRoom(){
        String accompaniedService = "FREE";
        Room room = new Room(inputNameServices(), inputAreaServices(), inputCostServices(),inputMaxAmount(), inputRentalType(),accompaniedService);
        servicesRoomList.add(room);
    }
    private String inputNameServices() {
        System.out.println("Input name services :  ");
        return Main.inputScanner().nextLine();
    }
    private double inputAreaServices() {
        System.out.println("Input area services :  ");
        return Main.inputScanner().nextInt();
    }
    private double inputCostServices() {
        System.out.println("Input cost services :  ");
        return Main.inputScanner().nextInt();
    }
    private int inputMaxAmount() {
        System.out.println("Soos luongwj thuee :  ");
        return Main.inputScanner().nextInt();
    }
    private String inputQuantityIncluded() {
        System.out.println("Input Quantity Included :  ");
        return Main.inputScanner().nextLine();
    }
    private String inputRentalType() {
        System.out.println("Input rental type :  ");
        return Main.inputScanner().nextLine();
    }
    private String inputStandardVilla() {
        System.out.println("Input Standard Villa :  ");
        return Main.inputScanner().nextLine();
    }
    private String inputComfortableDescriptionVilla() {
        System.out.println("Input Comfortable Description Villa :  ");
        return Main.inputScanner().nextLine();
    }
    private int inputFloorVilla() {
        System.out.println("Input Floor Villa :  ");
        return Main.inputScanner().nextInt();
    }
    private String inputStandardHouse() {
        System.out.println("Input Standard House :  ");
        return Main.inputScanner().nextLine();
    }
    private String inputComfortableDescriptionHouse() {
        System.out.println("Input Comfortable Description House :  ");
        return Main.inputScanner().nextLine();
    }
    private int inputFloorHouse() {
        System.out.println("Input Floor House :  ");
        return Main.inputScanner().nextInt();
    }
    private double inputAreaPoolVilla() {
        System.out.println("Input pool villa :  ");
        return Main.inputScanner().nextInt();
    }
    public void showAllVilla(){
        for (Services villa : servicesVillaList){
            System.out.println(villa.ShowInfor());
        }
    }
    public void showAllHouse(){
        for (Services house : servicesHouseList){
            System.out.println(house.ShowInfor());
        }
    }
    public void showAllRoom(){
        for (Services room : servicesRoomList){
            System.out.println(room.ShowInfor());
        }
    }
    @Override
    public String ShowInfor() {
        return null;
    }
}
