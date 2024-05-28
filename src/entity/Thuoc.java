/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author caoba
 */
public class Thuoc {
    private String maThuoc;
    private String tenThuoc;
    private String thanhPhan;
    private String nhomThuoc;
    private String nhaSanXuat;
    private float soLuong;
    private String dangBaoChe;
    private String moTa;

    public Thuoc(String maThuoc, String tenThuoc, String thanhPhan, String nhomThuoc, String nhaSanXuat, float soLuong, String dangBaoChe, String moTa) {
        this.maThuoc = maThuoc;
        this.tenThuoc = tenThuoc;
        this.thanhPhan = thanhPhan;
        this.nhomThuoc = nhomThuoc;
        this.nhaSanXuat = nhaSanXuat;
        this.soLuong = soLuong;
        this.dangBaoChe = dangBaoChe;
        this.moTa = moTa;
    }

    public Thuoc() {
    }
    

   public String getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(String maThuoc) throws IllegalArgumentException {
        if (maThuoc == null || maThuoc.isEmpty()) {
            throw new IllegalArgumentException("Mã thuốc không được null hoặc trống");
        }
        this.maThuoc = maThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) throws IllegalArgumentException {
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

    public void setSoLuong(float soLuong) throws IllegalArgumentException {
        if (soLuong < 0) {
            throw new IllegalArgumentException("Số lượng thuốc không được âm");
        }
        this.soLuong = soLuong;
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
    
}
