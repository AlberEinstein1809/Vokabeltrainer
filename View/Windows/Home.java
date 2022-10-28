package View.Windows;
import javax.swing.*;
import View.View;

public class Home {

    JLabel labelHello;


    public Home() {
        objekteErstellen();
    }

    private void objekteErstellen() {
        labelHello = new JLabel("Wilkommen zurück");
        labelHello.setBounds(200,200,100,100);
        labelHello.setVisible(true); //später in main
        View.getFrame().add(labelHello);
        
    }

    public void isVisible(boolean isVisible) {
        //TODO: alle auf parameter setzen
    }
}
