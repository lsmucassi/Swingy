package view;
/** @Project : Swingy
 *  @school : wethinkcode.co.za
 *  @Author : lmucassi;
 */

import controller.SwingController;
import controller.Swingy;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class GuiFrame extends JFrame {
    private GuiPanel _screenPanel;
    private JPanel _controlPanel;
    private JLabel screen = new JLabel("Game Mode: Graphical mode [gui]\nWelcome to Swingy player_ \n A world of the unknown\n Armor: [ ]\n Weapons: [ ]\n Life: [ ]\n");;
    private JButton okBtn = new JButton("OK");
    private JButton  downArr = new JButton(" v ");
    private JButton upArr = new JButton(" ^ ");
    private JButton leftArr = new JButton(" < ");
    private JButton rightArr = new JButton(" > ");
    private JButton switchMode = new JButton(" -><-"); ;

    public GuiFrame(SwingController baseController) {
        super("Swingy Game");
        setLayout(new FlowLayout());
        _screenPanel = new GuiPanel(baseController);
        setFrame();
    }

    private void setFrame() {
        //basic window
        this.setContentPane(_screenPanel);
        _screenPanel.setBorder(new TitledBorder("Monitor"));
        _screenPanel.setSize(1000,500);
        _screenPanel.setLayout(new GridLayout(2,5));
        this.setSize(1000, 650);
        this.setVisible(true);
        //display window
        add(screen);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        //Controls panel
        upArr.setToolTipText("Move Up");
        add(upArr);
        leftArr.setToolTipText("Move Left");
        add(leftArr);
        okBtn.setToolTipText("OK");
        add(okBtn);
        rightArr.setToolTipText("Move Right");
        add(rightArr);
        downArr.setToolTipText("Move Down");
        add(downArr);
        switchMode.setToolTipText("Switch User Interface Mode");
        add(switchMode);
    }

}
