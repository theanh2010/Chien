package CaseStudy.services;

import CaseStudy.common.ReadWriteFile;
import CaseStudy.common.RegexData;
import CaseStudy.exception.NameException;
import CaseStudy.models.*;
import CaseStudy.sort.AgeComparator;
import CaseStudy.view.Main;

import java.util.*;

public class ManageCustomers implements IManageCustomers{
    private static final String NAME_REGEX ="^([A-Z][a-z]+\\s)+(|[A-Z][a-z]+)$";
    public  static final String REGEX_STR = "[A-Z][a-z]*" ;
    private static String note = "You entered incorrectly.Please re-enter";
    private static final String BIRTHDAY_REGEX = "^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
            "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
            "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";
    private static final String EMAIL_REGEX ="^[a-z0-9_]+[a-z0-9]@([a-z0-9]+\\.)[a-z]+(|\\.[a-z]+)$";
    private static final String GENDER_REGEX = "^[mM][aA][lL][eE]|[fF][eE][mM][aA][lL][eE]|[uU][nN][kK][nN][oO][wW]$";
    private static final String CMND_REGEX = "[0-9]{9}";
    private static final String PHONE_NUMBER = "^0([0-9]{9})$";
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
        int choose = 0;
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
                choose = Main.inputScanner().nextInt() - 1;
                listVilla.get(choose);
                Customers customer = new Customers(id,nameCustomer,birthday,cmnd,phoneNumber,email,typeCustomer,address,listVilla.get(choose).getNameService());
                customerList.add(customer);
                ReadWriteFile.writeFile("src/CaseStudy/data/Customers.csv",customer.getId() +","+ customer.getNameCustomer()+","+customer.getBirthday()+","+customer.getCmnd()+","+customer.getPhoneNumber()+","+customer.getEmail()+","+customer.getTypeCustomer()+","+customer.getAddress() + ","+ customer.getTypeServices());
                showInformationOfCustomer();
                break;
            }
            case 2:{
                System.out.println("Chọn House!");
                for (int i = 0 ; i < listHouse.size(); i++){
                    System.out.println((i+1)+ " " + listHouse.get(i).getNameService());
                }
                choose = Main.inputScanner().nextInt() - 1;
                listHouse.get(choose);
                Customers customer = new Customers(id,nameCustomer,birthday,cmnd,phoneNumber,email,typeCustomer,address,listHouse.get(choose).getNameService());
                customerList.add(customer);
                ReadWriteFile.writeFile("src/CaseStudy/data/Customers.csv",customer.getId() +","+ customer.getNameCustomer()+","+customer.getBirthday()+","+customer.getCmnd()+","+customer.getPhoneNumber()+","+customer.getEmail()+","+customer.getTypeCustomer()+","+customer.getAddress()+ ","+ customer.getTypeServices());
                showInformationOfCustomer();
                break;
            }
            case 3:{
                System.out.println("Chọn Room!");
                for (int i = 0 ; i < listRoom.size(); i++){
                    System.out.println((i+1)+ " " + listRoom.get(i).getNameService());
                }
                choose = Main.inputScanner().nextInt() - 1;
                listRoom.get(choose);
                Customers customer = new Customers(id,nameCustomer,birthday,cmnd,phoneNumber,email,typeCustomer,address,listHouse.get(choose).getNameService());
                customerList.add(customer);
                ReadWriteFile.writeFile("src/CaseStudy/data/Customers.csv",customer.getId() +","+ customer.getNameCustomer()+","+customer.getBirthday()+","+customer.getCmnd()+","+customer.getPhoneNumber()+","+customer.getEmail()+","+customer.getTypeCustomer()+","+customer.getAddress()+ ","+ customer.getTypeServices());
                showInformationOfCustomer();
                break;
            }
        }
    }
    private String inputNameCustomer() {
        System.out.println("Input name customer :  ");
        return RegexData.regexCustomer(Main.inputScanner().nextLine(),NAME_REGEX);
    }
    private String inputBirthday(){
        System.out.println("Input birthday customer :  ");
        return RegexData.regexCustomer(Main.inputScanner().nextLine(),BIRTHDAY_REGEX);
    }
    private String inputCmnd(){
        System.out.println("Input cmnd :  ");
        return RegexData.regexCustomer(Main.inputScanner().nextLine(),CMND_REGEX);
    }
    private String inputPhoneNumber(){
        System.out.println("Input phone number :  ");
        return RegexData.regexCustomer(Main.inputScanner().nextLine(),PHONE_NUMBER);
    }
    private String inputEmail(){
        System.out.println("Input email :  ");
        return RegexData.regexCustomer(Main.inputScanner().nextLine(),EMAIL_REGEX);
    }
    private String inputTypeCustomer(){
        System.out.println("Input type customer");
        return RegexData.regexCustomer(Main.inputScanner().nextLine(),REGEX_STR);    }
    private String inputAddress(){
        System.out.println("Input address :  ");
        return RegexData.regexCustomer(Main.inputScanner().nextLine(),REGEX_STR);
    }

    public  void readDataCustomer() {
        ReadWriteFile.readDataCustomer(customerList);
    }

    public void showInformationOfCustomer(){
        Collections.sort(customerList, new AgeComparator());
        for (Customers customer : customerList){
            System.out.println(customer.showInfor());
        }
    }
}

