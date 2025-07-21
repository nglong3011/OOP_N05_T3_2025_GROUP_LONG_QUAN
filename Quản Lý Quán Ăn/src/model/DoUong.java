package model;

public class DoUong {
    private String ten;
    private double gia;

    public DoUong(String ten, double gia) {
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
        System.out.println("Tên đồ uống: " + ten + ", Giá: " + gia + " VND");
    }
}

 
    

