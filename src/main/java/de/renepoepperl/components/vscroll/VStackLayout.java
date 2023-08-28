/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.renepoepperl.components.vscroll;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;

/**
 *
 * @author René Pöpperl
 */
public class VStackLayout implements LayoutManager2 {

    private final List<Component> components;

    public VStackLayout() {
        this.components = new ArrayList<>();
    }

    @Override
    public void addLayoutComponent(String name, Component comp) {

    }

    @Override
    public void removeLayoutComponent(Component comp) {
        components.remove(comp);
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        int w = 0;
        int h = 0;

        for (int i = 0; i < parent.getComponentCount(); i++) {
            w = Math.max(w, parent.getComponent(i).getPreferredSize().width);
            h += parent.getComponent(i).getPreferredSize().height;
        }

        return new Dimension(w, h);
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return preferredLayoutSize(parent);
    }

    @Override
    public void layoutContainer(Container parent) {
        int y = 0;
        int x = 0;
        int w = parent.getSize().width;
        int h;

        for (Component c : components) {
            if (c instanceof JComponent) {
                Offset o = getOffset((JComponent) c);
                h = c.getPreferredSize().height;
                y += o.getY();

                c.setBounds(x, y, w, h);
                y += h;
            }
        }
    }

    private Offset getOffset(JComponent c) {
        Offset o = (Offset) c.getClientProperty("offset");

        if (o == null) {
            o = new Offset(0, 0);
            c.putClientProperty("offset", o);
        }

        return o;
    }

    @Override
    public Dimension maximumLayoutSize(Container target) {
        return preferredLayoutSize(target);
    }

    @Override
    public float getLayoutAlignmentX(Container target) {
        return (float) 0.5;
    }

    @Override
    public float getLayoutAlignmentY(Container target) {
        return (float) 0.5;
    }

    @Override
    public void invalidateLayout(Container target) {

    }

    @Override
    public void addLayoutComponent(Component comp, Object constraints) {
        components.add(comp);
    }
    
        private String test;

    public static final String PROP_TEST = "test";

    /**
     * Get the value of test
     *
     * @return the value of test
     */
    public String getTest() {
        return test;
    }

    /**
     * Set the value of test
     *
     * @param test new value of test
     */
    public void setTest(String test) {
        String oldTest = this.test;
        this.test = test;
        propertyChangeSupport.firePropertyChange(PROP_TEST, oldTest, test);
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

}
