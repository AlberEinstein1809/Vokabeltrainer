package View;

import javax.swing.*;

public class View {

    JFrame frame;

    public View() {
        objekteErstellen();
    }

    private void objekteErstellen() {
        frame = new JFrame();
        frame.setSize(400, 800);
    }

    private static WindowState windowState;

    
}
