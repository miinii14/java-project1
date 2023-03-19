import java.util.Locale;

public class Ellipse extends Shape{
    private Point center;
    private double rx, ry;

    public Ellipse(Style style, Point center, double rx, double ry) {
        super(style);
        this.center = center;
        this.rx = rx;
        this.ry = ry;
    }

    @Override
    public String toSvg() {
        return String.format(Locale.ENGLISH,"<ellipse cx=\"%f\" cy=\"%f\" rx=\"%f\" ry=\"%f\" style=\"%s\"/>", center.x,center.y,rx,ry, style.toSVG());
    }
}
