package View.Windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import View.View;

public class VocAbfragen {

    JLabel labelHeader;
    JButton zurueckButton;

    private int buttonZurueckCounter;
    
    //TODO: buttons für die nächsten Windows

    public VocAbfragen() {
        buttonZurueckCounter = 0;
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
        zurueckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                buttonZurueckCounter++;
            }
        });
        View.getFrame().add(zurueckButton);
        zurueckButton.setVisible(true);
        
    }

    public void isVisible(boolean isVisible) {
        labelHeader.setVisible(isVisible);
        zurueckButton.setVisible(isVisible);
    }

    public int getButtonZurueckCounter() {
        return buttonZurueckCounter;
    }
}
