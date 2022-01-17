package mobile.phone.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIContactFrame extends JFrame implements ActionListener {

    GUIFrameDimension frameDimension = new GUIFrameDimension();

    JPanel topBar;
    JPanel mainContainer;
    JPanel footer;

    JButton menuButton;

    GUIContactFrame() {

        drawTopBar();

        drawMainContainer();
        fillMainContainer();

        drawFooter();
        fillFooter();

        this.setTitle("Contact");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(frameDimension.getFrameWidth(), frameDimension.getFrameHeight()); // iPhone X viewport

        this.add(topBar);
        this.add(mainContainer);
        this.add(footer);
        this.setVisible(true);
    }

    private void drawTopBar() {
        topBar = new JPanel();
        topBar.setBackground(Color.red);
        topBar.setBounds(0, 0, frameDimension.getFrameWidth(), frameDimension.getTopBarHeight());
        topBar.setLayout(null);
    }

    private void drawMainContainer() {
        mainContainer = new JPanel();
        mainContainer.setBounds(0, frameDimension.getTopBarHeight(), frameDimension.getFrameWidth(), frameDimension.getMainContainerHeight());
    }

    private void fillMainContainer() {

        JLabel text = new JLabel("Contact frame");

        mainContainer.setLayout(new FlowLayout());
        mainContainer.add(text);
    }

    private void drawFooter() {
        footer = new JPanel();
        footer.setBackground(Color.green);
        footer.setBounds(0,  frameDimension.getTopBarHeight() + frameDimension.getMainContainerHeight(), frameDimension.getFrameWidth(), frameDimension.getFooterHeight());
        footer.setLayout(null);
    }

    private void fillFooter() {
        menuButton = new JButton("Menu");
        footer.setLayout(new FlowLayout());
        footer.add(menuButton);
        menuButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == menuButton) {
            this.dispose();
            new GUIMenu();
        }
    }
}
