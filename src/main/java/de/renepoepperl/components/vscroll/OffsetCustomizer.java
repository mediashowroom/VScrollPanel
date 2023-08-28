/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package de.renepoepperl.components.vscroll;

import java.awt.HeadlessException;
import java.beans.Customizer;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author René Pöpperl
 */
public class OffsetCustomizer extends javax.swing.JPanel implements Customizer, DocumentListener {

    private Offset offset;

    private transient PropertyChangeSupport pcs;
    /**
     *
     *     * Creates new form OffsetCust mizer
     */
    public OffsetCustomizer() {
        initComponents();
        jTextField1.getDocument().addDocumentListener(this);
        jTextField2.getDocument().addDocumentListener(this);
    }

    /**
     * This method is called from within tructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of thi is al ays
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        jLabel1.setText("X");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField1.setText("0");

        jLabel2.setText("Y");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField2.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setObject(Object bean) {
        this.offset = (Offset) bean;

        jTextField1.setText(offset.getX().toString());
        jTextField2.setText(offset.getY().toString());
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        publishChanges();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        publishChanges();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        publishChanges();
    }

    private void publishChanges() {
        if (!jTextField1.getText().isEmpty() && !jTextField2.getText().isEmpty()) {
            int x = Integer.parseInt(jTextField1.getText());
            int y = Integer.parseInt(jTextField2.getText());

            Offset oldOffset = offset;
            offset = new Offset(x,y);

            System.out.println("Firing property change with: " + oldOffset + ", " + offset);
            getPcs().firePropertyChange("offset", oldOffset, offset);
        } else {
            System.out.println("Not firing...");
        }
    }

    private PropertyChangeSupport getPcs() {
        if (pcs == null) {
            pcs = new PropertyChangeSupport(this);
        }
        
        return pcs;
    }
    
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        getPcs().addPropertyChangeListener("offset", listener);
    }

    /**
     * Remove a listener for the PropertyChange event.
     *
     * @param listener  The PropertyChange listener to be removed.
     */
    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        getPcs().removePropertyChangeListener("offset", listener);
    }
}
