/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.renepoepperl.components;

import java.awt.Component;
import java.awt.Insets;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.border.AbstractBorder;

/**
 *
 * @author René Pöpperl
 */
public class OffsetBorder extends AbstractBorder {

    private int yOffset = 0;

    public static final String PROP_YOFFSET = "yOffset";

    public OffsetBorder() {
    }

    public OffsetBorder(int yOffset) {
        this.yOffset = yOffset;
    }

    /**
     * Get the value of yOffset
     *
     * @return the value of yOffset
     */
    public int getYOffset() {
        return yOffset;
    }

    /**
     * Set the value of yOffset
     *
     * @param yOffset new value of yOffset
     */
    public void setYOffset(int yOffset) {
        int oldyOffset = this.yOffset;
        this.yOffset = yOffset;
        propertyChangeSupport.firePropertyChange(PROP_YOFFSET, oldyOffset, yOffset);
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

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(yOffset, 0, 0, 0);
    }

    @Override
    public String toString() {
        return new Integer(yOffset).toString();
    }

}
