/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Acer
 */
public class DataValidation {
    private static Pattern patternPass;
    private static Matcher matcher;
    private static final String PASS_REGEX = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,12})";
    
    public static final boolean validatePass(String regex){
        patternPass = Pattern.compile(PASS_REGEX);
        matcher = patternPass.matcher(regex);
        return matcher.matches();
    }
}
