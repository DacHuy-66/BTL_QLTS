package Entity;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class UngVien {

    private String maUngVien;
    private String hoTen;
    private String diaChi;
    private String SDT;
    private String email;
    private Date ngaySinh;
    private String gioiTinh;
    private String nganhHoc;
    private String ketQua;
    private float diem;
    
    public UngVien() {
    }

    public UngVien(String maUngVien, String hoTen, String diaChi, String SDT, String email, Date ngaySinh, String gioiTinh, String nganhHoc, String ketQua, float diem) {
        this.maUngVien = maUngVien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.nganhHoc = nganhHoc;
        this.ketQua = ketQua;
        this.diem = diem;
    }

    public String getMaUngVien() {
        return maUngVien;
    }

    public void setMaUngVien(String maUngVien) {
        this.maUngVien = maUngVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsDT() {
        return SDT;
    }

    public void setsDT(String dienThoai) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }
    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    
}    
