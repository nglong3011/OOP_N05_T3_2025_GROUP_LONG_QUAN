package model;

public class KhachHang {
    private String ten;
    private String soDienThoai;

    public KhachHang(String ten, String soDienThoai) {
        this.ten = ten;
        this.soDienThoai = soDienThoai;
    }

    public String getTen() {
        return ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
