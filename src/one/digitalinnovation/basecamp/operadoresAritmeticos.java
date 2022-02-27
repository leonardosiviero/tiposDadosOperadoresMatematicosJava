package one.digitalinnovation.basecamp;

public class operadoresAritmeticos {

    public static void main(String[] args) {

        System.out.println("Prepos");
        prePos();
        System.out.println("Aritmetico");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();

    }

    public static void prePos() {

        int k = 10;

        int i = ++k;
        int j = k--;
        int s = k;

        System.out.println(i);
        System.out.println(j);
        System.out.println(s);

    }

    public static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = e / a;
        int r5 = c % b;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);

    }

    public static void atribuicao() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println(d);

        i += 5;
        j -= 3;
        d /= 2.7d;
        l *= 3;
        k %= 2;

        System.out.println(i);
        System.out.println(j);
        System.out.println(d);
        System.out.println(l);
        System.out.println(k);

        i = k = j;

        System.out.println(k);
        System.out.println(i);

    }

    public static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k;

        System.out.println("a = i++ + --j * k = " + a);
        System.out.println("i = " + i);

        int b = k / --i % 3 + 1;

        System.out.println("b = k / --i % 3 + 1 = " + b);
        System.out.println("i = " + i);

        int c = 2;

        c *= i += 5;

        System.out.println(c);

    }


}
