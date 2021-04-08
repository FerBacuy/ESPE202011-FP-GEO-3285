/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.articlestore.model;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class Teddybear {
    private String name;
    private String color;
    private int size;
    private float weigth;
    private boolean plush;

    public Teddybear(String name, String color, int size, float weigth, boolean plush) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.weigth = weigth;
        this.plush = plush;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the weigth
     */
    public float getWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    /**
     * @return the plush
     */
    public boolean isPlush() {
        return plush;
    }

    /**
     * @param plush the plush to set
     */
    public void setPlush(boolean plush) {
        this.plush = plush;
    }
    
    
    
    
}
