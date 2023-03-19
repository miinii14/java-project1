abstract public class Shape {
    protected Style style;

    public Shape(Style style) {
        this.style = style;
    }

    abstract public String toSvg();
}
