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
    private static int buttonZurueckCounterOld;
    private static int buttonVocLernenCounterOld;

    public View() {
        objekteErstellen();
        buttonZurueckCounterOld = 0;
        windowState = WindowState.HOME;
    }

    private void objekteErstellen() {
        frame = new JFrame();
        frame.setSize(400, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        home = new Home();
        vocAbfragen = new VocAbfragen();

        emptyLabel = new JLabel("");
        frame.add(emptyLabel);
        emptyLabel.setVisible(true);

        frame.setVisible(true);
    }

    public static void checkWindowState() {
        boolean switched = false;
        if(VocAbfragen.getButtonZurueckCounter() != buttonZurueckCounterOld) {
            windowState = WindowState.HOME;
            buttonZurueckCounterOld = VocAbfragen.getButtonZurueckCounter();
            switched = true;
        }

        if(Home.getButtonVocLernenCounter() != buttonVocLernenCounterOld) {
            windowState = WindowState.VOCABFRAGEN;
            buttonVocLernenCounterOld = Home.getButtonVocLernenCounter();
            switched = true;
        }

        if(switched) {
            home.isVisible(false);
            vocAbfragen.isVisible(false);

            switch(windowState) {
                case HOME: home.isVisible(true); break;
                case VOCABFRAGEN: vocAbfragen.isVisible(true); break;
                default: break;
            }

            switched = false;
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
