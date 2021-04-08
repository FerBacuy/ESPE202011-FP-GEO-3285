/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class Country {
    private String name;
    private int poblation;
    private String currency;
    private String provinces;
    private boolean continent;

    public Country(String name, int poblation, String currency, String provinces, boolean continent) {
        this.name = name;
        this.poblation = poblation;
        this.currency = currency;
        this.provinces = provinces;
        this.continent = continent;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the poblation
     */
    public int getPoblation() {
        return poblation;
    }

    /**
     * @param poblation the poblation to set
     */
    public void setPoblation(int poblation) {
        this.poblation = poblation;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the provinces
     */
    public String getProvinces() {
        return provinces;
    }

    /**
     * @param provinces the provinces to set
     */
    public void setProvinces(String provinces) {
        this.provinces = provinces;
    }

    /**
     * @return the continent
     */
    public boolean isContinent() {
        return continent;
    }

    /**
     * @param continent the continent to set
     */
    public void setContinent(boolean continent) {
        this.continent = continent;
    }


}