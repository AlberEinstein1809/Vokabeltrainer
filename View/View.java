package View;

import javax.swing.*;

public class View {

    JFrame frame;
    private static WindowState windowState;

    public View() {
        objekteErstellen();
        windowState = WindowState.HOME;
    }

    private void objekteErstellen() {
        frame = new JFrame();
        frame.setSize(400, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    

    
}
