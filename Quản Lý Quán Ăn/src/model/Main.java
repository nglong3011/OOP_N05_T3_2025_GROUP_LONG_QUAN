package model;

import java.util.Scanner;
import model.ListMonAn;
import model.ListDoUong;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n=== QUẢN LÝ QUÁN ĂN ===");
            System.out.println("1. Gọi món ăn");
            System.out.println("2. Gọi đồ uống");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");

    
            while (!sc.hasNextInt()) {
                System.out.print("Vui lòng nhập số: ");
                sc.next();
            }
            luaChon = sc.nextInt();
            sc.nextLine(); 

            switch (luaChon) {
                case 1:
                    ListMonAn.main(null);
                    break;
                case 2:
                    ListDoUong.main(null);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (luaChon != 0);

        sc.close();
    }
}


