/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.renepoepperl.components.vscroll;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author René Pöpperl
 */
public class Offset implements Serializable {

    private int x = 0;

    public static final String PROP_X = "x";

    public Offset() {
    }

    public Offset(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Get the value of x
     *
     * @return the value of x
     */
    public Integer getX() {
        return x;
    }

    /**
     * Set the value of x
     *
     * @param x new value of x
     */
    public void setX(int x) {
        int oldX = this.x;
        this.x = x;
        propertyChangeSupport.firePropertyChange(PROP_X, oldX, x);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private int y = 0;

    public static final String PROP_Y = "y";

    /**
     * Get the value of y
     *
     * @return the value of y
     */
    public Integer getY() {
        return y;
    }

    /**
     * Set the value of y
     *
     * @param y new value of y
     */
    public void setY(int y) {
        int oldY = this.y;
        this.y = y;
        propertyChangeSupport.firePropertyChange(PROP_Y, oldY, y);
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }

}
