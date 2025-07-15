package model;

public class KhachHang {
    private String maKH;
    private String ten;
    private String soDienThoai;
    public KhachHang(String maKH, String ten, String soDienThoai) {
        this.maKH = maKH;
        this.ten = ten;
        this.soDienThoai = soDienThoai;
    }
    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public void hienThiThongTin() {
        System.out.println("Mã KH: " + maKH);
        System.out.println("Tên KH: " + ten);
        System.out.println("SĐT: " + soDienThoai);
        System.out.println("----------------------");
    }
}
