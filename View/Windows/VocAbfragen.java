package View.Windows;

import javax.swing.*;
import View.View;

public class VocAbfragen {

    JLabel labelHeader;
    JButton zurueckButton;
    
    //TODO: buttons für die nächsten Windows

    public VocAbfragen() {
        objekteErstellen();
    }

    private void objekteErstellen() {
        labelHeader = new JLabel("Vokabeln Abfragen");
        labelHeader.setBounds(100,10,200,50);
        labelHeader.setHorizontalAlignment(JLabel.CENTER);
        labelHeader.setVerticalAlignment(JLabel.CENTER);
        View.getFrame().add(labelHeader);
        labelHeader.setVisible(true); //später in main

        zurueckButton = new JButton("zurück");
        zurueckButton.setBounds(10,10,100,60);
        View.getFrame().add(zurueckButton);
        zurueckButton.setVisible(true);
        
    }

    public void isVisible(boolean isVisible) {
        //TODO: alle auf parameter setzen
    }
}
