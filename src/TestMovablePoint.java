public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2,4,1,3);
        float[] arr = movablePoint.getSpeed();
        for (float x : arr) {
            System.out.println(x);
        }
    }
}
