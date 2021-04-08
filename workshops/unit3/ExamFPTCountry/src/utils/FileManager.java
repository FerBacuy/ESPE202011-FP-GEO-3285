/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.SpringLayout;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class FileManager {

    public static boolean createFile(String fileName) {
        boolean created = false;
        try {
            File file = new File(fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println("File was created");
                created = true;
            } else {
                System.out.println("file already exist");
                created = false;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;
    }

    public static boolean save(String data, String fileName) {
        boolean saved = false;
        createFile(fileName);
        try {
            FileWriter myWrite = new FileWriter(fileName + ".csv", true);
            myWrite.write(data + System.getProperty("line.separator") + data);
            myWrite.close();
            System.out.println("a new record of" + fileName + "was saved");
        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }
        return saved;
    }

    public static String read(String fileName) {
        fileName = null;
        String information = null;
        String document = "C:\\Users\\Domenica\\OneDrive\\Desktop\\Programacion\\codigos github\\ESPE202011-FP-GEO-3285\\assignments\\unit 3\\HW21-ADT\\ConcessionarieSystem\\cars.txt";
        try (BufferedReader textBr = new BufferedReader(new FileReader(document))) {
            while ((fileName = textBr.readLine()) != null) {
                information = fileName;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return information;
    }

    public static int returnSize(String countrycsv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
