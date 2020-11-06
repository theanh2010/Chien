package _12_java_collection_framework.bai_tap.arraylist_linkedlist_java_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManagerProduct extends Product {
    public static int count = 0;
    public static List<Product> list = new ArrayList<>();
    public ManagerProduct() {
    }

    public ManagerProduct(int id, String name, int amount) {
        super(id, name, amount);
    }

    public void addProductNew(){
        setId(count++);
        setName(inputName());
        setAmount(inputAmount());
        Product product = new Product(getId(),getName(),getAmount());
        list.add(product);
    }
    public String inputName(){
        System.out.println("Nhập tên: ");
        return Main.getInput().nextLine();
    }
    public int inputAmount(){
        System.out.println("Nhập giá: ");
        return Main.getInput().nextInt();
    }
    public void displayProduct(){
        for (Product p : list) {
            System.out.println("ID : " + p.getId());
            System.out.println("Tên : " + p.getName());
            System.out.println("Số lượng : " + p.getAmount());
        }
    }
    public  void removeProduct(){
        System.out.println("Nhập id của sản phẩm muốn xóa: ");
        int id = Main.getInput().nextInt();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                list.remove(i);
                System.out.println("Đã xóa thành công");
            }
        }
    }

    public void searchProduct(){
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String  name = Main.getInput().nextLine();
        for (Product p : list){
            if (p.getName().equals(name)){
                System.out.println("ID " + p.getId() +
                "\n Tên: " + p.getName() +
                        "\n Số lượng: "+ p.getAmount() +
                        "\n ---------------------------------");
            }
        }
    }

    public void sortProduct(){
        AmountComparator amountComparator = new AmountComparator();
        Collections.sort(list, amountComparator);
        System.out.println("Đã sắp xếp từ bé tới lơn!");
    }

}

