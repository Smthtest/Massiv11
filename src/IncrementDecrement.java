public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        int y = 10 - x-- + (++x * 2);
        System.out.println(x);
        System.out.println(y);

        System.out.println();
        int a = 3;
        int b = a++ +  a-- + --a + ++a;
        System.out.println(a);
        System.out.println(b);

        System.out.println();
        int r = 4;
        int m =r * (--r - --r);
        System.out.println(r);
        System.out.println(m);

        System.out.println();
        int t = 4;
        int s = (--t - --t) * t;
        System.out.println(t);
        System.out.println(s);



    }
}
