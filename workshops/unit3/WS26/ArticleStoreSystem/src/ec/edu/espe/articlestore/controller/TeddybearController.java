/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.articlestore.controller;

import ec.edu.espe.articlestore.model.Teddybear;
import utils.FileManager;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class TeddybearController {

    public void save(Teddybear teddybear) {
        String data = teddybear.getName() + ";" + teddybear.getColor() + ";" + teddybear.getSize() + ";" + teddybear.getWeigth() + ";" + teddybear.isPlush();
        FileManager.save(data, "Teddybear");

    }

    public String[] read() {
        String[] data = new String[FileManager.returnSize("teddybear.csv")];
        data = FileManager.read("teddybear.csv");
        return data;
    }
}
