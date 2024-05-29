/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.function.Function;

/**
 *
 * @author caoba
 */
public class DBEngine implements Engine {

    @Override
    public <T> void writeToFile(java.util.List<T> list, String fileName) {
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (T item : list) {
                writer.write(item.toString());
                writer.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public <T> java.util.List<T> readDataFromFile(String fileName) {
        java.util.List<T> list = new ArrayList<>();
        File file = new File(fileName);
        if (file.exists() && file.length() > 0) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    list.add((T) line);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return list;
    }
}
