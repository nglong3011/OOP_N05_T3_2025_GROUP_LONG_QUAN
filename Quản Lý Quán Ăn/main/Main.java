import java.util.ArrayList;
import java.util.Scanner;
import model.KhachHang;

public class Main {
    static ArrayList<KhachHang> danhSachKH = new ArrayList<>();

    public static void themKhachHang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã KH: ");
        String ma = sc.nextLine();
        System.out.print("Nhập tên KH: ");
        String ten = sc.nextLine();
        System.out.print("Nhập SĐT: ");
        String sdt = sc.nextLine();

        danhSachKH.add(new KhachHang(ma, ten, sdt));
    }

    public static void hienThiDanhSachKH() {
        for (KhachHang kh : danhSachKH) {
            kh.hienThiThongTin();
        }
    }

    public static void capNhatKhachHang(String maKH) {
        for (KhachHang kh : danhSachKH) {
            if (kh.getMaKH().equals(maKH)) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Tên mới: ");
                kh.setTenKH(sc.nextLine());
                System.out.print("SĐT mới: ");
                kh.setSoDienThoai(sc.nextLine());
                break;
            }
        }
    }

    public static void xoaKhachHang(String maKH) {
        danhSachKH.removeIf(kh -> kh.getMaKH().equals(maKH));
    }

    public static void main(String[] args) {
        // Ví dụ test:
        themKhachHang();
        hienThiDanhSachKH();
        capNhatKhachHang("KH01"); // sửa bằng mã bạn nhập ở trên
        hienThiDanhSachKH();
    }
}
