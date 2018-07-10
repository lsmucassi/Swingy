package controller;

import view.GuiFrame;

public class SwingController {

    public void SwingController() {}
    private GuiFrame guiFrame;

    public void start(Character mode) {
        guiFrame = new GuiFrame(this);
        if (mode.equals('A'))
            System.out.println("WeAre cli");
        else if (mode.equals('B'))
            System.out.println("WeAre Gui");
        else {
            System.out.println("Error: Unrecognised game mode request");
            return;
        }
    }
}
