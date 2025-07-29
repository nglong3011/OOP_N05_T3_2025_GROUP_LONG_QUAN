package model;

import java.util.Scanner;
import model.ListMonAn;
import model.ListDoUong;
import model.HoaDon;
import model.KhachHang;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Quán Ăn Long Quân ====");
   
        System.out.print("Nhập tên khách hàng: ");
        String ten = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String sdt = sc.nextLine();

        KhachHang khach = new KhachHang(ten, sdt);
        HoaDon hoaDon = new HoaDon(khach);  

        
        ListMonAn.goimon(sc, hoaDon);

       
        System.out.print("Bạn có muốn chọn đồ uống không? (y/n): ");
        String chonDoUong = sc.nextLine();
        if (chonDoUong.equalsIgnoreCase("y")) {
            ListDoUong.goidoUong(sc, hoaDon);
        }

      
        hoaDon.inHoaDon();

        sc.close();
    }
}
