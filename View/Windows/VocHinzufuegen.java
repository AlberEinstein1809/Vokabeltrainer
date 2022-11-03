package View.Windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;

import View.View;

public class VocHinzufuegen {
    JLabel labelHeader;
    JLabel listeHeader;
    JButton zurueckButton;

    private static int buttonZurueckCounter;

    public VocHinzufuegen() {
        buttonZurueckCounter = 0;
        objekteErstellen();
    }

    private void objekteErstellen() {
        labelHeader = new JLabel("Hinzufügen");
        labelHeader.setBounds(100,14,200,50);
        labelHeader.setHorizontalAlignment(JLabel.CENTER);
        labelHeader.setVerticalAlignment(JLabel.CENTER);
        View.getFrame().add(labelHeader);
        labelHeader.setVisible(false); //später in main

        listeHeader = new JLabel("Stapel: xxx");
        listeHeader.setBounds(100,40,200,50);
        listeHeader.setHorizontalAlignment(JLabel.CENTER);
        listeHeader.setVerticalAlignment(JLabel.CENTER);
        View.getFrame().add(listeHeader);
        listeHeader.setVisible(false); //später in main

        zurueckButton = new JButton("zurück");
        zurueckButton.setBounds(10,10,100,60); 
        zurueckButton.setIcon(new ImageIcon("Objects/back.png")); //sieht scheiße aus am besten weg machen
        zurueckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                buttonZurueckCounter++;
            }
        });
        View.getFrame().add(zurueckButton);
        zurueckButton.setVisible(false);
        
    }

    public void isVisible(boolean isVisible) {
        labelHeader.setVisible(isVisible);
        listeHeader.setVisible(isVisible);
        zurueckButton.setVisible(isVisible);
    }

    public static int getButtonZurueckCounter() {
        return buttonZurueckCounter;
    }

    public JLabel getListeHeader() {
        return listeHeader;
    }
}
