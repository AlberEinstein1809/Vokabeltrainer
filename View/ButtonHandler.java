package View;

public class ButtonHandler {

    private static int buttonVocAbfragenZurueck;

    private static WindowState windowState;
    
    public ButtonHandler() {
        buttonVocAbfragenZurueck = 0;
        windowState = WindowState.VOCABFRAGEN;
    }

    public static void checkButtons() {
        if(View.getVocAbfragen().getButtonZurueckCounter() != buttonVocAbfragenZurueck) {
            windowState = windowState.HOME;
            buttonVocAbfragenZurueck++;
        }
    }

    public static WindowState getWindowState() {
        return windowState;
    }

}
