package lesson_07.Ex002;

public class program {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
    static double distance(point2D a, point2D b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
    public static void main(String[] args) {
        point2D a = new point2D();
        a.x = 0;
        a.y = 2;
        System.out.println(a.toString());

        point2D b = new point2D();
        b.x = 0;
        b.y = 10;
        System.out.println(b.toString());
        System.out.println(distance(a, b));
    }
}
