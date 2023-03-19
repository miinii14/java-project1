public class Main {
    public static void main(String[] args){
        Point p1 = new Point(12, 13);
        Point p2 = new Point(33,9);
        Segment s = new Segment(p1, p2);

        s.toSVG();


    }
}