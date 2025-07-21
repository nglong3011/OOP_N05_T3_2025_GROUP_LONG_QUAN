package model;

import java.util.Scanner;

public class ListDoUong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên khách hàng: ");
        String ten = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String sdt = sc.nextLine();

        KhachHang khach = new KhachHang(ten, sdt);
        HoaDon hoaDon = new HoaDon(khach);

        
        DoUong[] menu = new DoUong[5];
        menu[0] = new DoUong("Rượu", 120000);
        menu[1] = new DoUong("Bia", 20000);
        menu[2] = new DoUong("Nước cam", 25000);
        menu[3] = new DoUong("Coca", 18000);
        menu[4] = new DoUong("Pepsi", 18000);

        System.out.println("\n=== MENU ĐỒ UỐNG ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].getTen() + " - " + menu[i].getGia() + " VND");
        }

      
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Số lượng " + menu[i].getTen() + ": ");
            int sl = sc.nextInt();
            if (sl > 0) {
             
                MonAn temp = new MonAn(menu[i].getTen(), menu[i].getGia());
                hoaDon.themMon(temp, sl);
            }
        }

      
        hoaDon.inHoaDon();

        sc.close();
    }
}
