/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package front_end;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author caoba
 */

public interface View {
    <T> void showData(List<T> list, DefaultTableModel model);
}

