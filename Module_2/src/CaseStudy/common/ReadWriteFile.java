package CaseStudy.common;

import CaseStudy.models.Customers;
import CaseStudy.models.House;
import CaseStudy.models.Room;
import CaseStudy.models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static void writeFile(String filePath, String line){
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readDataCustomer(List<Customers> customersList){
        //        Đọc file ở đây
        File file = new File("src/CaseStudy/data/Customers.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null ){
                String[] elementsLine ;
                elementsLine = line.split(",");
                Customers customers1 = new Customers(Integer.parseInt(elementsLine[0]),elementsLine[1],elementsLine[2],elementsLine[3],elementsLine[4],elementsLine[5],elementsLine[6],elementsLine[7],elementsLine[8]);
                customersList.add(customers1);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String[]> readFile(String filePath){
        List<String[]> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")){
                String[] elementLine = line.split(",");
                list.add(elementLine);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
