package DLL;

import Entity.UngVien;
import Contructer.UngVienCN;
import java.util.List;

public class UngVienDLL {

    UngVienCN uvcn = new UngVienCN();

    public List<UngVien> getALLUngvien() {
        return uvcn.getALLUngvien();
    }

    public void UpdateUV(String mauv, String tenuv, String diachi, String sdt, String email, String ngaysinh, String gioitinh, String nganhhoc, String ketqua, float diem) {
        uvcn.UpdateNV(mauv, tenuv, diachi, sdt, email, ngaysinh, gioitinh, nganhhoc, ketqua, diem);
    }

    public int deleteUV(String maUV) {
        return uvcn.deleteNV(maUV);
    }

    public void ThemUV(String mauv, String tenuv, String diachi, String sdt, String email, String ngaysinh, String gioitinh, String nganhhoc, String ketqua, float diem) {
        uvcn.ThemUV(mauv, tenuv, diachi, sdt, email, ngaysinh, gioitinh, nganhhoc, ketqua, diem);
    }

    public List<UngVien> GetALLMUV(String MUV) {
        return uvcn.GetALLSDT(MUV);
    }

    public List<UngVien> GetALLTenUngVien(String HoTen) {
        return uvcn.GetALLTenUngVien(HoTen);
    }
}
