package CaseStudy.common;

import CaseStudy.exception.NameException;
import CaseStudy.view.Main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexData {
    public static String regexStr(String temp , String regex){
        boolean check = true;
        do {
            if (temp.matches(regex)){
                check = false;
            } else {
                System.out.println("Nhập tên sai định dạng, nhập lại");
                temp = Main.inputScanner().nextLine();
            }
        } while (check);
        return temp;
    }
    public static String regexInt(String temp, String regex){
        boolean check = true;
        do {
            if (temp.matches(regex)){
                check = false;
            } else {
                System.out.println("Nhập areaServices sai, nhập lại");
                temp = Main.inputScanner().nextLine();
            }
        } while (check);
        return temp;
    }
    public static String regexCost(String temp, String regex){
        boolean check = true;
        do {
            if (temp.matches(regex)){
                check = false;
            } else {
                System.out.println("Nhập rentCost sai, nhập lại");
                temp = Main.inputScanner().nextLine();
            }
        } while (check);
        return temp;
    }
    public static String regexAmount(String temp, String regex){
        boolean check = true;
        do {
            if (temp.matches(regex) ){
                check = false;
            } else {
                System.out.println("Nhập số lượng người thuê sai, nhập lại");
                temp = Main.inputScanner().nextLine();
            }
        } while (check);
        return temp;
    }

    public static String regexBonusServices(String temp,String regex){
        boolean check = true;
        do {
            if (temp.matches(regex)){
                check = false;
            } else {
                System.out.println("Nhập sai, nhập lại");
                temp = Main.inputScanner().nextLine();
            }
        } while (check);
        return temp;
    }

    public static String regexCustomer(String temp ,String regex){
        boolean check = true;
        do {
            try{
                if (temp.matches(regex)){
                    check = false;
                } else {
                    throw new NameException("Nhập sai định dạng, nhập lại");
                }
            }catch (NameException e ){
                System.err.println(e.getMessage());
                temp = Main.inputScanner().nextLine();
            }
        } while (check);
        return temp;
}

}
