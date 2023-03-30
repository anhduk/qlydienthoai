package dienthoai.com.service;

import dienthoai.com.model.SmartPhone;

import java.util.ArrayList;

import static com.sun.xml.internal.bind.api.impl.NameConverter.smart;

public class PhoneService {
    private static ArrayList<SmartPhone> list;

    public void them(SmartPhone smartPhone) {
        list.add(smartPhone);
        System.out.println("Tao thanh cong");


    }
    public void sua(SmartPhone smartPhone){
        for (int i = 0; i < list.size(); i++) {
            if (smartPhone.getId() == list.get(i).getId());

            list.get(i).setName(smartPhone.getName());
            list.get(i).setHang(smartPhone.getHang());
            list.get(i).setPrice(smartPhone.getPrice());
            list.get(i).setType(smartPhone.getType());
            break;
        }
    }
    public void xoa(int id) {
     try {
         for (int i = 0; i < list.size(); i++) {
             if (id == list.get(i).getId()) ;
             list.remove(i);
             break;

         }
    }catch (NullPointerException e) {
         System.out.println("Loi");
     }catch (ArithmeticException a) {
         System.out.println(a.getMessage());
     }catch (Exception e){
     }

    }

    public static ArrayList<SmartPhone> xem() {
        if (list != null) {
            list = new ArrayList<>();
            SmartPhone smartPhone  = new SmartPhone("ip 14", 1, "cam ung", "apple", 20000);
            SmartPhone smartPhone1 =new SmartPhone("note 20", 2, "cam ung", "samsung", 12000);
            SmartPhone smartPhone2 = new SmartPhone("ip 11", 3, "cam ung", "iphone", 10000);
            SmartPhone smartPhone3 = new SmartPhone("z fold", 4,"gap", "samsung", 20000);
            SmartPhone smartPhone4 = new SmartPhone("ip 13", 5,"cam ung", "iphone", 13000);
            list.add(smartPhone);
            list.add(smartPhone1);
            list.add(smartPhone2);
            list.add(smartPhone3);
            list.add(smartPhone4);
        }
            return list;

        }
    }

