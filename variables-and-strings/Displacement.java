public class Displacement {
    public static void main(String[] args) {
        double s0 = 12.0;
        double v0 = 3.5;
        double a = 9.8;
        double t = 10;
        double s = (s0 + (v0 * 3.5) + (1/2 * a * t * t));
        System.out.println(s);
    }
}