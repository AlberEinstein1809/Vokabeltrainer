package View.Windows;
import javax.swing.*;
import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {

    private static JLabel labelHello;
    private static JButton buttonVocLernen;
    private static int buttonVocLernenCounter;
    
    //TODO: buttons für die nächsten Windows

    public Home() {
        objekteErstellen();
    }

    private void objekteErstellen() {
        labelHello = new JLabel("Wilkommen zurück");
        labelHello.setBounds(100,70,200,200);
        labelHello.setHorizontalAlignment(JLabel.CENTER);
        labelHello.setVerticalAlignment(JLabel.CENTER);
        View.getFrame().add(labelHello);
        labelHello.setVisible(true); //später in main

        buttonVocLernen = new JButton("Vokabeln lernen");
        buttonVocLernen.setBounds(100,300,200,80);
        buttonVocLernen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                buttonVocLernenCounter++;
            }
        });
        View.getFrame().add(buttonVocLernen);
        buttonVocLernen.setVisible(true);
        
    }

    public void isVisible(boolean isVisible) {
        labelHello.setVisible(isVisible);
        buttonVocLernen.setVisible(isVisible);
    }

    public static int getButtonVocLernenCounter() {
        return buttonVocLernenCounter;
    }
}
