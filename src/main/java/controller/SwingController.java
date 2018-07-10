package controller;
/** @Project : Swingy
 *  @school : wethinkcode.co.za
 *  @Author : lmucassi;
 */

import view.GuiFrame;

public class SwingController {

    public void SwingController() {}
    private GuiFrame guiFrame;

    public void start(Character mode) {
        if (mode.equals('A'))
            System.out.println("WeAre cli");
        else if (mode.equals('B')) {
            guiFrame = new GuiFrame(this);
        }
        else {
            System.out.println("Error: Unrecognised game mode request");
            return;
        }
    }
}
