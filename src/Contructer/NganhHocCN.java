package Contructer;

import Entity.NganhHoc;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Form.Main;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NganhHocCN extends ConnectDB {

    private String GET_ALLNGANHHOC = "select * from NganhHoc";
    private String GET_UPDATENH = "UPDATE NganhHoc SET TenNganh = ?, MoTa = ?, SoLuongDangKy = ?, DiemYeuCau = ? WHERE NganhHocID = ?";
    private String GET_DELETENGANHHOC = "DELETE FROM NganhHoc WHERE NganhHocID = ?";
    private String GET_ADDNH = "INSERT INTO NganhHoc VALUES (?, ?, ?, ?, ?)";
    private String GET_CHECKNH = "select NganhHocID from NganhHoc where NganhHocID = ?";
    private String GET_SEARCHMNH = "SELECT * FROM NganhHoc where NganhHocID like ?";
    private String GET_SEARCHTNH = "SELECT * FROM NganhHoc where TenNganh like ?";
    private String GET_THONGKE = "SELECT Nh.NganhHocID, Nh.TenNganh, COUNT(UV.UngVienID) AS SoLuongDangKy, "
            + "SUM(CASE WHEN UV.KetQua = 'Đỗ' THEN 1 ELSE 0 END) AS SoUngVienDo, "
            + "SUM(CASE WHEN UV.KetQua = 'Trượt' THEN 1 ELSE 0 END) AS SoUngVienTruot "
            + "FROM NganhHoc Nh LEFT JOIN UngVien UV ON Nh.TenNganh = UV.NganhHoc "
            + "GROUP BY Nh.NganhHocID, Nh.TenNganh;";

    public List<NganhHoc> getALLNganhhoc() {
        getConnection();
        try {
            java.util.List<NganhHoc> list = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement(GET_ALLNGANHHOC);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new NganhHoc(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getFloat(5)));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void ThongKe(DefaultTableModel model) {
        getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(GET_THONGKE);
            ResultSet rs = ps.executeQuery();
            model.setRowCount(0);

            while (rs.next()) {
                int nganhHocID = rs.getInt("NganhHocID");
                String tenNganh = rs.getString("TenNganh");
                int soLuongDangKy = rs.getInt("SoLuongDangKy");
                int soUngVienDo = rs.getInt("SoUngVienDo");
                int soUngVienTruot = rs.getInt("SoUngVienTruot");

                model.addRow(new Object[]{nganhHocID, tenNganh, soLuongDangKy, soUngVienDo, soUngVienTruot});
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void UpdateNH(String manh, String tennh, String mota, String soluongdangky, float diemyeucau) {
        getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(GET_UPDATENH);
            ps.setString(1, manh);
            ps.setString(2, tennh);
            ps.setString(3, mota);
            ps.setString(5, soluongdangky);
            ps.setFloat(4, diemyeucau);
            ps.executeUpdate();
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int deleteNH(String maNH) {
        getConnection();
        int row;
        try {
            PreparedStatement ps = con.prepareStatement(GET_DELETENGANHHOC);
            ps.setString(1, maNH);
            row = ps.executeUpdate();
            getClose();
            return row;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void ThemNH(String manh, String tennh, String mota, String soluongdangky, float diemyeucau) {
        try {
            getConnection();
            PreparedStatement ps_Check = con.prepareStatement(GET_CHECKNH);
            ps_Check.setString(1, manh);
            ResultSet rs = ps_Check.executeQuery();
            StringBuilder sb = new StringBuilder();
            if (rs.next()) {
                sb.append("mã ngành học đã tồn tại");
            }
            if (sb.length() > 0) {

                Main m = new Main();
                JOptionPane.showMessageDialog(m, sb.toString());
            } else {
                PreparedStatement ps = con.prepareStatement(GET_ADDNH);
                ps.setString(1, manh);
                ps.setString(2, tennh);
                ps.setString(3, mota);
                ps.setString(4, soluongdangky);
                ps.setFloat(5, diemyeucau);
                ps.executeUpdate();
            }
            getClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<NganhHoc> GetALLMNH(String MNH) {
        getConnection();
        try {
            List<NganhHoc> list = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement(GET_SEARCHMNH);
            ps.setString(1, "%" + MNH + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new NganhHoc(rs.getInt(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4), rs.getFloat(5)));
            }
            getClose();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<NganhHoc> GetALLTenNganhHoc(String TenNganh) {
        getConnection();
        try {
            List<NganhHoc> list = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement(GET_SEARCHTNH);
            ps.setString(1, "%" + TenNganh + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new NganhHoc(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getFloat(5)));
            }
            getClose();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
