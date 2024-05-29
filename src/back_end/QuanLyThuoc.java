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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class QuanLyThuoc {
    private List<Thuoc> danhSachThuoc;

    public QuanLyThuoc() {
        this.danhSachThuoc = new ArrayList<>();
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

    // Cập nhật thông tin thuốc
    public boolean capNhatThuoc(Thuoc thuocCapNhat) {
        Optional<Thuoc> thuocOptional = timThuoc(thuocCapNhat.getMaThuoc());
        if (thuocOptional.isPresent()) {
            Thuoc thuoc = thuocOptional.get();
            thuoc.setTenThuoc(thuocCapNhat.getTenThuoc());
            thuoc.setThanhPhan(thuocCapNhat.getThanhPhan());
            thuoc.setHanSuDung(thuocCapNhat.getHanSuDung());
            thuoc.setNhomThuoc(thuocCapNhat.getNhomThuoc());
            thuoc.setNhaSanXuat(thuocCapNhat.getNhaSanXuat());
            thuoc.setSoLuong(thuocCapNhat.getSoLuong());
            thuoc.setDangBaoChe(thuocCapNhat.getDangBaoChe());
            thuoc.setMoTa(thuocCapNhat.getMoTa());
            System.out.println("Cập nhật thuốc thành công: " + thuoc.getMaThuoc());
            return true;
        }
        System.out.println("Không tìm thấy thuốc với mã: " + thuocCapNhat.getMaThuoc());
        return false;
    }

    // Xóa thuốc theo mã
    public boolean xoaThuoc(String maThuoc) {
        Optional<Thuoc> thuocOptional = timThuoc(maThuoc);
        if (thuocOptional.isPresent()) {
            danhSachThuoc.remove(thuocOptional.get());
            System.out.println("Xóa thuốc thành công: " + maThuoc);
            return true;
        }
        System.out.println("Không tìm thấy thuốc với mã: " + maThuoc);
        return false;
    }

    // Hiển thị danh sách thuốc
    public void hienThiDanhSachThuoc() {
        if (danhSachThuoc.isEmpty()) {
            System.out.println("Danh sách thuốc trống.");
        } else {
            danhSachThuoc.forEach(thuoc -> {
                System.out.println(thuoc);
            });
        }
    }
    private static final String FILE_NAME = "Thuoc.txt";

    // Phương thức ghi thông tin thuốc vào file
    public void ghiThuocVaoFile(Thuoc thuoc) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(thuoc.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
