import java.util.Locale;

public class Style {
    public final String fillColor, strokeColor;
    double strokeWidth;

    public Style(String fillColor, String strokeColor, double strokeWidth) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }

    public String toSVG (){
        return String.format(Locale.ENGLISH, "style=\"fill:%s;stroke:%s;stroke-width:%f\"", fillColor,strokeColor,strokeWidth);
    }
}
