/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package de.renepoepperl.mavenproject1;

import de.renepoepperl.components.vscroll.Offset;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author René Pöpperl
 */
public class NewJFrame3 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame3
     */
    public NewJFrame3() {
        initComponents();
        //java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, "asdfawef", "TEst");
        try {
            URL url = new URL("https://www.google.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.connect();
            conn.disconnect();
        } catch (MalformedURLException ex) {
            Logger.getLogger(NewJFrame3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Offset label1Offset = new Offset(0, -45);

    public static final String PROP_LABEL1OFFSET = "label1Offset";

    /**
     * Get the value of label1Offset
     *
     * @return the value of label1Offset
     */
    public Offset getLabel1Offset() {
        return label1Offset;
    }

    /**
     * Set the value of label1Offset
     *
     * @param label1Offset new value of label1Offset
     */
    public void setLabel1Offset(Offset label1Offset) {
        Offset oldLabel1Offset = this.label1Offset;
        this.label1Offset = label1Offset;
        //propertyChangeSupport.firePropertyChange(PROP_LABEL1OFFSET, oldLabel1Offset, label1Offset);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vStackLayout1 = new de.renepoepperl.components.vscroll.VStackLayout();
        jLabelWO1 = new de.renepoepperl.components.JLabelWO();
        jLabelWO3 = new de.renepoepperl.components.JLabelWO();
        jLabelWO2 = new de.renepoepperl.components.JLabelWO();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        de.renepoepperl.components.vscroll.VStackLayout vStackLayout2 = new de.renepoepperl.components.vscroll.VStackLayout();
        vStackLayout2.setTest("sadf");
        getContentPane().setLayout(vStackLayout2);

        jLabelWO1.setText("jLabelWO1");
        getContentPane().add(jLabelWO1);

        jLabelWO3.setText("jLabelWO3");
        getContentPane().add(jLabelWO3);

        jLabelWO2.setBorder(javax.swing.BorderFactory.createEmptyBorder(-10, 1, 1, 1));
        jLabelWO2.setText("jLabelWO2");
        jLabelWO2.setOffset(new de.renepoepperl.components.vscroll.Offset(0, 20));
        getContentPane().add(jLabelWO2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame3().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.renepoepperl.components.JLabelWO jLabelWO1;
    private de.renepoepperl.components.JLabelWO jLabelWO2;
    private de.renepoepperl.components.JLabelWO jLabelWO3;
    private de.renepoepperl.components.vscroll.VStackLayout vStackLayout1;
    // End of variables declaration//GEN-END:variables
}
