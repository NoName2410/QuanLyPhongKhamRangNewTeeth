package entity;

import java.io.Serializable;
import java.util.Objects;

public class Thuoc implements Serializable {
    private String maThuoc;
    private String tenThuoc;
    private String thanhPhan;
    private String nhomThuoc;
    private String nhaSanXuat;
    private float soLuong;
    private String hanSuDung;
    private String dangBaoChe;
    private String moTa;

    public Thuoc() {
    }

    public Thuoc(String maThuoc, String tenThuoc, String thanhPhan, String nhomThuoc, String nhaSanXuat, float soLuong, String hanSuDung, String dangBaoChe, String moTa) {
        this.maThuoc = maThuoc;
        this.tenThuoc = tenThuoc;
        this.thanhPhan = thanhPhan;
        this.nhomThuoc = nhomThuoc;
        this.nhaSanXuat = nhaSanXuat;
        this.soLuong = soLuong;
        this.hanSuDung = hanSuDung;
        this.dangBaoChe = dangBaoChe;
        this.moTa = moTa;
    }

    public String getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        if (maThuoc == null || maThuoc.isEmpty()) {
            throw new IllegalArgumentException("Mã thuốc không được null hoặc trống");
        }
        this.maThuoc = maThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        if (tenThuoc == null || tenThuoc.isEmpty()) {
            throw new IllegalArgumentException("Tên thuốc không được null hoặc trống");
        }
        this.tenThuoc = tenThuoc;
    }

    public String getThanhPhan() {
        return thanhPhan;
    }

    public void setThanhPhan(String thanhPhan) {
        this.thanhPhan = thanhPhan;
    }

    public String getNhomThuoc() {
        return nhomThuoc;
    }

    public void setNhomThuoc(String nhomThuoc) {
        this.nhomThuoc = nhomThuoc;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        // Kiểm tra dữ liệu hợp lệ có thể được thêm vào đây
        this.soLuong = soLuong;
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public String getDangBaoChe() {
        return dangBaoChe;
    }

    public void setDangBaoChe(String dangBaoChe) {
        this.dangBaoChe = dangBaoChe;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thuoc thuoc = (Thuoc) o;
        return Objects.equals(maThuoc, thuoc.maThuoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maThuoc);
    }

    @Override
    public String toString() {
        return "Thuoc{" + "maThuoc=" + maThuoc + ", tenThuoc=" + tenThuoc + ", thanhPhan=" + thanhPhan + ", nhomThuoc=" + nhomThuoc + ", nhaSanXuat=" + nhaSanXuat + ", soLuong=" + soLuong + ", hanSuDung=" + hanSuDung + ", dangBaoChe=" + dangBaoChe + ", moTa=" + moTa + '}';
    }
}
