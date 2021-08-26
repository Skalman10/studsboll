public class studsboll {
    public static void main(String[] args) {
        double t = 0;
        double h = 0;
        double a = 9.82;
        while (t<=10) {
            t+=0.1;
            h += a;
            System.out.println(t + " "+ h);
        }
    }
}
