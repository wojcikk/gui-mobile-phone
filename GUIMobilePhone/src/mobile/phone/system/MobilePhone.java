package mobile.phone.system;

import mobile.phone.gui.GUICallFrame;
import mobile.phone.gui.GUICallingFrame;

public class MobilePhone {

    private StringBuilder number = new StringBuilder(9);


    public void call() {
        System.out.println("Calling");
        new GUICallingFrame(number.toString());
    }

    public void addDigit(String digit) {
        number.append(digit);
    }

    public void deleteDigit() {
        number.deleteCharAt(getNumberLength() - 1);
    }

    public void clearNumber() {
        number.delete(0, getNumberLength());
    }

    public int getNumberLength() {
        return number.length();
    }

    public StringBuilder getNumber() {
        return number;
    }
}
