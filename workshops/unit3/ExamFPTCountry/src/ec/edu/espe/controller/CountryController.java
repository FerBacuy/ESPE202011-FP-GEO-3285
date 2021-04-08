/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.Country;
import utils.FileManager;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class CountryController {

    public void save(Country country) {
        String data = country.Name() + ";" + country.getPoblation + ";" + country.getCurrency() + ";" + country.getProvinces() + ";" + country.isContinent();
        FileManager.save(data, "Teddybear");

    }

    public String[] read() {
        String[] data = new String[FileManager.returnSize("country.csv")];
        data = FileManager.read("country.csv");
        
        return data;
    }
}

    

