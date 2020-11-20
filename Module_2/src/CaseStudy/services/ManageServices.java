package CaseStudy.services;

import CaseStudy.common.ReadWriteFile;
import CaseStudy.common.RegexData;
import CaseStudy.models.House;
import CaseStudy.models.Room;
import CaseStudy.models.Services;
import CaseStudy.models.Villa;
import CaseStudy.view.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ManageServices extends Services {
    public  static final String REGEX_INT = "^[1-9][0-9]|[0-9]+$" ;
    public  static final String REGEX_STR = "[A-Z][a-z]+" ;
    public  static final String REGEX_COST = "^[1-9][0-9]|[0-9]+$" ;
    public  static final String REGEX_AMOUNT = "^[0][1-9]|[1][0-9]|[2][0]$" ;
    public  static final String REGEX_BONUS = "(massage)|(karaoke)|(food)|(drink)|(car)" ;
    public static List<Villa> servicesVillaList = new ArrayList<>();
    public static List<House> servicesHouseList = new ArrayList<>();
    public static List<Room> servicesRoomList = new ArrayList<>();

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

    public ManageServices(String nameService, String area, String rentCost, String maxAmount, String rentType) {
        super( nameService, area, rentCost, maxAmount, rentType);
    }

    public void addNewVilla(){
        Villa villa = new Villa(inputNameServices(), inputAreaServices(), inputCostServices(),inputMaxAmount(), inputRentalType(), inputStandardVilla(), inputComfortableDescriptionVilla(), inputAreaPoolVilla(), inputFloorVilla() );
        servicesVillaList.add(villa);
//        ReadWriteFile.writeDataVilla(servicesVillaList);
        ReadWriteFile.writeFile("src/CaseStudy/data/Villa.csv",villa.getNameService() +","+ villa.getArea()+","+villa.getRentCost()+","+villa.getMaxAmount()+","+villa.getRentType()+","+villa.getTypeRoom()+","+villa.getOtherService()+","+villa.getPoolArea()+","+villa.getFloors());
    }
    public void addNewHouse(){
        House house = new House(inputNameServices(), inputAreaServices(), inputCostServices(),inputMaxAmount(), inputRentalType(), inputStandardVilla(), inputComfortableDescriptionVilla(), inputFloorVilla() );
        servicesHouseList.add(house);
//        ReadWriteFile.writeDataHouse(servicesHouseList);
        ReadWriteFile.writeFile("src/CaseStudy/data/House.csv",house.getNameService() +","+ house.getArea()+","+house.getRentCost()+","+house.getMaxAmount()+","+house.getRentType()+","+house.getTypeRoom()+","+house.getOtherService()+","+house.getFloors());
    }

    public void addNewRoom(){
        String accompaniedService = "FREE";
        Room room = new Room(inputNameServices(), inputAreaServices(), inputCostServices(),inputMaxAmount(), inputRentalType(),accompaniedService);
        servicesRoomList.add(room);
//        ReadWriteFile.writeDataRoom(servicesRoomList);
        ReadWriteFile.writeFile("src/CaseStudy/data/Room.csv",room.getNameService() +","+ room.getArea()+","+room.getRentCost()+","+room.getMaxAmount()+","+ room.getRentType()+","+ accompaniedService);
    }

    private String inputNameServices() {
        System.out.println("Input name services :  ");
        return RegexData.regexStr(Main.inputScanner().nextLine(),REGEX_STR);
    }
    private String inputAreaServices() {
        System.out.println("Input area services :  ");
        return RegexData.regexInt(Main.inputScanner().nextLine(),REGEX_INT);
    }
    private String inputCostServices() {
        System.out.println("Input cost services :  ");
        return RegexData.regexCost(Main.inputScanner().nextLine(), REGEX_COST);
    }
    private String inputMaxAmount() {
        System.out.println("Soos luongwj thuee :  ");
        return RegexData.regexAmount(Main.inputScanner().nextLine(), REGEX_AMOUNT);
    }

    private String inputRentalType() {
        System.out.println("Input rental type :  ");
        return RegexData.regexStr(Main.inputScanner().nextLine(),REGEX_STR);
    }
    private String inputStandardVilla() {
        System.out.println("Input Standard Villa :  ");
        return RegexData.regexStr(Main.inputScanner().nextLine(),REGEX_STR);
    }
    private String inputComfortableDescriptionVilla() {
        System.out.println("Input Comfortable Description Villa :  ");
        return RegexData.regexBonusServices(Main.inputScanner().nextLine(), REGEX_BONUS);
    }
    private String inputFloorVilla() {
        System.out.println("Input Floor Villa :  ");
        return RegexData.regexInt(Main.inputScanner().nextLine(),REGEX_INT);
    }
    private String inputAreaPoolVilla() {
        System.out.println("Input pool villa :  ");
        return Main.inputScanner().nextLine();
    }
    public void showAllVilla(){
        List<String[]> listVilla = ReadWriteFile.readFile("src/CaseStudy/data/Villa.csv");
        System.out.println(listVilla);
        servicesVillaList.clear();
        for (String[] s: listVilla){
            Villa villa = new Villa(s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8]);
            servicesVillaList.add(villa);
        }
        if (servicesVillaList.isEmpty()){
            System.out.println("Danh sách trống");
        } else {
            for (Villa villa : servicesVillaList) {
                System.out.println(villa.ShowInfor());
            }
        }
    }
    public void showAllHouse(){
        List<String[]> listHouse = ReadWriteFile.readFile("src/CaseStudy/data/House.csv");
        System.out.println(listHouse);
        servicesHouseList.clear();
        for (String[] s: listHouse){
            House house = new House(s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7]);
            servicesHouseList.add(house);
        }
        if (servicesHouseList.isEmpty()){
            System.out.println("Danh sách trống");
        } else {
            for (House house : servicesHouseList) {
                System.out.println(house.ShowInfor());
            }
        }
//        for (Services house : servicesHouseList){
//            System.out.println(house.ShowInfor());
//        }
    }
    public void showAllRoom(){
        List<String[]> listRoom = ReadWriteFile.readFile("src/CaseStudy/data/Room.csv");
        System.out.println(listRoom);
        servicesRoomList.clear();
        for (String[] s: listRoom){
            Room room = new Room(s[0], s[1], s[2], s[3], s[4], s[5]);
            servicesRoomList.add(room);
        }
        if (servicesRoomList.isEmpty()){
            System.out.println("Danh sách trống");
        } else {
            for (Room room : servicesRoomList) {
                System.out.println(room.ShowInfor());
            }
        }
//        for (Services room : servicesRoomList){
//            System.out.println(room.ShowInfor());
//        }
    }
    @Override
    public String ShowInfor() {
        return null;
    }
}
