package mobile.phone.gui;

public class GUIFrameDimension {
    // ! BUG Z WYSOKOSCIA PANELI !
    private int frameHeight = 667;
    private int frameWidth = 375;
    private int actualFrameHeight = frameHeight - 30;
    private int topBarHeight = 20;
    private int footerHeight = 40;

    private int mainContainerHeight = actualFrameHeight - topBarHeight - footerHeight;

    public int getFrameHeight() {
        return frameHeight;
    }

    public int getFrameWidth() {
        return frameWidth;
    }

    public int getActualFrameHeight() {
        return actualFrameHeight;
    }

    public int getTopBarHeight() {
        return topBarHeight;
    }

    public int getFooterHeight() {
        return footerHeight;
    }

    public int getMainContainerHeight() {
        return mainContainerHeight;
    }
}
