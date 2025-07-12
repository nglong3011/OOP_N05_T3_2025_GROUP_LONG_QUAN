package main;

import java.util.Scanner;
import model.MonAn;
import model.KhachHang;
import model.HoaDon;

public class ListMonAn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.print("Nhập tên khách hàng: ");
        String ten = sc.nextLine();

        System.out.print("Nhập số điện thoại: ");
        String sdt = sc.nextLine();

        KhachHang khach = new KhachHang(ten, sdt);
        HoaDon hoaDon = new HoaDon(khach);

      
        MonAn[] menu = new MonAn[5];
        menu[0] = new MonAn("Phở bò", 40000);
        menu[1] = new MonAn("Bánh mì", 20000);
        menu[2] = new MonAn("Xôi", 25000);
        menu[3] = new MonAn("Bún riêu", 30000);
        menu[4] = new MonAn("Cháo", 28000);

        // Hiển thị menu
        System.out.println("\n=== MENU ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].getTen() + " - " + menu[i].getGia() + " VND");
        }

       
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Số lượng " + menu[i].getTen() + ": ");
            int sl = sc.nextInt();
            if (sl > 0) {
                hoaDon.themMon(menu[i], sl);
            }
        }

       
        hoaDon.inHoaDon();

        sc.close();
    }
}
