package dienthoai.com.controller;

import dienthoai.com.model.SmartPhone;
import dienthoai.com.service.PhoneService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private PhoneService phoneService = new PhoneService();

    public void xem() {
        ArrayList<SmartPhone> list = phoneService.xem();
        for (int i = 0; i < list.size(); i++) {

        System.out.println(list.get(i).getName());
        }
    }

    public void them() {
        Scanner scanner = new Scanner(System.in);
        SmartPhone smartPhone = new SmartPhone();
        System.out.println("Nhap ten");
        smartPhone.setName(scanner.nextLine());
        System.out.println("Nhap id");
        smartPhone.setId(scanner.nextInt());
        System.out.println("Nhap loai");
        smartPhone.setType(scanner.nextLine());
        System.out.println("Nhap hang");
        smartPhone.setHang(scanner.nextLine());
        System.out.println("Nhap gia");
        smartPhone.setPrice(scanner.nextLong());


        phoneService.them(smartPhone);

    }

    public void sua() {
        Scanner scanner = new Scanner(System.in);

        SmartPhone smartPhone = new SmartPhone();
        System.out.println("Nhap id");
        smartPhone.setId(scanner.nextInt());
        System.out.println("Nhap ten");
        smartPhone.setName(scanner.nextLine());
        System.out.println("Nhap loai");
        smartPhone.setType(scanner.nextLine());
        System.out.println("Nhap hang");
        smartPhone.setHang(scanner.nextLine());
        System.out.println("Nhap gia");
        smartPhone.setPrice(scanner.nextLong());

        phoneService.sua(smartPhone);
    }

    public void xoa(){
       try{
           Scanner scanner = new Scanner(System.in);
           System.out.println("Nhap id");
           int id = scanner.nextInt();
           phoneService.xoa(id);
       }catch (Exception e) {
           throw new RuntimeException(e.getMessage(), e.getCause());
       }finally{
           System.out.println("Hen gap lai");
       }
    }
}
