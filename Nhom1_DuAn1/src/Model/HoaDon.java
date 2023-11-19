/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author admin
 */
public class HoaDon {

    private int ID;
    private String MaHoaDon;
    private int IDKhangHang;
    private int IDNhanVien;
    private int IDVoucher;
    private String TenNguoiNhan;
    private String SdtNguoiNhan;
    private String DiaChiNguoiNhan;
    private BigDecimal PhiShip;
    private BigDecimal TongTien;
    private String TrangThai;
    private Date NgayTao;
    private Date NgaySua;
    private int NguoiTao;
    private int NguoiSua;
    private int xoa;
    private KhachHang idKhachHang;
    private NhanVien idNhanVien;

    public HoaDon() {
    }

    public HoaDon(int ID, String MaHoaDon, int IDKhangHang, int IDNhanVien, int IDVoucher, String TenNguoiNhan, String SdtNguoiNhan, String DiaChiNguoiNhan, BigDecimal PhiShip, BigDecimal TongTien, String TrangThai, Date NgayTao, Date NgaySua, int NguoiTao, int NguoiSua, int xoa, KhachHang idKhachHang, NhanVien idNhanVien) {
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
        this.idKhachHang = idKhachHang;
        this.idNhanVien = idNhanVien;
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

    public BigDecimal getPhiShip() {
        return PhiShip;
    }

    public void setPhiShip(BigDecimal PhiShip) {
        this.PhiShip = PhiShip;
    }

    public BigDecimal getTongTien() {
        return TongTien;
    }

    public void setTongTien(BigDecimal TongTien) {
        this.TongTien = TongTien;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgaySua() {
        return NgaySua;
    }

    public void setNgaySua(Date NgaySua) {
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

    public KhachHang getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(KhachHang idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public NhanVien getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(NhanVien idNhanVien) {
        this.idNhanVien = idNhanVien;
    }



   
}
