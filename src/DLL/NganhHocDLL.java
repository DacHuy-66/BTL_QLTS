package DLL;

import Entity.NganhHoc;
import Contructer.NganhHocCN;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class NganhHocDLL {

    NganhHocCN nhcn = new NganhHocCN();

    public List<NganhHoc> getALLNganhhoc() {
        return nhcn.getALLNganhhoc();
    }

    public void UpdateNH(String manh, String tennh, String mota, String soluongdangky, float diemyeucau) {
        nhcn.UpdateNH(manh, tennh, mota, soluongdangky, diemyeucau);
    }

    public int deleteNH(String maNH) {
        return nhcn.deleteNH(maNH);
    }

    public void ThemNH(String manh, String tennh, String mota, String soluongdangky, float diemyeucau) {
        nhcn.ThemNH(manh, tennh, mota, soluongdangky, diemyeucau);
    }
        public List<NganhHoc> GetALLMNH(String MNH) {
        return nhcn.GetALLMNH(MNH);
    }

    public List<NganhHoc> GetALLTenNganhHoc(String TenNganh) {
        return nhcn.GetALLTenNganhHoc(TenNganh);
    }
    public void ThongKe(DefaultTableModel model){
        nhcn.ThongKe(model);
    }
}
