package model;

public class MonAn {
    private String ten;
    private double gia;

    public MonAn(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }

    public void hienThi() {
        System.out.println("Tên món: " + ten + ", Giá: " + gia + " VND");
    }
}
