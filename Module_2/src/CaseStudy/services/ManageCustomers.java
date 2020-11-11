package CaseStudy.services;

import CaseStudy.models.*;
import CaseStudy.view.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageCustomers implements IManageCustomers{
    public static Scanner input = new Scanner(System.in);
    public static List<Customers> customerList = new ArrayList<>();
    public static List<Villa> listVilla =  ManageServices.getServicesVillaList();
    public static List<House> listHouse =  ManageServices.getServicesHouseList();
    public static List<Room> listRoom = ManageServices.getServicesRoomList();

    public ManageCustomers(){
    }

@Override
    public void  addNewCustomer(){
        int id = (customerList.size() > 0 ) ? (customerList.size() + 1) : 1;
        System.out.println("Customer Id = " + id);
        String nameCustomer  = inputNameCustomer();
        String birthday = inputBirthday();
        String cmnd = inputCmnd();
        String phoneNumber = inputPhoneNumber();
        String email = inputEmail();
        String typeCustomer = inputTypeCustomer();
        String address = inputAddress();
        Services typeServices = null;

        System.out.println("Chọn Services"+
                "\n 1.Villa "+
                "\n 2.House" +
                "\n 3.Room");
        switch (Main.inputScanner().nextInt()){
            case 1:{
                System.out.println("Chọn Villa!");
                for (int i = 0 ; i < listVilla.size(); i++){
                    System.out.println((i+1)+ " " + listVilla.get(i).getNameService());
                }
                typeServices = listVilla.get(Main.inputScanner().nextInt() - 1);
                break;
            }
            case 2:{
                System.out.println("Chọn House!");
                for (int i = 0 ; i < listHouse.size(); i++){
                    System.out.println((i+1)+ " " + listHouse.get(i).getNameService());
                }
                typeServices = listHouse.get(Main.inputScanner().nextInt() - 1);
                break;
            }
            case 3:{
                System.out.println("Chọn Room!");
                for (int i = 0 ; i < listRoom.size(); i++){
                    System.out.println((i+1)+ " " + listRoom.get(i).getNameService());
                }
                typeServices = listRoom.get(Main.inputScanner().nextInt() - 1);
                break;
            }
        }
        Customers customer = new Customers(id,nameCustomer,birthday,cmnd,phoneNumber,email,typeCustomer,address,typeServices);
        customerList.add(customer);
//        Đọc ghi file vào đây
        showInformationOfCustomer();
    }
    private String inputNameCustomer() {
        System.out.println("Input name customer :  ");
        return input.nextLine();
    }
    private String inputBirthday(){
        System.out.println("Input birthday customer :  ");
        return input.nextLine();
    }
    private String inputCmnd(){
        System.out.println("Input cmnd :  ");
        return input.nextLine();
    }
    private String inputPhoneNumber(){
        System.out.println("Input phone number :  ");
        return input.nextLine();
    }
    private String inputEmail(){
        System.out.println("Input email :  ");
        return  input.nextLine();
    }
    private String inputTypeCustomer(){
        System.out.println("Input type customer");
        return  input.nextLine();
    }
    private String inputAddress(){
        System.out.println("Input address :  ");
        return input.nextLine();
    }

    @Override
    public void showInformationOfCustomer(){
//        Đọc file ở đây
        for (Customers customer : customerList){
            System.out.println(customer.showInfor());
        }
    }
}

