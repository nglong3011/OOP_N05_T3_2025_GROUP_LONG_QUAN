
package model;
import java.util.ArrayList;

public class HoaDon {
    private KhachHang khach;
    private ArrayList<MonAn> dsMon;
    private ArrayList<Integer> soLuong;

    public HoaDon(KhachHang khach) {
        this.khach = khach;
        this.dsMon = new ArrayList<>();
        this.soLuong = new ArrayList<>();
    }

    public void themMon(MonAn mon, int sl) {
        dsMon.add(mon);
        soLuong.add(sl);
    }

    public void inHoaDon() {
        System.out.println("\n=== HÓA ĐƠN ===");
        System.out.println("Khách hàng: " + khach.getTen());
        System.out.println("SĐT: " + khach.getSoDienThoai());
        double tong = 0;

        for (int i = 0; i < dsMon.size(); i++) {
            MonAn mon = dsMon.get(i);
            int sl = soLuong.get(i);
            double tien = mon.getGia() * sl;

            System.out.println(mon.getTen() + " x " + sl + " = " + tien + " VND");
            tong += tien;
        }

        System.out.println("----------------------");
        System.out.println("TỔNG TIỀN: " + tong + " VND");
    }
}
