package View.Windows;
import javax.swing.*;
import View.View;

public class Home {

    JLabel labelHello;
    
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
        
    }

    public void isVisible(boolean isVisible) {
        labelHello.setVisible(isVisible);
    }
}
