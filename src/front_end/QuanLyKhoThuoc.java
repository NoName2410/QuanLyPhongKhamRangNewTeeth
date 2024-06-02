/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package front_end;

import back_end.QuanLyThuoc;
import entity.Thuoc;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.DataValidation.DateValidator;
import utils.DBEngine;

/**
 *
 * @author caoba
 */
public class QuanLyKhoThuoc extends javax.swing.JFrame implements View {

    /**
     * Creates new form QuanLyKhoThuoc
     */
    private static final String FILE_NAME = "Thuoc.txt";
    private final DefaultTableModel modelQLThuoc;
    private List<Thuoc> listThuoc;
    private int indexThuoc;
    private utils.DBEngine controller;
    private List<Thuoc> listThuocTimKiem;

    public QuanLyKhoThuoc() {

        initComponents();
        this.setLocationRelativeTo(null);

        listThuoc = new ArrayList<>();
        modelQLThuoc = (DefaultTableModel) jtbThuoc.getModel();
        controller = new DBEngine();
        showDataThuoc();
    }

    @SuppressWarnings("unchecked")

    public void addThuoc(Thuoc t) {
        listThuoc.add(t);
        controller.writeToFile(listThuoc, "Thuoc.txt");
        this.showData(listThuoc, modelQLThuoc);
        showDataThuoc();
    }

