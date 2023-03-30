package file;

import dienthoai.com.model.Phone;
import exeption.MyExeption;

import java.io.*;



public class MyFile {
    public static void main(String[] args) {
        output();
        input();
    }
    public void ghiRaFile(Object a, String nameFile) {
        try {
            FileOutputStream fos = new FileOutputStream("phone.txt");
            ObjectOutput os = new ObjectOutputStream(fos);
            os.writeObject(a);
            os.close();
        } catch (Exception e) {
        }
    }
    public Object docFile(String file){
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object = ois.readObject();

            ois.close();
            return object;
        }catch (Exception e){
            System.out.println("loi file");
            throw new MyExeption(e.getMessage(), "404");
        }
    }

    public static void output() {
        try {
            FileOutputStream fos = new FileOutputStream("phone.txt");
            ObjectOutput os = new ObjectOutputStream(fos);
            Phone phone = new Phone("Iphone", 1, "ip");
            os.writeObject(phone);
            os.close();
        } catch (Exception e) {
        }
    }
        public static void input(){
            try {
                FileInputStream fis = new FileInputStream("phone.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Phone phone = (Phone) ois.readObject();
                ois.close();
                System.out.println(phone.toString());

            } catch (Exception e) {
            }
        }
    }




