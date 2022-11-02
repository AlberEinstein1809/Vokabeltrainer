package Engine;
import java.util.ArrayList;

import Objects.Vokabel;
import Structures.*;
import View.View;
import Timeslice.Timeslice;

public class Main{

    private static ArrayList<List<Vokabel>> box;
    private static View view;
    private static Thread timeslice;

    public static void main(String[] args) {
        view = new View();
        timeslice = new Thread(new Timeslice());
        timeslice.start();
    }
}