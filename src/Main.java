public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x= x << 1;
        System.out.println(Integer.toBinaryString(x));

        int a = 9;
        a = a << 1;
        System.out.println(Integer.toBinaryString(a));
        int b = 17;
        b = b << 1;
        System.out.println(Integer.toBinaryString(b));
        int c = 88;
        c = c << 1;
        System.out.println(Integer.toBinaryString(c));

        x = 150;
        System.out.println(Integer.toBinaryString(x));
        x = x>>2;
        System.out.println(Integer.toBinaryString(x));
        x = 225;
        System.out.println(Integer.toBinaryString(x));
        x = 1555;
        System.out.println(Integer.toBinaryString(x));
        x = 32456;
        System.out.println(Integer.toBinaryString(x));

        x = 7;
        int y = 17;
        int z = y & x;
        z = x | y;
        System.out.println(Integer.toBinaryString(z));

        int p = 8;
        System.out.println(p);
        p ++;
        System.out.println(p);

        int k = 6;
        System.out.println(k);
        k += 1;
        System.out.println(k);
        ++ k;
        System.out.println(k);
        k ++;
        System.out.println(k);

        x = 5;
        y = 8;
        int sum = x++ + y;
        System.out.println(sum);














    }
}