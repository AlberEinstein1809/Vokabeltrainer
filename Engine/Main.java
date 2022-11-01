package Engine;
import java.util.ArrayList;

import Objects.Vokabel;
import Structures.*;
import View.View;
import Timeslice.Timeslice;

public class Main{

    private static ArrayList<List<Vokabel>> box;
    private static View view;
    private static Thread timesclice;

    public static void main(String[] args) {
        view = new View();
        timesclice = new Thread(new Timeslice());
        timesclice.start();
    }
}