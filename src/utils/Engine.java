/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

import java.util.List;

/**
 *
 * @author caoba
 */
public interface Engine {
     <T> void writeToFile(List<T> list, String fileName);

    <T> List<T> readDataFromFile(String fileName);
}
