package View;

import javax.swing.*;
import Engine.Main;
import View.Windows.*;

public class View {

    private static JFrame frame;
    private static JLabel emptyLabel;
    private static WindowState windowState;
    private static Home home;
    private static VocAbfragen vocAbfragen;
    private static WindowState windowStateOld;
    private static ButtonHandler buttonHandler;

    public View() {
        objekteErstellen();
        windowState = WindowState.HOME;
        buttonHandler = new ButtonHandler();
    }

    private void objekteErstellen() {
        frame = new JFrame();
        frame.setSize(400, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        home = new Home();
        vocAbfragen = new VocAbfragen();

        emptyLabel = new JLabel("");
        frame.add(emptyLabel);
        emptyLabel.setVisible(true);

        frame.setVisible(true);
    }

    public static void checkWindowState() {
        if(windowStateOld != windowState) {
            if(Main.getButtonHandler().getWindowState() != windowState) {
                windowState = Main.getButtonHandler().getWindowState();
            }

            home.isVisible(false);
            vocAbfragen.isVisible(false);

            switch(windowState) {
                case HOME: home.isVisible(true);
                case VOCABFRAGEN: vocAbfragen.isVisible(true);
                default: break;
            }
            windowStateOld = windowState;
        }
            
    }

    public static JFrame getFrame() {
        return frame;
    }

    public static Home getHome() {
        return home;
    }

    public static VocAbfragen getVocAbfragen() {
        return vocAbfragen;
    }

    

    
}
