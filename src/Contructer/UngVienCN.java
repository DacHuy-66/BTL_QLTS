package Contructer;

import Entity.UngVien;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Form.Main;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UngVienCN extends ConnectDB {

    private String GET_ALLUNGVIEN = "select * from UngVien";
    private String GET_UPDATEUNGVIEN = " UPDATE UngVien SET HoTen = ?, DiaChi = ?, SDT =  ?, Email = ?,"
            + " NgaySinh = ?, GioiTinh = ?, NganhHoc = ?, KetQua = ?, Diem = ?  WHERE UngVienID= ?";
    private String GET_DELETEUNGVIEN = "DELETE FROM UngVien WHERE UngVienID = ?";
    private String GET_ADDUV = "INSERT INTO UngVien VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private String GET_CHECKUV = "select UngVienID from UngVien where UngVienID = ?";
    private String GET_SEARCHMUV = "SELECT * FROM UngVien where UngVienID like ?";
    private String GET_SEARCHUNGVIEN = "SELECT * FROM UngVien where HoTen like ?";

    public List<UngVien> getALLUngvien() {
        getConnection();
        try {
            java.util.List<UngVien> list = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement(GET_ALLUNGVIEN);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new UngVien(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getFloat(10)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void UpdateNV(String mauv, String tenuv, String diachi, String sdt, String email,
            String ngaysinh, String gioitinh, String nganhhoc, String ketqua, float diem) {
        getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(GET_UPDATEUNGVIEN);
            ps.setString(1, tenuv);
            ps.setString(2, diachi);
            ps.setString(3, sdt);
            ps.setString(4, email);
            ps.setString(5, ngaysinh);
            ps.setString(6, gioitinh);
            ps.setString(7, nganhhoc);
            ps.setString(8, ketqua);
            ps.setFloat(9, diem);
            ps.setString(10, mauv);
            ps.executeUpdate();

            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int deleteNV(String maUV) {
        getConnection();
        int row;
        try {
            PreparedStatement ps = con.prepareStatement(GET_DELETEUNGVIEN);
            ps.setString(1, maUV);
            row = ps.executeUpdate();
            getClose();
            return row;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void ThemUV(String mauv, String tenuv, String diachi, String sdt, String email,
            String ngaysinh, String gioitinh, String nganhhoc, String ketqua, float diem) {
        try {
            getConnection();
            PreparedStatement ps_Check = con.prepareStatement(GET_CHECKUV);
            ps_Check.setString(1, mauv);
            ResultSet rs = ps_Check.executeQuery();
            StringBuilder sb = new StringBuilder();
            if (rs.next()) {
                sb.append("mã ứng viên đã tồn tại");
            }
            if (sb.length() > 0) {

                Main m = new Main();
                JOptionPane.showMessageDialog(m, sb.toString());
            } else {
                PreparedStatement ps = con.prepareStatement(GET_ADDUV);
                ps.setString(1, mauv);
                ps.setString(2, tenuv);
                ps.setString(3, diachi);
                ps.setString(4, sdt);
                ps.setString(5, email);
                ps.setString(6, ngaysinh);
                ps.setString(7, gioitinh);
                ps.setString(8, nganhhoc);
                ps.setString(9, ketqua);
                ps.setFloat(10, diem);
                ps.executeUpdate();
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<UngVien> GetALLSDT(String MUV) {
        getConnection();
        try {
            List<UngVien> list = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement(GET_SEARCHMUV);
            ps.setString(1, "%" + MUV + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new UngVien(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getFloat(10)));
            }
            getClose();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<UngVien> GetALLTenUngVien(String HoTen) {
        getConnection();
        try {
            List<UngVien> list = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement(GET_SEARCHUNGVIEN);
            ps.setString(1,"%" + HoTen + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                 list.add(new UngVien(rs.getString(1), rs.getString(2), rs.getString(3),
                         rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7),
                         rs.getString(8), rs.getString(9), rs.getFloat(10)));
            }
            getClose();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
