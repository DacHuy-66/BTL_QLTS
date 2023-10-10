CREATE DATABASE QUANLYTUYENSINH;
USE QuanLyTuyenSinh;

CREATE TABLE UngVien (
    UngVienID INT PRIMARY KEY,
    HoTen NVARCHAR(255),
    DiaChi NVARCHAR(255),
    SDT NVARCHAR(20),
    Email NVARCHAR(100),
    NgaySinh DATE,
    GioiTinh NVARCHAR(10),
    NganhHoc NVARCHAR(50),
    KetQua NVARCHAR(50),
	Diem float 
);
CREATE TABLE NganhHoc (
    NganhHocID INT PRIMARY KEY,
    TenNganh NVARCHAR(100),
    MoTa NVARCHAR(255),
	SoLuongDangKy NVARCHAR(20),
	DiemYeuCau float
);
CREATE TABLE TaiKhoan (
    TaiKhoanID INT PRIMARY KEY,
    Username NVARCHAR(50),
    Password NVARCHAR(255)
);

INSERT INTO UngVien (UngVienID, HoTen, DiaChi, SDT, Email, NgaySinh, GioiTinh, NganhHoc, KetQua, Diem)
VALUES (1, 'Nguyen Van A', '123 Đường ABC, HP', '0123456789', 'nguyenvana@email.com', '1990-01-15', 'Nam', 'Khoa CNTT', 'Đỗ', 22.5);
INSERT INTO UngVien (UngVienID, HoTen, DiaChi, SDT, Email, NgaySinh, GioiTinh, NganhHoc, KetQua, Diem)
VALUES (2, 'Tran Thi B', '456 Đường XYZ, HN', '0987654321', 'tranthib@email.com', '1995-03-20', 'Nữ', 'Khoa Luật', 'Trượt', 18.0);
INSERT INTO UngVien (UngVienID, HoTen, DiaChi, SDT, Email, NgaySinh, GioiTinh, NganhHoc, KetQua, Diem)
VALUES (3, 'Bui Trang Anh', '42 Hữu Dục, HN', '0321212121', 'buitranganh@email.com', '2002-01-11', 'Nữ', 'Khoa Ngôn Ngữ Anh', 'Đỗ', 23.0);
INSERT INTO UngVien (UngVienID, HoTen, DiaChi, SDT, Email, NgaySinh, GioiTinh, NganhHoc, KetQua, Diem)
VALUES (4, 'Pham Anh Tuấn', '111 Đường VDC, DB', '074564111', 'phamanhtuan@email.com', '2001-03-14', 'Nam', 'Khoa Dược', 'Trượt', 20.0);
INSERT INTO UngVien (UngVienID, HoTen, DiaChi, SDT, Email, NgaySinh, GioiTinh, NganhHoc, KetQua, Diem)
VALUES (5, 'Nguyen Van B', '242 Đường BGR, TH', '0133211145', 'nguyenvanb@email.com', '2003-11-25', 'Nam', 'Khoa MKT', 'Đỗ', 24.5);
INSERT INTO UngVien (UngVienID, HoTen, DiaChi, SDT, Email, NgaySinh, GioiTinh, NganhHoc, KetQua, Diem)
VALUES (6, 'Trần Hồng Ly', '645 Đường DDZ, LC', '0111111111', 'tranhongly@email.com', '1995-03-20', 'Nữ', 'Khoa Quốc Tế', 'Đỗ', 23.0);

INSERT INTO NganhHoc (NganhHocID, TenNganh, MoTa, SoLuongDangKy, DiemYeuCau)
VALUES (1, 'Khoa CNTT', 'Ngành học về công nghệ thông tin', '600', 20.0);
INSERT INTO NganhHoc (NganhHocID, TenNganh, MoTa, SoLuongDangKy, DiemYeuCau)
VALUES (2, 'Khoa Kinh Tế', 'Ngành học về kinh tế và quản trị', '400', 19.0);
INSERT INTO NganhHoc (NganhHocID, TenNganh, MoTa, SoLuongDangKy, DiemYeuCau)
VALUES (3, 'Khoa Luật', 'Ngành học về Luật và Nghiên cứu pháp luật', '300', 19.0);
INSERT INTO NganhHoc (NganhHocID, TenNganh, MoTa, SoLuongDangKy, DiemYeuCau)
VALUES (4, 'Khoa Marketing', 'Ngành học về Quản trị và Tiếp thị', '500', 20.0);
INSERT INTO NganhHoc (NganhHocID, TenNganh, MoTa, SoLuongDangKy, DiemYeuCau)
VALUES (5, 'Khoa Quốc tế', 'Ngành học về Quan hệ quốc tế và Ngoại giao', '400', 18.0);
INSERT INTO NganhHoc (NganhHocID, TenNganh, MoTa, SoLuongDangKy, DiemYeuCau)
VALUES (6, 'Khoa Dược', 'Ngành học về Dược học và Y dược', '300', 21.0);
INSERT INTO NganhHoc (NganhHocID, TenNganh, MoTa, SoLuongDangKy, DiemYeuCau)
VALUES (7, 'Khoa Ngôn ngữ Anh', 'Ngành học về Tiếng Anh và Văn hóa Anh Quốc', '400', 18.5);

INSERT INTO TaiKhoan (Username, Password)
VALUES ('nguyenvana', 'mypassword123');
INSERT INTO TaiKhoan (Username, Password)
VALUES ('admin', 'adminpassword');

INSERT INTO TaiKhoan (TaiKhoanID, Username, Password)
VALUES (1, 'admin1', '123');
INSERT INTO TaiKhoan (TaiKhoanID, Username, Password)
VALUES (2, 'admin2', '111');