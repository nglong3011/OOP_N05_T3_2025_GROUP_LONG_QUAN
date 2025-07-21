package model;

public class KhachHang {

    private String ten;
    private String sdt;
    private String maKH;
    private static int dem = 1;

    public KhachHang(String ten, String sdt) {
        this.ten = ten;
        this.sdt = sdt;
        this.maKH = "KH" + String.format("%02d", dem++);
    }

    public String getTen() {
        return ten;
    }

    public void setTenKH(String ten) {
        this.ten = ten;
    }

    public String getSoDienThoai() {
        return sdt;
    }

    public void setSoDienThoai(String sdt) {
        this.sdt = sdt;
    }

    public String getMaKH() {
        return maKH;
    }

    public void hienThiThongTin() {
        System.out.println("Mã KH: " + maKH + " - Tên: " + ten + " - SĐT: " + sdt);
    }
}
