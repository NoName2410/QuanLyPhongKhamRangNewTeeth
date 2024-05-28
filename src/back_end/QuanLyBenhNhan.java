package back_end;

import entity.BenhNhan;
import entity.MaBenhNhan;
import java.util.ArrayList;
import utils.InvalidSoDienThoaiException;
import utils.InvalidMaBenhNhanException;
public class QuanLyBenhNhan {

    private ArrayList<BenhNhan> ds;
    private int currentId;
    private boolean kt = true;

    public QuanLyBenhNhan() {
        ds = new ArrayList<>();
        currentId = MaBenhNhan.getCurrentID(); // Bắt đầu từ 1 hoặc giá trị mong muốn
    }

    private String generateMaBenhNhan() {
        String maBenhNhan = "BN" + String.format("%03d", currentId);
        if(kt && this.currentId !=0 )
            currentId++;
        return maBenhNhan;
    }

    public void isSoDienThoaiExists(String soDienThoai) throws InvalidSoDienThoaiException{
        for (BenhNhan bn : ds) {
            if (bn.getSoDienThoai().equals(soDienThoai)) {
                throw new InvalidSoDienThoaiException("Số điện thoại đã tồn tại vui lòng nhập lại.");
            }
        }
    }

     private void isMaBenhNhanAlreadyExists(String maBenhNhan) throws InvalidMaBenhNhanException{
        for (BenhNhan x : ds) {
            if (x.getMaBenhNhan().equals(maBenhNhan)) {
                throw new InvalidMaBenhNhanException("Mã bệnh nhân đã tồi tại, Vui lòng nhập lại.");
            }
        }
    }

     public void themBenhNhan(BenhNhan bn) {
        try {          
            // Tạo mã bệnh nhân mới
            String newMaBenhNhan = generateMaBenhNhan();
            // Kiểm tra mã bệnh nhân và số điện thoại
            bn.isSoDienThoaiValid();
            isMaBenhNhanAlreadyExists(newMaBenhNhan);
            isSoDienThoaiExists(bn.getSoDienThoai()); 
            this.currentId = 1;
            bn.setMaBenhNhan(newMaBenhNhan);
            ds.add(bn);
        } catch (InvalidSoDienThoaiException | InvalidMaBenhNhanException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            kt = false;
        }
    }

    public ArrayList<BenhNhan> getDanhSachBenhNhan() {
        return ds;
    }
    
    public void setDanhSachBenhNhan(ArrayList<BenhNhan> ds){
        this.ds = ds;
    }

    public String getNextMaBenhNhan() {
        return "BN" + String.format("%03d", currentId);
    }

    public void setCunt(int currentId) {
        this.currentId = currentId;
    }

    
}
