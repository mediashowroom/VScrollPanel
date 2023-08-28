/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.renepoepperl.components.vscroll;

import java.awt.Component;
import java.beans.PropertyEditorSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author René Pöpperl
 */
public class OffsetEditor extends PropertyEditorSupport {

    private OffsetCustomizer customizer;

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Pattern pattern = Pattern.compile("\\[([-0-9]+), ([-0-9]+)\\]");
        Matcher matcher = pattern.matcher(text);
        matcher.find();

        int x = Integer.parseInt(matcher.group(1));
        int y = Integer.parseInt(matcher.group(2));
        setValue(new Offset(x, y));
    }

//    @Override
//    public String getAsText() {
//        Offset o = ((Offset) getValue());
//        if (o == null) {
//            return null;
//        }
//
//        return "[" + o.getX() + "," + o.getY() + "]";
//    }
    @Override
    public String getJavaInitializationString() {
        Offset o = ((Offset) getValue());
        return "new de.renepoepperl.components.vscroll.Offset(" + o.getX() + ", " + o.getY() + ")";
    }

    @Override
    public Component getCustomEditor() {
        if (customizer == null) {
            System.out.println("Initialzing customizer ...");
            customizer = new OffsetCustomizer();
            customizer.setObject(getValue());
            customizer.addPropertyChangeListener((evt) -> {
                System.out.println(evt.getPropertyName());
                if (!evt.getPropertyName().equals("offset")) {
                    return;
                }
                if (evt.getNewValue() instanceof Offset && (!evt.getNewValue().equals(evt.getOldValue()))) {
                    setValue(evt.getNewValue());
                }
            });
        }

        return customizer;
    }

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

}
