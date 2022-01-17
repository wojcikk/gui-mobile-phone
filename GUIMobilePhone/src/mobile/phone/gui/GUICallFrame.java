package mobile.phone.gui;

import mobile.phone.system.MobilePhone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICallFrame extends JFrame implements ActionListener {

    GUIFrameDimension frameDimension = new GUIFrameDimension();

    MobilePhone mobilePhone = new MobilePhone();

    JPanel topBar;
    JPanel mainContainer;
    JPanel footer;

    JButton menuButton;
    JButton backButton;
    JButton openedAppsButton;

    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton star = new JButton("*");
    JButton zero = new JButton("0");
    JButton hash = new JButton("#");
    JButton clear = new JButton("Clear");
    JButton call = new JButton("Call");
    JButton delete = new JButton("Delete");

    GUICallFrame() {
        drawTopBar();
        fillTopBar();

        drawMainContainer();
        fillMainContainer();

        drawFooter();
        fillFooter();

        this.setTitle("Call");
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
    JPanel keyboard;
    JLabel numberField;
    private void fillMainContainer() {
        numberField = new JLabel();

        numberField.setVerticalAlignment(JLabel.CENTER);
        numberField.setHorizontalAlignment(JLabel.CENTER);

        keyboard = new JPanel();

        keyboard.setLayout(new GridLayout(5, 3, 10, 10));

        one.setBackground(Color.lightGray);
        two.setBackground(Color.lightGray);
        three.setBackground(Color.lightGray);
        four.setBackground(Color.lightGray);
        five.setBackground(Color.lightGray);
        six.setBackground(Color.lightGray);
        seven.setBackground(Color.lightGray);
        eight.setBackground(Color.lightGray);
        nine.setBackground(Color.lightGray);
        star.setBackground(Color.lightGray);
        zero.setBackground(Color.lightGray);
        hash.setBackground(Color.lightGray);
        clear.setBackground(Color.lightGray);
        call.setBackground(Color.lightGray);
        delete.setBackground(Color.lightGray);

        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        star.addActionListener(this);
        zero.addActionListener(this);
        hash.addActionListener(this);
        clear.addActionListener(this);
        call.addActionListener(this);
        delete.addActionListener(this);

        keyboard.add(one);
        keyboard.add(two);
        keyboard.add(three);
        keyboard.add(four);
        keyboard.add(five);
        keyboard.add(six);
        keyboard.add(seven);
        keyboard.add(eight);
        keyboard.add(nine);
        keyboard.add(star);
        keyboard.add(zero);
        keyboard.add(hash);
        keyboard.add(clear);
        keyboard.add(call);
        keyboard.add(delete);


        keyboard.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50));

        mainContainer.setLayout(new GridLayout(3, 0, 0, -100));

        mainContainer.add(numberField);
        mainContainer.add(keyboard);

    }

    private void refreshNumber() {
        numberField.setText(mobilePhone.getNumber().toString());
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
        if(e.getSource() == menuButton) {
            this.dispose();
            new GUIMenu();
        }

        if(e.getSource() == one && mobilePhone.getNumberLength() < 9) {
            mobilePhone.addDigit(one.getText());
            refreshNumber();
            System.out.println(mobilePhone.getNumber());
        }
        if(e.getSource() == two && mobilePhone.getNumberLength() < 9) {
            mobilePhone.addDigit(two.getText());
            refreshNumber();
            System.out.println(mobilePhone.getNumber());
        }
        if(e.getSource() == three && mobilePhone.getNumberLength() < 9) {
            mobilePhone.addDigit(three.getText());
            refreshNumber();
            System.out.println(mobilePhone.getNumber());
        }
        if(e.getSource() == four && mobilePhone.getNumberLength() < 9) {
            mobilePhone.addDigit(four.getText());
            refreshNumber();
            System.out.println(mobilePhone.getNumber());
        }
        if(e.getSource() == five && mobilePhone.getNumberLength() < 9) {
            mobilePhone.addDigit(five.getText());
            refreshNumber();
            System.out.println(mobilePhone.getNumber());
        }
        if(e.getSource() == six && mobilePhone.getNumberLength() < 9) {
            mobilePhone.addDigit(six.getText());
            refreshNumber();
            System.out.println(mobilePhone.getNumber());
        }
        if(e.getSource() == seven && mobilePhone.getNumberLength() < 9) {
            mobilePhone.addDigit(seven.getText());
            refreshNumber();
            System.out.println(mobilePhone.getNumber());
        }
        if(e.getSource() == eight && mobilePhone.getNumberLength() < 9) {
            mobilePhone.addDigit(eight.getText());
            refreshNumber();
            System.out.println(mobilePhone.getNumber());
        }
        if(e.getSource() == nine && mobilePhone.getNumberLength() < 9) {
            mobilePhone.addDigit(nine.getText());
            refreshNumber();
            System.out.println(mobilePhone.getNumber());
        }
        if(e.getSource() == zero && mobilePhone.getNumberLength() < 9) {
            mobilePhone.addDigit(zero.getText());
            refreshNumber();
            System.out.println(mobilePhone.getNumber());
        }

        if(e.getSource() == delete && mobilePhone.getNumberLength() > 0) {
            mobilePhone.deleteDigit();
            refreshNumber();
            System.out.println(mobilePhone.getNumber());
        }

        if(e.getSource() == clear && mobilePhone.getNumberLength() > 0) {
            mobilePhone.clearNumber();
            refreshNumber();
            System.out.println(mobilePhone.getNumber());
        }

        if(e.getSource() == call && mobilePhone.getNumberLength() == 9) {
            this.dispose();
            mobilePhone.call();
            refreshNumber();
            System.out.println(mobilePhone.getNumber());
        }
    }

}
