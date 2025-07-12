import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập tên khách hàng: ");
        String ten = sc.nextLine();

        System.out.print("Nhập số điện thoại: ");
        String sdt = sc.nextLine();

        KhachHang khach = new KhachHang(ten, sdt);

     
        MonAn[] menu = new MonAn[5];
        menu[0] = new MonAn("Phở bò", 40000);
        menu[1] = new MonAn("Bánh mì", 20000);
        menu[2] = new MonAn("Xôi", 25000);
        menu[3] = new MonAn("Bún riêu", 30000);
        menu[4] = new MonAn("Cháo", 28000);

        int[] soLuong = new int[menu.length];

      
        System.out.println("\n=== MENU ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].ten + " - " + menu[i].gia + " VND");
        }

      
        System.out.println("\nNhập số lượng từng món:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i].ten + ": ");
            soLuong[i] = sc.nextInt();
        }


        System.out.println("\n=== HÓA ĐƠN ===");
        System.out.println("Khách hàng: " + khach.getTen());
        System.out.println("SĐT: " + khach.getSoDienThoai());
        double tongTien = 0;

        for (int i = 0; i < menu.length; i++) {
            if (soLuong[i] > 0) {
                double tienMon = menu[i].gia * soLuong[i];
                System.out.println(menu[i].ten + " x " + soLuong[i] + " = " + tienMon + " VND");
                tongTien += tienMon;
            }
        }

        System.out.println("--------------------------");
        System.out.println("TỔNG TIỀN: " + tongTien + " VND");
        sc.close();
    }
}
