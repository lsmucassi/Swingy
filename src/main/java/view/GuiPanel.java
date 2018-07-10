package view;

import controller.SwingController;

import javax.swing.*;

public class GuiPanel extends JPanel {
    private SwingController _baseController;

    public GuiPanel(SwingController baseController) {
        this._baseController = baseController;

    }
}
