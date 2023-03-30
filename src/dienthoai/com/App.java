package dienthoai.com;

import dienthoai.com.controller.Controller;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Xem dien thoai");
            System.out.println("2. Tao dien thoai");
            System.out.println("3. Sua dien thoai");
            System.out.println("4. Xoa dien thoai");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    controller.xem();
                    break;
                case 2:
                    controller.them();
                    break;
                case 3:
                    controller.sua();
                    break;
                case 4:
                    controller.xoa();
                    break;
                case 0:
                    System.exit(1);
                case 5:
                    System.out.println("Yeu cau ko ton tai");

            }


        }while(true);

    }
}