    void updateThuoc(Thuoc t) {
        Thuoc thuocDaChon = listThuoc.get(indexThuoc);
        thuocDaChon.setMaThuoc(t.getMaThuoc());
        thuocDaChon.setTenThuoc(t.getTenThuoc());
        thuocDaChon.setThanhPhan(t.getThanhPhan());
        thuocDaChon.setNhomThuoc(t.getNhomThuoc());
        thuocDaChon.setNhaSanXuat(t.getNhaSanXuat());
        thuocDaChon.setSoLuong(t.getSoLuong());
        thuocDaChon.setHanSuDung(t.getHanSuDung());
        thuocDaChon.setDangBaoChe(t.getDangBaoChe());
        thuocDaChon.setMoTa(t.getMoTa());

        listThuoc.set(indexThuoc, thuocDaChon);
        controller.writeToFile(listThuoc, "Thuoc.txt");
        showDataThuoc();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtbThuoc = new javax.swing.JTable();
        jbtThem = new javax.swing.JButton();
        jbtSua = new javax.swing.JButton();
        jbtXoa = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jtfTimKiem = new javax.swing.JTextPane();
        jbtTimKiem = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jcbLoc = new javax.swing.JComboBox<>();
        jbtRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 204));

        jtbThuoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtbThuoc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtbThuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã thuốc", "Tên thuốc", "Thành phần", "Nhóm thuốc", "Số lượng", "Dạng bào chế", "Nhà sản xuất", "Hạn sử dụng", "Mô tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbThuoc.setToolTipText("");
        jtbThuoc.setSelectionBackground(new java.awt.Color(0, 0, 255));
        jtbThuoc.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtbThuocAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane6.setViewportView(jtbThuoc);

        jbtThem.setText("Thêm");
        jbtThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemActionPerformed(evt);
            }
        });

        jbtSua.setText("Sửa");
        jbtSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSuaActionPerformed(evt);
            }
        });

        jbtXoa.setText("Xóa");
        jbtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaActionPerformed(evt);
            }
        });

        jtfTimKiem.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jScrollPane11.setViewportView(jtfTimKiem);

        jbtTimKiem.setText("Tìm kiếm");
        jbtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTimKiemActionPerformed(evt);
            }
        });

        jButton1.setText("Lọc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jcbLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thuốc tim mạch", "Thuốc tiêu hóa", "Thuốc thần kinh", "Thuốc kháng sinh", "Thuốc chống nấm", "Thuốc chống virus", "Thuốc chống ung thư", "Thuốc giảm đau", "Thuốc chống viêm", "Thuốc hạ sốt" }));

        jbtRefresh.setText("Refresh");
        jbtRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jbtSua, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jbtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane11)
                            .addComponent(jcbLoc, 0, 177, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtSua, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbLoc)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jbtRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ ĐƠN THUỐC VÀ VẬT TƯ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1742, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 400, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaActionPerformed
        try {
            int removeThuoc = jtbThuoc.getSelectedRow();

            if (removeThuoc == -1) {
                JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá!");
            } else if (listThuoc.size() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xoá!");
            } else {
                // Hiển thị hộp thoại xác nhận
                int confirmed = JOptionPane.showConfirmDialog(
                        rootPane,
                        "Bạn có chắc chắn muốn xoá thuốc này không?",
                        "Xác nhận xoá",
                        JOptionPane.YES_NO_OPTION
                );

                if (confirmed == JOptionPane.YES_OPTION) {
                    try {
                        listThuoc.remove(removeThuoc);
                        controller.writeToFile(listThuoc, "Thuoc.txt");
                        showDataThuoc();
                    } catch (IndexOutOfBoundsException e) {
                        JOptionPane.showMessageDialog(rootPane, "Lỗi khi xoá thuốc: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            // Log the exception (if logging is set up in your application)
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbtXoaActionPerformed

    private void jbtSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSuaActionPerformed
        indexThuoc = jtbThuoc.getSelectedRow();
        if (listThuoc.size() == 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "Hãy nhập thêm thành viên");
        } else if (indexThuoc == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Hãy chọn thành viên rồi chỉnh sửa !");
        } else {
            EditThuocView editThuoc = new EditThuocView(this, rootPaneCheckingEnabled);
            editThuoc.setEditData(listThuoc.get(indexThuoc));
            editThuoc.setVisible(true);
        }
        showDataThuoc();
    }//GEN-LAST:event_jbtSuaActionPerformed

    private void jbtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTimKiemActionPerformed
        String tim = jtfTimKiem.getText().toUpperCase();
        int ktra = 0;
        listThuocTimKiem = controller.readDataFromFile("Thuoc.txt");
        for (Thuoc x : listThuocTimKiem) {
            if (x.getTenThuoc().toUpperCase().contains(tim) || x.getTenThuoc().toUpperCase().equals(tim) || x.getMaThuoc().toUpperCase().equals(tim)) {
                ktra = 1;
                break;
            }
        }
        if (tim.trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập tên hoặc mã thuốc cần tìm!");
        } else if (ktra == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không tồn tại tên hoặc mã thuốc này trong danh sách!");
        } else {
            SearchThuocView viewThuoc = new SearchThuocView(this, rootPaneCheckingEnabled);
            List<Thuoc> listThuocTimKiem = new ArrayList<>();
            for (Thuoc x : listThuoc) {
                if (x.getTenThuoc().toUpperCase().contains(tim) || x.getMaThuoc().toUpperCase().equals(tim)) {
                    listThuocTimKiem.add(x);
                }
            }
            viewThuoc.updateTable(listThuocTimKiem);
            viewThuoc.setVisible(true);
        }
        this.showData(listThuoc, modelQLThuoc);
    }//GEN-LAST:event_jbtTimKiemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        
// Thuốc tim mạch
//Thuốc tiêu hóa
//Thuốc thần kinh
//Thuốc kháng sinh
//Thuốc chống nấm
//Thuốc chống virus
//Thuốc chống ung thư
//Thuốc giảm đau
//Thuốc chống viêm
//Thuốc hạ sốt
        List<Thuoc> filteredList = new ArrayList<>();
        for (Thuoc x : listThuoc) {
            if (jcbLoc.getSelectedItem().equals("Thuốc tiêu hóa") && x.getNhomThuoc().equals("Thuốc tiêu hóa")) {
                filteredList.add(x);
            } else if (jcbLoc.getSelectedItem().equals("Thuốc thần kinh") && x.getNhomThuoc().equals("Thuốc thần kinh")) {
                filteredList.add(x);
            } else if (jcbLoc.getSelectedItem().equals("Thuốc kháng sinh") && x.getNhomThuoc().equals("Thuốc kháng sinh")) {
                filteredList.add(x);
            } else if (jcbLoc.getSelectedItem().equals("Thuốc chống nấm") && x.getNhomThuoc().equals("Thuốc chống nấm")) {
                filteredList.add(x);
            } else if (jcbLoc.getSelectedItem().equals("Thuốc chống virus") && x.getNhomThuoc().equals("Thuốc chống virus")) {
                filteredList.add(x);
            } else if (jcbLoc.getSelectedItem().equals("Thuốc chống ung thư") && x.getNhomThuoc().equals("Thuốc chống ung thư")) {
                filteredList.add(x);
            } else if (jcbLoc.getSelectedItem().equals("Thuốc giảm đau") && x.getNhomThuoc().equals("Thuốc giảm đau")) {
                filteredList.add(x);
            } else if (jcbLoc.getSelectedItem().equals("Thuốc chống viêm") && x.getNhomThuoc().equals("Thuốc chống viêm")) {
                filteredList.add(x);
            } else if (jcbLoc.getSelectedItem().equals("Thuốc hạ sốt") && x.getNhomThuoc().equals("Thuốc hạ sốt")) {
                filteredList.add(x);
            } else if (jcbLoc.getSelectedItem().equals("Thuốc tim mạch") && x.getNhomThuoc().equals("Thuốc tim mạch")) {
                filteredList.add(x);
            }
            showData(filteredList, modelQLThuoc);
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jtbThuocAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtbThuocAncestorAdded

    }//GEN-LAST:event_jtbThuocAncestorAdded

    private void jbtThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemActionPerformed

        new AddThuocView(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jbtThemActionPerformed

    private void jbtRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRefreshActionPerformed
        showData(listThuoc, modelQLThuoc);

    }//GEN-LAST:event_jbtRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyKhoThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyKhoThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyKhoThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyKhoThuoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyKhoThuoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jbtRefresh;
    private javax.swing.JButton jbtSua;
    private javax.swing.JButton jbtThem;
    private javax.swing.JButton jbtTimKiem;
    private javax.swing.JButton jbtXoa;
    private javax.swing.JComboBox<String> jcbLoc;
    private javax.swing.JTable jtbThuoc;
    private javax.swing.JTextPane jtfTimKiem;
    // End of variables declaration//GEN-END:variables

    @Override
    public <T> void showData(List<T> list, DefaultTableModel model) {
        model.setRowCount(0);
        for (T t : list) {
            if (t instanceof Thuoc) {
                Thuoc tv = (Thuoc) t;
                model.addRow(new Object[]{
                    tv.getMaThuoc(), tv.getTenThuoc(), tv.getThanhPhan(), tv.getNhomThuoc(), tv.getSoLuong(), tv.getDangBaoChe(), tv.getNhaSanXuat(), tv.getHanSuDung(),
                    tv.getMoTa()
                });
            }

        }
    }

    private void showDataThuoc() {
        listThuoc = controller.readDataFromFile("Thuoc.txt");
        this.showData(listThuoc, modelQLThuoc);

    }

    private List<Thuoc> LayFile(String fileName) {
        FileInputStream fi;
        ObjectInputStream in;
        List<Thuoc> list = new ArrayList<>();
        try {
            fi = new FileInputStream(fileName);
            in = new ObjectInputStream(fi);
            list = (ArrayList<Thuoc>) in.readObject();
            fi.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
