package mobile.phone.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIMenu extends JFrame implements ActionListener {

    GUIFrameDimension frameDimension = new GUIFrameDimension();

    JPanel topBar;
    JPanel mainContainer;
    JPanel footer;

    JButton callButton;
    JButton messageButton;
    JButton contactButton;

    JButton menuButton;
    JButton backButton;
    JButton openedAppsButton;

    GUIMenu() {
        drawTopBar();
        fillTopBar();

        drawMainContainer();
        fillMainContainer();

        drawFooter();
        fillFooter();

        this.setTitle("Mobile Phone");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(frameDimension.getFrameWidth(), frameDimension.getFrameHeight()); // iPhone X viewport
        this.setLayout(null);

        this.add(topBar);
        this.add(mainContainer);
        this.add(footer);

        this.setVisible(true);
    }

    private void drawTopBar() {
        topBar = new JPanel();
        topBar.setBackground(Color.lightGray);
        topBar.setBounds(0, 0, frameDimension.getFrameWidth(), frameDimension.getTopBarHeight());
        topBar.setLayout(null);
    }

    private void fillTopBar() {
        JLabel availability = new JLabel("|||");
        JLabel clock = new JLabel("12:00");
        JLabel battery = new JLabel("100%");

        availability.setHorizontalAlignment(JLabel.LEFT);
        clock.setHorizontalAlignment(JLabel.CENTER);
        battery.setHorizontalAlignment(JLabel.RIGHT);

        topBar.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));

        topBar.setLayout(new GridLayout(1,3, 10, 0));

        topBar.add(availability);
        topBar.add(clock);
        topBar.add(battery);
    }

    private void drawMainContainer() {
        mainContainer = new JPanel();
        mainContainer.setBounds(0, frameDimension.getTopBarHeight(), frameDimension.getFrameWidth(), frameDimension.getMainContainerHeight());
    }

    private void fillMainContainer() {
        callButton = new JButton("Call");
        messageButton = new JButton("Message");
        contactButton = new JButton("Contacts");

        callButton.setBackground(Color.lightGray);
        messageButton.setBackground(Color.lightGray);
        contactButton.setBackground(Color.lightGray);

        mainContainer.setBorder(BorderFactory.createEmptyBorder(150, 50, 150, 50));

        mainContainer.setLayout(new GridLayout(3, 0, 0, 30));

        mainContainer.add(callButton);
        mainContainer.add(messageButton);
        mainContainer.add(contactButton);

        callButton.addActionListener(this);
        messageButton.addActionListener(this);
        contactButton.addActionListener(this);

    }

    private void drawFooter() {
        footer = new JPanel();
        footer.setBackground(Color.green);
        footer.setBounds(0,  frameDimension.getTopBarHeight() + frameDimension.getMainContainerHeight(), frameDimension.getFrameWidth(), frameDimension.getFooterHeight());
        footer.setLayout(null);
    }

    private void fillFooter() {
        openedAppsButton = new JButton("Opened");
        menuButton = new JButton("Menu");
        backButton = new JButton("Back");

        openedAppsButton.setBackground(Color.lightGray);
        menuButton.setBackground(Color.lightGray);
        backButton.setBackground(Color.lightGray);

        footer.setLayout(new GridLayout(1,3));

        footer.add(openedAppsButton);
        footer.add(menuButton);
        footer.add(backButton);

        menuButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == callButton) {
            this.dispose();
            new GUICallFrame();
        }
        if(e.getSource() == messageButton) {
            this.dispose();
            new GUIMessageFrame();
        }
        if(e.getSource() == contactButton) {
            this.dispose();
            new GUIContactFrame();
        }
        if(e.getSource() == menuButton) {
            this.dispose();
            new GUIMenu();
        }
    }

}
