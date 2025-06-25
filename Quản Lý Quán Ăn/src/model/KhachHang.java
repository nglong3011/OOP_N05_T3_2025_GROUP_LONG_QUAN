public class KhachHang {
    public String ten;
    public String soDienThoai;

    public KhachHang(String tenKhachHang, String soDienThoaiKhachHang) {
        ten = tenKhachHang;             
        soDienThoai = soDienThoaiKhachHang;
    }

    public String getTen() {
        return ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }
}
