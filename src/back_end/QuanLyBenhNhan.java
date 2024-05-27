package back_end;

import entity.BenhNhan;
import front_end.MaBenhNhan;
import java.util.ArrayList;

public class QuanLyBenhNhan {

    public static ArrayList<BenhNhan> ds;
    private int currentId;

    public QuanLyBenhNhan() {
        ds = new ArrayList<>();
        currentId = MaBenhNhan.getCurrentID(); // Bắt đầu từ 1 hoặc giá trị mong muốn
    }

    private String generateMaBenhNhan() {
        String maBenhNhan = "BN" + String.format("%03d", currentId);
        currentId++;
        return maBenhNhan;
    }

    public boolean isSoDienThoaiExists(String soDienThoai) {
        for (BenhNhan bn : ds) {
            if (bn.getSoDienThoai().equals(soDienThoai)) {
                return true;
            }
        }
        return false;
    }

    public boolean themBenhNhan(BenhNhan bn) {
        if (bn.isValid() && !isSoDienThoaiExists(bn.getSoDienThoai())) {
            bn.setMaBenhNhan(generateMaBenhNhan());
            ds.add(bn);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<BenhNhan> getDanhSachBenhNhan() {
        return ds;
    }

    public String getNextMaBenhNhan() {
        return "BN" + String.format("%03d", currentId);
    }

    public void setCunt(int currentId) {
        this.currentId = currentId;
    }

    
}
