public class studsboll {
    public static void main(String[] args) {
        double h = 100;
        double a = -9.82;
        double v = 0;
        for (double t =0;t<=10;t+=0.1) {
            System.out.println(t + " "+ h);
            v = updateVelocity(v,a);
            if (checkHeight(h,v)) {
                h = updateHeightBounce(h,v,a);
                v = updateVelocityBouce(h,v,a);
            } else {
                h = updateHeight(h,v);
            }
        }
    }

    private static double updateVelocityBouce(double h, double v, double a) {
        double deltaT = -h-v/(a);
        v = v+a*deltaT;
        return -v;
    }

    private static double updateHeightBounce(double h, double v, double a) {
        double deltaT = -h-v/(a);
        v = v+a*deltaT;
        v = -v;
        deltaT = 0.1-deltaT;
        h=0;
        return h+(v*deltaT);
    }

    private static boolean checkHeight(double h, double v) {
        return h+v <= 0;
    }

    private static double updateHeight(double h, double v) {
        return h+v;
    }

    private static double updateVelocity(double v, double a) {
        return v + a*0.1;
    }
}
