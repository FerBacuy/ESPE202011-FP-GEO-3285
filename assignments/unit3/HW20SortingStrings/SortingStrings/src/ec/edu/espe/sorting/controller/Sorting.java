/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sorting.controller;


/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class Sorting {


    public static int SearchString(String[] models, String searchElement) {
        for (int x = 0; x < models.length; x++) {
            if (models[x].equals(searchElement)) {
                return x;
            }
        }
        return -1;
    }

}
