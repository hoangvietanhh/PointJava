public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(2,4);
        float[] arr = point.getXY();
        for (float x:arr) {
            System.out.println(x);
        }
    }
}
