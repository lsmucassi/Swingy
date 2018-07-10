package view;

import controller.SwingController;
import controller.Swingy;

import javax.swing.*;

public class GuiFrame extends JFrame {
    private GuiPanel _basePanel;

    public GuiFrame(SwingController baseController) {
        _basePanel = new GuiPanel(baseController);
        setFrame();
    }

    private void setFrame() {
        this.setContentPane(_basePanel);
        this.setSize(700, 650);
        this.setVisible(true);
    }

}
