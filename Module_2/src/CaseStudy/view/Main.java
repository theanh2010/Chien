package CaseStudy.view;

import CaseStudy.controller.MainController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        mainController.showMenu();
    }
    public static Scanner inputScanner(){
        Scanner input = new Scanner(System.in);
        return input;
    }
}
