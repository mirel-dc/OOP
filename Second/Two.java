public class Two {
    public static void main(String[] args) {
        Vector a = new Vector();
        a.x = 10;
        a.y = 5;

        Geometry g = new Geometry();
        System.out.println(a.getLength(a));

        Vector b = new Vector();
        b.x = 2;
        b.y = 12;

        System.out.println(g.add(a, b));

        Segment s = new Segment();
        s.end = new Vector();
        s.begin = new Vector();
        s.end.x = 10;
        s.end.y = 20;
        s.begin.x = 15;
        s.begin.y = 5;

        System.out.println(g.getLength(s));
        System.out.println(g.isVectorInSegment(s, a));
        System.out.println(s.getLength(s));
        System.out.println(s.Contains(s, a));

        Vector v = new Vector(5, 6);
        System.out.println(v);

        System.out.println("-------------------");
        Rational r1 = new Rational(3, 5);
        Rational r2 = new Rational(5, 7);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(Rational.Sum(r1, r2));
        System.out.println(Rational.Sub(r1, r2));
        System.out.println(Rational.Times(r1, r2));
        System.out.println(Rational.Divide(r1, r2));
    }
}

class Vector {
    public double x, y, length;

    Vector(double x, double y) {
        this.x = x;
        this.y = y;
        this.length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    Vector() {
    };

    public double getLength(Vector a) {
        length = Geometry.getLength(a);
        return Geometry.getLength(a);
    }

    public Vector add(Vector a1, Vector a2) {
        return Geometry.add(a1, a2);
    }

    public boolean Belongs(Segment s, Vector a) {
        return Geometry.isVectorInSegment(s, a);
    }

    @Override
    public String toString() {
        if (this.length == 0)
            return "Coords of vector is " + this.x + " " + this.y;
        else
            return "Coords of vector is " + this.x + " " + this.y + " its length: " + this.length;
    }
}

class Segment {
    Vector begin, end;

    public boolean Contains(Segment s, Vector a) {
        return Geometry.isVectorInSegment(s, a);
    }

    public double getLength(Segment s) {
        return Geometry.getLength(s);
    }
}

class Geometry {
    public static double getLength(Vector A) {
        double result;
        result = Math.sqrt(Math.pow(A.x, 2) + Math.pow(A.y, 2));
        return result;
    }

    public static double getLength(Segment S) {
        double result;
        result = Math.sqrt(Math.pow((S.end.x - S.begin.x), 2) + Math.pow((S.end.y - S.begin.y), 2));
        return result;
    }

    public static boolean isVectorInSegment(Segment s, Vector a) {
        double s1, s2;
        Geometry G = new Geometry();
        double s3 = G.getLength(s);
        s1 = Math.sqrt(Math.pow((a.x - s.begin.x), 2) + Math.pow((a.y - s.begin.y), 2));
        s2 = Math.sqrt(Math.pow((s.end.x - a.x), 2) + Math.pow((s.end.y - a.y), 2));
        if (s3 == s1 + s2) {
            return true;
        } else {
            return false;
        }
    }

    public static Vector add(Vector a1, Vector a2) {
        double result;
        Vector a = new Vector();
        a.x = a1.x + a2.x;
        a.y = a1.y + a2.y;
        return a;
    }
}

class Rational {
    int a, b;

    Rational(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Rational() {
    }

    public static Rational Sum(Rational r1, Rational r2) {
        Rational R = new Rational();
        R.a = (r1.a * r2.b) + (r2.a * r1.b);
        R.b = r1.b * r2.b;
        return R;
    }

    public static Rational Sub(Rational r1, Rational r2) {
        Rational R = new Rational();
        R.a = (r1.a * r2.b) - (r2.a * r1.b);
        R.b = r1.b * r2.b;
        return R;
    }

    public static Rational Times(Rational r1, Rational r2) {
        Rational R = new Rational();
        R.a = r1.a * r2.a;
        R.b = r1.b * r2.b;
        return R;
    }

    public static Rational Divide(Rational r1, Rational r2) {
        Rational R = new Rational();
        R.a = r1.a * r2.b;
        R.b = r1.b * r2.a;
        return R;
    }

    @Override
    public String toString() {
        return a + "/" + b;
    }
}