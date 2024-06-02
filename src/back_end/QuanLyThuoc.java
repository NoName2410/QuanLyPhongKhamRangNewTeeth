/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back_end;

/**
 *
 * @author caoba
 */
import entity.Thuoc;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.table.DefaultTableModel;

public class QuanLyThuoc {
    private List<Thuoc> danhSachThuoc;

    public QuanLyThuoc() {
        this.danhSachThuoc = new ArrayList<>();
    }

    public List<Thuoc> getDanhSachThuoc() {
        return danhSachThuoc;
    }

    public void setDanhSachThuoc(List<Thuoc> danhSachThuoc) {
        this.danhSachThuoc = danhSachThuoc;
    }

    
    // Thêm thuốc vào danh sách
    public void themThuoc(Thuoc thuoc) {
        danhSachThuoc.add(thuoc);
        System.out.println("Thêm thuốc thành công: " + thuoc.getMaThuoc());
    }

    // Tìm thuốc theo mã
    public Optional<Thuoc> timThuoc(String maThuoc) {
        return danhSachThuoc.stream()
                .filter(thuoc -> thuoc.getMaThuoc().equals(maThuoc))
                .findFirst();
    }

   
 
}
