/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.renepoepperl.components;

import de.renepoepperl.components.vscroll.Offset;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author René Pöpperl
 */
public class JLabelWO extends JLabel {

    public static final String PROP_OFFSET = "offset";

    {
        setOffset(new Offset(0, 0));
    }

    public JLabelWO(String text, Icon icon, int horizontalAlignment) {
        super(text, icon, horizontalAlignment);
    }

    public JLabelWO(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    public JLabelWO(String text) {
        super(text);
    }

    public JLabelWO(Icon image, int horizontalAlignment) {
        super(image, horizontalAlignment);
    }

    public JLabelWO(Icon image) {
        super(image);
    }

    public JLabelWO() {
    }

    /**
     * Get the value of offset
     *
     * @return the value of offset
     */
    public Offset getOffset() {
        return (Offset) getClientProperty("offset");
    }

    /**
     * Set the value of offset
     *
     * @param offset new value of offset
     */
    public void setOffset(Offset offset) {
        putClientProperty("offset", offset);
    }
//
//    @Override
//    public Dimension getMinimumSize() {
//        Dimension d = super.getMinimumSize();
//        d.height += Math.abs(getOffset().getY());
//        return d;
//    }
//
//    @Override
//    public Dimension getPreferredSize() {
//        Dimension d = super.getPreferredSize();
//        d.height += Math.abs(getOffset().getY());
//        return d;
//    }

}
