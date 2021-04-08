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

    public static int returnSize(String fileName) {
        int numberOfLines = 0;

        try {
            Scanner s = new Scanner(new File(fileName));
            while (s.hasNextLine()) {
                numberOfLines++;

            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");

        }
        return numberOfLines;
    }

    public static String[] read(String fileName) {
        String[] results = null;
        int counter = 0;
        int numberOfLines = returnSize(fileName);
        String text = " ";

        try {
            Scanner s = new Scanner(new File(fileName));
            results = new String[numberOfLines];
            while (s.hasNextLine()) {
                results[counter] = s.nextLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");

        }
        return results;
    }

//    
//    public static String read(String fileName) {
//        String text = " ";
//
//        try {
//                Scanner s = new Scanner(new File(fileName));
//            while (s.hasNextLine()) {
//                text = text + s.nextLine() + "\n";
//            }
//            
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//
//        }
//        return text;
//    }
//    
}
