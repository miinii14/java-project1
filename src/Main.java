public class Main {
    public static void main(String[] args){
        Polygon poly = new Polygon(4,new Style("green","red",5));
        poly.setPoints(new Point[]{new Point(120,30), new Point(170,180), new Point(240,320), new Point(110,30)});
        SvgScene scene = new SvgScene();
        scene.add(poly);
        scene.saveHtml("index.html");
    }
}