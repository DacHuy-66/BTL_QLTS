package Form;

import Entity.NganhHoc;
import Entity.UngVien;
import DLL.NganhHocDLL;
import DLL.UngVienDLL;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Contructer.ConnectDB;
import java.sql.Statement;

public class Main extends javax.swing.JFrame {

    private boolean iClose = false;

    public Main() {
        initComponents();
        LoadDatabaseUngVien();
        LoadDatabaseNganhHoc();
    }

    //close window
    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    //Contructer
    UngVienDLL uvdll = new UngVienDLL();
    NganhHocDLL nhdll = new NganhHocDLL();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUngVien = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaUngVien = new javax.swing.JTextField();
        txtNganhHoc = new javax.swing.JTextField();
        btnThemUV = new javax.swing.JButton();
        btnSuaUV = new javax.swing.JButton();
        btnXoaUV = new javax.swing.JButton();
        txtTimKiemUV = new javax.swing.JTextField();
        btnTimKiemUV = new javax.swing.JButton();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtKetQua = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDiem = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnHuyUV = new javax.swing.JButton();
        btnClearUV = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMaNganhHoc = new javax.swing.JTextField();
        txtTenNganhHoc = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableNganhHoc = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSoLuongDK = new javax.swing.JTextField();
        btnSuaNH = new javax.swing.JButton();
        btnThemNH = new javax.swing.JButton();
        txtTimKiemNH = new javax.swing.JTextField();
        btnTimKiemNH = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        btnXoaNH = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtDiemYeuCau = new javax.swing.JTextField();
        btnHuyNH = new javax.swing.JButton();
        btnClearNH = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableThongKe = new javax.swing.JTable();
        btnInDanhSach = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("QUẢN LÝ TUYỂN SINH EAUT");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel1)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Trang chủ", jPanel1);

        jTableUngVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã ứng viên", "Họ tên", "Địa chỉ", "SĐT", "Email", "Ngày sinh", "Giới tính", "Điểm", "Ngành học", "Kết quả"
            }
        ));
        jTableUngVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUngVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUngVien);

        jLabel2.setText("Họ tên");

        jLabel3.setText("Địa chỉ");

        jLabel4.setText("SDT");

        jLabel5.setText("Email");

        jLabel6.setText("Giới tính");

        jLabel8.setText("Mã ứng viên");

        jLabel9.setText("Ngành học");

        btnThemUV.setText("Thêm");
        btnThemUV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemUVActionPerformed(evt);
            }
        });

        btnSuaUV.setText("Sửa");
        btnSuaUV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaUVActionPerformed(evt);
            }
        });

        btnXoaUV.setText("Xóa");
        btnXoaUV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaUVActionPerformed(evt);
            }
        });

        btnTimKiemUV.setText("Tìm kiếm");
        btnTimKiemUV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemUVActionPerformed(evt);
            }
        });

        jLabel10.setText("Ngày sinh ");

        jLabel11.setText("Kết quả");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel12.setText("Danh sách ứng viên");

        jLabel20.setText("Điểm");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        btnHuyUV.setText("Hủy");
        btnHuyUV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyUVActionPerformed(evt);
            }
        });

        btnClearUV.setText("Clear");
        btnClearUV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearUVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnThemUV)
                        .addGap(136, 136, 136)
                        .addComponent(btnSuaUV)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnXoaUV))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(txtHoTen))
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTimKiemUV, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTimKiemUV))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMaUngVien, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                            .addComponent(txtKetQua)
                                            .addComponent(txtNganhHoc)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnHuyUV)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(btnClearUV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtMaUngVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addComponent(txtNganhHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addComponent(btnClearUV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemUV)
                    .addComponent(btnSuaUV)
                    .addComponent(btnXoaUV)
                    .addComponent(btnHuyUV))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemUV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemUV)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Ứng viên", jPanel2);

        jLabel14.setText("Mã ngành học");

        jLabel15.setText("Tên ngành học");

        jTableNganhHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã ngành học", "Tên ngành học", "Mô tả", "Số lượng đăng ký", "Điểm yêu cầu"
            }
        ));
        jTableNganhHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNganhHocMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableNganhHoc);

        jLabel16.setText("Mô tả");

        jLabel17.setText("Số lượng đăng ký");

        btnSuaNH.setText("Sửa");
        btnSuaNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNHActionPerformed(evt);
            }
        });

        btnThemNH.setText("Thêm");
        btnThemNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNHActionPerformed(evt);
            }
        });

        btnTimKiemNH.setText("Tìm kiếm");
        btnTimKiemNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemNHActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel18.setText("Danh sách ngành học");

        btnXoaNH.setText("Xóa");
        btnXoaNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNHActionPerformed(evt);
            }
        });

        jLabel19.setText("Điểm yêu cầu");

        btnHuyNH.setText("Hủy");
        btnHuyNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyNHActionPerformed(evt);
            }
        });

        btnClearNH.setText("Clear");
        btnClearNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearNHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTimKiemNH, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaNganhHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTenNganhHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnThemNH)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDiemYeuCau, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(btnSuaNH)))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoLuongDK, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnClearNH)
                                    .addComponent(btnXoaNH))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHuyNH)))))
                .addGap(18, 18, 18)
                .addComponent(btnTimKiemNH)
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtMaNganhHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtSoLuongDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenNganhHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiemYeuCau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btnClearNH)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemNH)
                    .addComponent(btnSuaNH)
                    .addComponent(btnXoaNH)
                    .addComponent(btnHuyNH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiemNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemNH)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ngành học", jPanel3);

        jTableThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Ứng viên", "Ngành học", "Điểm yêu cầu", "Điểm", "Kết quả"
            }
        ));
        jTableThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableThongKeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableThongKe);

        btnInDanhSach.setText("In danh sách");
        btnInDanhSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInDanhSachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(btnInDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnInDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thống kê", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//LOAD DATABASE FULL
    //load database UngVien
    private void LoadDatabaseUngVien() {

        btnThemUV.setMnemonic(KeyEvent.VK_Z);
        btnSuaUV.setMnemonic(KeyEvent.VK_A);
        btnXoaUV.setMnemonic(KeyEvent.VK_S);
        List<UngVien> listUV = uvdll.getALLUngvien();
        DefaultTableModel model = (DefaultTableModel) jTableUngVien.getModel();
        model.setRowCount(0);
        for (UngVien o : listUV) {
            model.addRow(new Object[]{o.getMaUngVien(), o.getHoTen(),
                o.getDiaChi(), o.getsDT(), o.getEmail(), o.getNgaySinh(), o.getGioiTinh(), o.getDiem(), o.getNganhHoc(), o.getKetQua()});
        }
    }

    //load database nganhhoc
    private void LoadDatabaseNganhHoc() {
        btnThemNH.setMnemonic(KeyEvent.VK_Z);
        btnSuaNH.setMnemonic(KeyEvent.VK_A);
        btnXoaNH.setMnemonic(KeyEvent.VK_S);

        List<NganhHoc> listNH = nhdll.getALLNganhhoc();
        DefaultTableModel model = (DefaultTableModel) jTableNganhHoc.getModel();
        model.setRowCount(0);
        for (NganhHoc o : listNH) {
            model.addRow(new Object[]{o.getMaNganhHoc(), o.getTenNganh(), o.getMoTa(), o.getSoLuong(), o.getDiemYeuCau()});
        }
    }

    public void resetForm() {
        txtMaUngVien.setText("");
        txtHoTen.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtEmail.setText("");
        txtNgaySinh.setText("");
        txtNganhHoc.setText("");
        txtKetQua.setText("");
        txtDiem.setText("");

    }
    private void btnThemUVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemUVActionPerformed
        if (btnThemUV.getText().equals("Thêm")) {
            resetForm();
            btnSuaUV.setEnabled(false);
            btnHuyUV.setEnabled(true);
            btnXoaUV.setEnabled(false);
            btnThemUV.setText("LƯU");
        } else if (btnThemUV.getText().equals("LƯU")) {
            String mauv = txtMaUngVien.getText();
            String tenuv = txtHoTen.getText();
            String diachi = txtDiaChi.getText();
            String sdt = txtSDT.getText();
            String email = txtEmail.getText();
            String ngaysinh = txtNgaySinh.getText();
            String gioitinh = jComboBox1.getSelectedItem().toString();
            String nganhhoc = txtNganhHoc.getText();
            String ketqua = txtKetQua.getText();
            float diem = Float.parseFloat(txtDiem.getText());

            if (mauv.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã ứng viên'");
            } else if (tenuv.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'tên ứng viên'");
            } else if (diachi.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'địa chỉ'");
            } else if (sdt.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'số điện thoại'");
            } else if (email.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'email'");
            } else if (ngaysinh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'ngày sinh'");
            } else if (gioitinh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn 'giới tính'");
            } else if (nganhhoc.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'ngành học'");
            } else if (ketqua.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'kết quả'");
            } else if (diem <= 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'điểm'");
            } else {
                uvdll.ThemUV(mauv, tenuv, diachi, sdt, email, doiDate(ngaysinh), gioitinh, nganhhoc, ketqua, diem);
                LoadDatabaseUngVien();
                btnXoaUV.setEnabled(true);
                btnHuyUV.setEnabled(false);
                btnSuaUV.setEnabled(true);
                btnThemUV.setText("Thêm");
            }
        }
    }//GEN-LAST:event_btnThemUVActionPerformed

    private void jTableUngVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUngVienMouseClicked
        int row = jTableUngVien.getSelectedRow();
        String s1 = jTableUngVien.getValueAt(row, 0).toString();
        String s2 = jTableUngVien.getValueAt(row, 1).toString();
        String s3 = jTableUngVien.getValueAt(row, 2).toString();
        String s4 = jTableUngVien.getValueAt(row, 3).toString();
        String s5 = jTableUngVien.getValueAt(row, 4).toString();
        String s6 = jTableUngVien.getValueAt(row, 5).toString();
        String s7 = jTableUngVien.getValueAt(row, 6).toString();
        String s8 = jTableUngVien.getValueAt(row, 7).toString();
        String s9 = jTableUngVien.getValueAt(row, 8).toString();
        String s10 = jTableUngVien.getValueAt(row, 9).toString();

        txtMaUngVien.setText(s1);
        txtHoTen.setText(s2);
        txtDiaChi.setText(s3);
        txtSDT.setText(s4);
        txtEmail.setText(s5);
        txtNgaySinh.setText(s6);
        txtDiem.setText(s8);
        txtNganhHoc.setText(s9);
        txtKetQua.setText(s10);

        int i = 0;
        while (true) {
            String nameFromeCbbox = jComboBox1.getItemAt(i);
            if (nameFromeCbbox.equalsIgnoreCase(s7)) {
                jComboBox1.setSelectedIndex(i);
                break;
            }
            i++;
        }
    }//GEN-LAST:event_jTableUngVienMouseClicked

    private void jTableNganhHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNganhHocMouseClicked
        int row = jTableNganhHoc.getSelectedRow();
        String s1 = jTableNganhHoc.getValueAt(row, 0).toString();
        String s2 = jTableNganhHoc.getValueAt(row, 1).toString();
        String s3 = jTableNganhHoc.getValueAt(row, 2).toString();
        String s4 = jTableNganhHoc.getValueAt(row, 3).toString();
        String s5 = jTableNganhHoc.getValueAt(row, 4).toString();

        txtMaNganhHoc.setText(s1);
        txtTenNganhHoc.setText(s2);
        jTextArea1.setText(s3);
        txtDiemYeuCau.setText(s5);
        txtSoLuongDK.setText(s4);
    }//GEN-LAST:event_jTableNganhHocMouseClicked

    private void btnSuaUVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaUVActionPerformed
        if (btnSuaUV.getText().equals("Sửa")) {
            btnXoaUV.setEnabled(false);
            btnHuyUV.setEnabled(true);
            btnThemUV.setEnabled(false);
            btnSuaUV.setText("LƯU");
        } else if (btnSuaUV.getText().equals("LƯU")) {
            String mauv = txtMaUngVien.getText();
            String tenuv = txtHoTen.getText();
            String diachi = txtDiaChi.getText();
            String sdt = txtSDT.getText();
            String email = txtEmail.getText();
            String ngaysinh = txtNgaySinh.getText();
            String gioitinh = jComboBox1.getSelectedItem().toString();
            String nganhhoc = txtNganhHoc.getText();
            String ketqua = txtKetQua.getText();
            float diem = Float.parseFloat(txtDiem.getText());

            if (mauv.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã ứng viên'");
            } else if (tenuv.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'tên ứng viên'");
            } else if (diachi.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'địa chỉ'");
            } else if (sdt.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'số điện thoại'");
            } else if (email.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'email'");
            } else if (ngaysinh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'ngày sinh'");
            } else if (gioitinh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn 'giới tính'");
            } else if (nganhhoc.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'ngành học'");
            } else if (ketqua.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'kết quả'");
            } else if (diem <= 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'điểm'");
            } else {
                uvdll.UpdateUV(mauv, tenuv, diachi, sdt, email, doiDate(ngaysinh), gioitinh, nganhhoc, ketqua, diem);
                LoadDatabaseUngVien();
                btnSuaUV.setText("Sửa");
                btnXoaUV.setEnabled(true);
                btnHuyUV.setEnabled(false);
                btnThemUV.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnSuaUVActionPerformed

    private String doiDate(String nsx) {
        Date s1;
        try {
            SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
            s1 = sdf1.parse(nsx);
            return df.format(s1);
        } catch (Exception e) {
        }
        return "";

    }
    private void btnHuyUVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyUVActionPerformed
        btnSuaUV.setEnabled(true);
        btnXoaUV.setEnabled(true);
        btnThemUV.setEnabled(true);
        btnThemUV.setText("Thêm");
        btnSuaUV.setText("Sửa");
        btnXoaUV.setText("Xóa");
    }//GEN-LAST:event_btnHuyUVActionPerformed

    private void btnXoaUVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaUVActionPerformed
        try {
            if (txtMaUngVien.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Nhập mã ứng viên");
                txtMaUngVien.requestFocus();
            } else if (uvdll.deleteUV(txtMaUngVien.getText()) > 0) {
                uvdll.deleteUV(txtMaUngVien.getText());
                JOptionPane.showMessageDialog(this, "Delete Thành Công");
            } else {
                JOptionPane.showMessageDialog(this, "Delete không Thành Công");
            }

            LoadDatabaseUngVien();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_btnXoaUVActionPerformed

    private void xoatextnganhhoc() {
        txtMaNganhHoc.setText("");
        txtTenNganhHoc.setText("");
        jTextArea1.setText("");
        txtDiemYeuCau.setText("");
        txtSoLuongDK.setText("");
    }

    private void btnThemNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNHActionPerformed
        if (btnThemNH.getText().equals("Thêm")) {
            xoatextnganhhoc();
            btnSuaNH.setEnabled(false);
            btnHuyNH.setEnabled(true);
            btnXoaNH.setEnabled(false);
            btnThemNH.setText("LƯU");
        } else if (btnThemNH.getText().equals("LƯU")) {
            String manh = txtMaNganhHoc.getText();
            String tennh = txtTenNganhHoc.getText();
            String mota = jTextArea1.getText();
            String soluongdangky = txtSoLuongDK.getText();
            float diemyeucau = Float.parseFloat(txtDiemYeuCau.getText());

            if (manh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã ngành học'");
            } else if (tennh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'tên ngành học'");
            } else if (mota.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mô tả ngành học'");
            } else if (soluongdangky.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền số lượng đăng ký");
            } else if (diemyeucau <= 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn điểm yêu cầu");
            } else {
                nhdll.ThemNH(manh, tennh, mota, soluongdangky, diemyeucau);
                LoadDatabaseNganhHoc();
                btnXoaNH.setEnabled(true);
                btnHuyNH.setEnabled(false);
                btnSuaNH.setEnabled(true);
                btnThemNH.setText("Thêm");
            }
        }
    }//GEN-LAST:event_btnThemNHActionPerformed

    private void btnSuaNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNHActionPerformed
        if (btnSuaNH.getText().equals("Sửa")) {
            btnThemNH.setEnabled(false);
            btnHuyNH.setEnabled(true);
            btnXoaNH.setEnabled(false);
            btnSuaNH.setText("LƯU");
        } else if (btnSuaNH.getText().equals("LƯU")) {
            String manh = txtMaNganhHoc.getText();
            String tennh = txtTenNganhHoc.getText();
            String mota = jTextArea1.getText();
            String soluongdangky = txtSoLuongDK.getText();
            float diemyeucau = Float.parseFloat(txtDiemYeuCau.getText());

            if (manh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mã ngành học'");
            } else if (tennh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'tên ngành học'");
            } else if (mota.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền 'mô tả ngành học'");
            } else if (soluongdangky.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền số lượng đăng ký");
            } else if (diemyeucau <= 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn điểm yêu cầu");
            } else {
                nhdll.UpdateNH(manh, tennh, mota, soluongdangky, diemyeucau);
                LoadDatabaseNganhHoc();
                btnXoaNH.setEnabled(true);
                btnHuyNH.setEnabled(false);
                btnThemNH.setEnabled(true);
                btnSuaNH.setText("Sửa");
            }
        }
    }//GEN-LAST:event_btnSuaNHActionPerformed

    private void btnHuyNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyNHActionPerformed
        btnThemNH.setEnabled(true);
        btnSuaNH.setEnabled(true);
        btnXoaNH.setEnabled(true);
        btnThemNH.setText("Thêm");
        btnSuaNH.setText("Sửa");
        btnXoaNH.setText("Xóa");
    }//GEN-LAST:event_btnHuyNHActionPerformed

    private void btnXoaNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNHActionPerformed
        try {
            if (txtMaNganhHoc.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Nhập mã ngành học");
                txtMaNganhHoc.requestFocus();
            } else if (nhdll.deleteNH(txtMaNganhHoc.getText()) > 0) {
                nhdll.deleteNH(txtMaNganhHoc.getText());
                JOptionPane.showMessageDialog(this, "Delete Thành Công");
            } else {
                JOptionPane.showMessageDialog(this, "Delete không Thành Công");
            }

            LoadDatabaseNganhHoc();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_btnXoaNHActionPerformed

    private void btnTimKiemUVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemUVActionPerformed
        if (txtTimKiemUV.getText().equals("")) {
            LoadDatabaseUngVien();
        } else {
            List<UngVien> listUV = uvdll.GetALLTenUngVien(txtTimKiemUV.getText());
            List<UngVien> listMUV = uvdll.GetALLMUV(txtTimKiemUV.getText());
            DefaultTableModel model = (DefaultTableModel) jTableUngVien.getModel();
            model.setRowCount(0);
            for (UngVien o : listUV) {
                model.addRow(new Object[]{o.getMaUngVien(), o.getHoTen(),
                    o.getDiaChi(), o.getsDT(), o.getEmail(), o.getNgaySinh(), o.getGioiTinh(), o.getNganhHoc(), o.getKetQua(), o.getDiem()});
            }
            for (UngVien o : listMUV) {
                model.addRow(new Object[]{o.getMaUngVien(), o.getHoTen(),
                    o.getDiaChi(), o.getsDT(), o.getEmail(), o.getNgaySinh(), o.getGioiTinh(), o.getNganhHoc(), o.getKetQua(), o.getDiem()});
            }
        }
    }//GEN-LAST:event_btnTimKiemUVActionPerformed

    private void btnTimKiemNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemNHActionPerformed
        List<NganhHoc> listSP = nhdll.GetALLTenNganhHoc(txtTimKiemNH.getText());
        List<NganhHoc> listMSP = nhdll.GetALLMNH(txtTimKiemNH.getText());

        DefaultTableModel model = (DefaultTableModel) jTableNganhHoc.getModel();
        model.setRowCount(0);
        for (NganhHoc o : listSP) {
            model.addRow(new Object[]{o.getMaNganhHoc(), o.getTenNganh(),
                o.getMoTa(), o.getDiemYeuCau(), o.getSoLuong()});
        }
        for (NganhHoc o : listMSP) {
            model.addRow(new Object[]{o.getMaNganhHoc(), o.getTenNganh(),
                o.getMoTa(), o.getDiemYeuCau(), o.getSoLuong()});
        }
    }//GEN-LAST:event_btnTimKiemNHActionPerformed



    private void btnInDanhSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInDanhSachActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableThongKe.getModel();
    
    // Gọi phương thức ThongKe() để thực hiện thống kê và cập nhật jTable

    nhdll.ThongKe(model); // Gọi phương thức ThongKe() và truyền model vào đó
    }//GEN-LAST:event_btnInDanhSachActionPerformed

    private void btnClearUVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearUVActionPerformed
        resetForm();
    }//GEN-LAST:event_btnClearUVActionPerformed

    private void btnClearNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearNHActionPerformed
        xoatextnganhhoc();
    }//GEN-LAST:event_btnClearNHActionPerformed

    private void jTableThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableThongKeMouseClicked

    }//GEN-LAST:event_jTableThongKeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearNH;
    private javax.swing.JButton btnClearUV;
    private javax.swing.JButton btnHuyNH;
    private javax.swing.JButton btnHuyUV;
    private javax.swing.JButton btnInDanhSach;
    private javax.swing.JButton btnSuaNH;
    private javax.swing.JButton btnSuaUV;
    private javax.swing.JButton btnThemNH;
    private javax.swing.JButton btnThemUV;
    private javax.swing.JButton btnTimKiemNH;
    private javax.swing.JButton btnTimKiemUV;
    private javax.swing.JButton btnXoaNH;
    private javax.swing.JButton btnXoaUV;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableNganhHoc;
    private javax.swing.JTable jTableThongKe;
    private javax.swing.JTable jTableUngVien;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtDiemYeuCau;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtKetQua;
    private javax.swing.JTextField txtMaNganhHoc;
    private javax.swing.JTextField txtMaUngVien;
    private javax.swing.JTextField txtNganhHoc;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoLuongDK;
    private javax.swing.JTextField txtTenNganhHoc;
    private javax.swing.JTextField txtTimKiemNH;
    private javax.swing.JTextField txtTimKiemUV;
    // End of variables declaration//GEN-END:variables
}
