ArrayList<KhachHang> danhSachKH = new ArrayList<>();
public void themKhachHang() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập mã KH: ");
    String ma = sc.nextLine();
    System.out.print("Nhập tên KH: ");
    String ten = sc.nextLine();
    System.out.print("Nhập SĐT: ");
    String sdt = sc.nextLine();
    danhSachKH.add(new KhachHang(ma, ten, sdt));
}
public void hienThiDanhSachKH() {
    for (KhachHang kh : danhSachKH) {
        kh.hienThiThongTin();
    }
}
public void capNhatKhachHang(String maKH) {
    for (KhachHang kh : danhSachKH) {
        if (kh.getMaKH().equals(maKH)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Tên mới: ");
            kh.setTenKH(sc.nextLine());
            System.out.print("SĐT mới: ");
            kh.setSoDT(sc.nextLine());
            break;
        }
    }
}
public void xoaKhachHang(String maKH) {
    danhSachKH.removeIf(kh -> kh.getMaKH().equals(maKH));
}
