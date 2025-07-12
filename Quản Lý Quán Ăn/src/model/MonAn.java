public class MonAn {
    String ten;
    double gia;

    public MonAn(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public void hienThi() {
        System.out.println("Tên món: " + ten + ", Giá: " + gia + " VND");
    }
}

