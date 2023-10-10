package Entity;

import javax.swing.table.DefaultTableModel;

public class NganhHoc {

    private int maNganhHoc;
    private String tenNganh;
    private String moTa;
    private String soLuong;
    private float diemYeuCau;


    public NganhHoc() {
    }

    public NganhHoc(int maNganhHoc, String tenNganh, String moTa, String soLuong, float diemYeuCau) {
        this.maNganhHoc = maNganhHoc;
        this.tenNganh = tenNganh;
        this.moTa = moTa;
        this.soLuong = soLuong;        
        this.diemYeuCau = diemYeuCau;

    }

    public int getMaNganhHoc() {
        return maNganhHoc;
    }

    public void setMaNganhHoc(int maNganhHoc) {
        this.maNganhHoc = maNganhHoc;
    }

    public String getTenNganh() {
        return tenNganh;
    }

    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public float getDiemYeuCau() {
        return diemYeuCau;
    }

    public void setDiemYeuCau(float diemYeuCau) {
        this.diemYeuCau = diemYeuCau;
    }



}
