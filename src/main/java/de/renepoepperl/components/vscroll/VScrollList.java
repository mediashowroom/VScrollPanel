/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.renepoepperl.components.vscroll;

import java.util.Vector;
import javax.swing.JList;
import javax.swing.ListModel;

/**
 *
 * @author René Pöpperl
 * @param <T>
 */
public class VScrollList<T> extends JList<T> {

    public VScrollList(ListModel<T> dataModel) {
        super(dataModel);
    }

    public VScrollList(T[] listData) {
        super(listData);
    }

    public VScrollList(Vector<? extends T> listData) {
        super(listData);
    }

    public VScrollList() {
    }

    @Override
    public boolean getScrollableTracksViewportWidth() {
        return true;
    }

}
