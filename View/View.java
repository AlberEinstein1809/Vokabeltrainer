package View;

import javax.swing.*;

import View.Windows.*;

public class View {

    private static JFrame frame;
    private static JLabel emptyLabel;
    private static WindowState windowState;
    private static Home home;

    public View() {
        objekteErstellen();
        windowState = WindowState.HOME;
    }

    private void objekteErstellen() {
        frame = new JFrame();
        frame.setSize(400, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        emptyLabel = new JLabel("hello");
        emptyLabel.setBounds(200,200,200,200);
        emptyLabel.setVisible(false);
        frame.add(emptyLabel);
        
        home = new Home();
    }

    public static JFrame getFrame() {
        return frame;
    }

    

    
}
