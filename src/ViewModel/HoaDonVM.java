/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author admin
 */
public class HoaDonVM {
        private int ID;
    private String MaHoaDon;
    private int IDKhangHang;
    private int IDNhanVien;
    private int IDVoucher;
    private String TenNguoiNhan;
    private String SdtNguoiNhan;
    private String DiaChiNguoiNhan;
    private double PhiShip;
    private double TongTien;
    private int TrangThai;
    private String NgayTao;
    private String NgaySua;
    private int NguoiTao;
    private int NguoiSua;
    private int xoa;

    public HoaDonVM() {
    }

    public HoaDonVM(int ID, String MaHoaDon, int IDKhangHang, int IDNhanVien, int IDVoucher, String TenNguoiNhan, String SdtNguoiNhan, String DiaChiNguoiNhan, double PhiShip, double TongTien, int TrangThai, String NgayTao, String NgaySua, int NguoiTao, int NguoiSua, int xoa) {
        this.ID = ID;
        this.MaHoaDon = MaHoaDon;
        this.IDKhangHang = IDKhangHang;
        this.IDNhanVien = IDNhanVien;
        this.IDVoucher = IDVoucher;
        this.TenNguoiNhan = TenNguoiNhan;
        this.SdtNguoiNhan = SdtNguoiNhan;
        this.DiaChiNguoiNhan = DiaChiNguoiNhan;
        this.PhiShip = PhiShip;
        this.TongTien = TongTien;
        this.TrangThai = TrangThai;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.NguoiTao = NguoiTao;
        this.NguoiSua = NguoiSua;
        this.xoa = xoa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public int getIDKhangHang() {
        return IDKhangHang;
    }

    public void setIDKhangHang(int IDKhangHang) {
        this.IDKhangHang = IDKhangHang;
    }

    public int getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(int IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public int getIDVoucher() {
        return IDVoucher;
    }

    public void setIDVoucher(int IDVoucher) {
        this.IDVoucher = IDVoucher;
    }

    public String getTenNguoiNhan() {
        return TenNguoiNhan;
    }

    public void setTenNguoiNhan(String TenNguoiNhan) {
        this.TenNguoiNhan = TenNguoiNhan;
    }

    public String getSdtNguoiNhan() {
        return SdtNguoiNhan;
    }

    public void setSdtNguoiNhan(String SdtNguoiNhan) {
        this.SdtNguoiNhan = SdtNguoiNhan;
    }

    public String getDiaChiNguoiNhan() {
        return DiaChiNguoiNhan;
    }

    public void setDiaChiNguoiNhan(String DiaChiNguoiNhan) {
        this.DiaChiNguoiNhan = DiaChiNguoiNhan;
    }

    public double getPhiShip() {
        return PhiShip;
    }

    public void setPhiShip(double PhiShip) {
        this.PhiShip = PhiShip;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getNgaySua() {
        return NgaySua;
    }

    public void setNgaySua(String NgaySua) {
        this.NgaySua = NgaySua;
    }

    public int getNguoiTao() {
        return NguoiTao;
    }

    public void setNguoiTao(int NguoiTao) {
        this.NguoiTao = NguoiTao;
    }

    public int getNguoiSua() {
        return NguoiSua;
    }

    public void setNguoiSua(int NguoiSua) {
        this.NguoiSua = NguoiSua;
    }

    public int getXoa() {
        return xoa;
    }

    public void setXoa(int xoa) {
        this.xoa = xoa;
    }
    
}
