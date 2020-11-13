package CaseStudy.view;

import CaseStudy.controller.MainController;
import CaseStudy.services.ManageServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        ManageServices manageServices = new ManageServices();
        manageServices.readDataVilla();
        mainController.showMenu();
    }
    public static Scanner inputScanner(){
        Scanner input = new Scanner(System.in);
        return input;
    }
}
