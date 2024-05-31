/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

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
    public static final boolean validatePass(String regex) {
        //Biên dịch chuỗi biểu thức chính quy - PASS_REGEX thành một đối tượng mẫu
        patternPass = Pattern.compile(PASS_REGEX);

        //So khớp kết quả patternPass với chuỗi regex được nhập vào có thỏa mãn không?
        matcher = patternPass.matcher(regex);
        return matcher.matches();
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c) && c != '.' && c != '-') {
                return false;
            }
        }
        // Kiểm tra nếu có nhiều hơn một dấu . trong chuỗi
        int dotCount = 0;
        for (char c : str.toCharArray()) {
            if (c == '.') {
                dotCount++;
            }
        }
        if (dotCount > 1) {
            return false;
        }
        // Kiểm tra nếu dấu - không ở đầu chuỗi hoặc nếu có nhiều hơn một dấu -
        if (str.indexOf('-') != 0 || str.lastIndexOf('-') > 0) {
            return false;
        }
        // Kiểm tra nếu chuỗi chỉ chứa dấu -
        if (str.equals("-")) {
            return false;
        }
        // Kiểm tra nếu chuỗi bắt đầu bằng . hoặc kết thúc bằng .
        if (str.startsWith(".") || str.endsWith(".")) {
            return false;
        }
        // Kiểm tra nếu chuỗi bắt đầu bằng - và kết thúc bằng .
        if (str.startsWith("-") && str.endsWith(".")) {
            return false;
        }
        return true;
    }

    public static class DateValidator {
        private static final String DATE_PATTERN
                = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d\\d)$";
        private static final Pattern pattern = Pattern.compile(DATE_PATTERN);
        public static boolean isValidDate(String date) {
            Matcher matcher = pattern.matcher(date);
            if (matcher.matches()) {
                matcher.reset();
                if (matcher.find()) {
                    String day = matcher.group(1);
                    String month = matcher.group(2);
                    String year = matcher.group(3);

                    int dayInt = Integer.parseInt(day);
                    int monthInt = Integer.parseInt(month);
                    int yearInt = Integer.parseInt(year);

                    if (monthInt == 2) {
                        if (isLeapYear(yearInt)) {
                            return dayInt <= 29;
                        } else {
                            return dayInt <= 28;
                        }
                    } else if (monthInt == 4 || monthInt == 6 || monthInt == 9 || monthInt == 11) {
                        return dayInt <= 30;
                    } else {
                        return dayInt <= 31;
                    }
                }
            }
            return false;
        }

        private static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

    }
}
