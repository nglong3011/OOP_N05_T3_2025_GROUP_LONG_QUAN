package model;

import java.util.Scanner;

public class ListMonAn {
    public static void goimon(Scanner sc, HoaDon hoaDon) {
        MonAn[] menu = new MonAn[5];
        menu[0] = new MonAn("Phở bò", 40000);
        menu[1] = new MonAn("Bánh mì", 20000);
        menu[2] = new MonAn("Xôi", 25000);
        menu[3] = new MonAn("Bún riêu", 30000);
        menu[4] = new MonAn("Cháo", 28000);

        System.out.println("\n=== MENU MÓN ĂN ===");
        for (int i = 0; i < menu.length; i++) {
            String signature = "";
    if (menu[i].getTen().equalsIgnoreCase("Xôi") || menu[i].getTen().equalsIgnoreCase("Phở bò")) {
        signature = " *Signature*";
    }
            System.out.println((i + 1) + ". " + menu[i].getTen() + " - " + menu[i].getGia() + " VND");
        }

        for (int i = 0; i < menu.length; i++) {
            System.out.print("Số lượng " + menu[i].getTen() + ": ");
            int sl = sc.nextInt();
            if (sl > 0) {
                hoaDon.themMon(menu[i], sl);
            }
        }
        sc.nextLine(); 
    }
}

