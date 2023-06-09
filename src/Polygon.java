import java.util.Locale;

public class Polygon implements Shape{
    private Vec2[] points;

    public Polygon(Vec2[] points) {
        this.points = points;
    }

    @Override
    public String toSvg(String parameters) {
        String pointsString = "";
        for(Vec2 point : points)
            pointsString += point.x + "," + point.y + " ";

        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" %s />", pointsString, parameters);
    }


}