/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidation {
    //Tạo biến patternPass kiểu Pattern để biên dịch chuỗi biểu thức chính quy thanh một đối tượng mẫu
    private static Pattern patternPass; 
    
    //Tạo biến matcher kiểu Matcher để so khớp
    private static Matcher matcher;
    
    private static final String PASS_REGEX = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,12})";
    //(?=.*\\d): Phải chứa ít nhất một ký tự số
    //(?=.*[a-z]): Phải chứa ít nhất một ký tự chữ thường (a-z)
    //(?=.*[A-Z]): Phải chứa ít nhất một ký tự chữ hoa (A-Z)
    //(?=.*[@#$%!]): Phải chứa ít nhất một ký tự đặc biệt trong tập @#$%!
    //.: Bất kỳ ký tự nào
    //{6,12}: Độ dài chuỗi phải từ 6 đến 12 ký tự
    
    //Tạo phương thức validatePass đầu vào là một chuỗi trả về true hoặc false
    public static final boolean validatePass(String regex){
        //Biên dịch chuỗi biểu thức chính quy - PASS_REGEX thành một đối tượng mẫu
        patternPass = Pattern.compile(PASS_REGEX);
        
        //So khớp kết quả patternPass với chuỗi regex được nhập vào có thỏa mãn không?
        matcher = patternPass.matcher(regex);
        return matcher.matches();
    }
}
