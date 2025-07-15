

   import java.util.ArrayList;
import java.util.Scanner;

public class DoUongManager {
    private ArrayList<DoUong> danhSachDoUong = new ArrayList<>();
    public void themDoUong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên đồ uống: ");
        String tenDoUong = sc.nextLine();
        System.out.print("Nhập giá đồ uống: ");
        double gia = Double.parseDouble(sc.nextLine());
        danhSachDoUong.add(new DoUong(tenDoUong, gia));
        System.out.println("Thêm đồ uống thành công!");
    }
    public void hienThiDanhSach() {
        System.out.println("Danh sách đồ uống:");
        for (DoUong du : danhSachDoUong) {
            System.out.println("- " + du.getTenDoUong() + " | Giá: " + du.getGia());
        }
    }
    public void capNhatDoUong(String tenCanSua) {
        for (DoUong du : danhSachDoUong) {
            if (du.getTenDoUong().equalsIgnoreCase(tenCanSua)) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập tên mới: ");
                du.setTenDoUong(sc.nextLine());
                System.out.print("Nhập giá mới: ");
                du.setGia(Double.parseDouble(sc.nextLine()));
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy đồ uống để cập nhật.");
    }    public void xoaDoUong(String tenCanXoa) {
        boolean removed = danhSachDoUong.removeIf(du -> du.getTenDoUong().equalsIgnoreCase(tenCanXoa));
        if (removed) {
            System.out.println("Xóa đồ uống thành công!");
        } else {
            System.out.println("Không tìm thấy đồ uống để xóa.");
        }
    }
}
