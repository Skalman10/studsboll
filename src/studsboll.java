public class studsboll {
    public static void main(String[] args) {
        double h = 100;
        double a = -9.82;
        double v = 0;
        for (double t =0;t<=10;t+=0.1) {
            System.out.println(t + " "+ h);
            v = updateVelocity(v,a);
            h = updateHeight(h,v);
            if (checkHeight(h)) {
                v = -v;
            }
        }
    }

    private static boolean checkHeight(double h) {
        if (h<=0||h>=100) {
            return true;
        } else {
            return false;
        }
    }

    private static double updateHeight(double h, double v) {
        return h+v;
    }

    private static double updateVelocity(double v, double a) {
        return v + a*0.1;
    }
}
