/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;


/**
 *
 * @author PC
 */
public class BenhNhan {
    private String maBenhNhan;
    private String tenBenhNhan;
    private String soDienThoai;
    private String namSinh;
    private String trieuChung;
    private String dieuTri;

    public BenhNhan() {
    }
    
    public BenhNhan(String maBenhNhan, String tenBenhNhan, String soDienThoai, String namSinh, String trieuChung, String dieuTri) {
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.soDienThoai = soDienThoai;
        this.namSinh = namSinh;
        this.trieuChung = trieuChung;
        this.dieuTri = dieuTri;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getTrieuChung() {
        return trieuChung;
    }

    public void setTrieuChung(String trieuChung) {
        this.trieuChung = trieuChung;
    }

    public String getDieuTri() {
        return dieuTri;
    }

    public void setDieuTri(String dieuTri) {
        this.dieuTri = dieuTri;
    }
    
    // Kiểm tra điều kiện của mã bệnh nhân và số điện thoại
    public boolean isValid() {
        return isSoDienThoaiValid();
    }

    

    private boolean isSoDienThoaiValid() {
        if (soDienThoai == null || soDienThoai.trim().isEmpty()) {
            return false;
        }
        if (soDienThoai.length() != 10) {
            return false;
        }
        for (char c : soDienThoai.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]) {
        
        
    }
    
}
