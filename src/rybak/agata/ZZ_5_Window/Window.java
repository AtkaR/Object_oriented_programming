package rybak.agata.ZZ_5_Window;

/**
 * Created by asus on 2017-03-17.
 */
public class Window {
    private double width;
    private double height;
    private double frame_width;
    private static final double price_glass = 30;
    private static final double price_frame = 20;

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if(width > 0)
        {
            this.width = width;
        }
        else
        {
            this.width = 1.7;
        }
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if(height > 0)
        {
            this.height = height;
        }
        else
        {
            this.height = 1.5;
        }
    }

    public double getFrame_width() {
        return frame_width;
    }
    public void setFrame_width(double frame_width) {
        if(((2*frame_width) < 0.1 * width) && ((2*frame_width) < 0.1 * height))
        {
            this.frame_width = frame_width;
        }
        else
        {
            this.frame_width = 0.2;
        }

    }

    public Window(double width, double height, double frame_width)
    {
        setWidth(width);
        setHeight(height);
        setFrame_width(frame_width);
    }

    public double glassArea()
    {
        return (width - (2 * frame_width)) * (height - (2 * frame_width));
    }

    public double frameArea()
    {
        return (width * height - glassArea());
    }

    public double windowPrice()
    {
        double glass_price = glassArea() * price_glass;
        double frame_price = frameArea() * price_frame;
        return glass_price + frame_price;
    }

    @Override
    public String toString() {
        return "Window{" +
                "width=" + width +
                ", height=" + height +
                ", frame_width=" + frame_width +
                '}';
    }
}
