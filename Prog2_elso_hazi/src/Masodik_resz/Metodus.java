package Masodik_resz;

public class Metodus {

    public static void Novekvo(int a, int b, int c) //1.feladat
    {
        if (a <= b && b <= c) {
            System.out.println(a + " " + b + " " + c);
        }

        else if (a <= c && c <= b) {
            System.out.println(a + " " + c + " " + b);
        }

        else  if (b <= a && a <= c) {
            System.out.println(b + " " + a + " " + c);
        }

        else if (b <= c && c <= a) {
            System.out.println(b + " " + c + " " + a);
        }

        else if (c <= a && a <= b) {
            System.out.println(c + " " + a + " " + b);
        }

        else if (c <= b && b <= a) {
            System.out.println(c + " " + b + " " + a);
        }

    }

    public static void Min(double a, double b, double c) //2.feladat a. rész
    {
        Math.min(Math.min(a, b), c);

    }

    public static void Max(double a, double b, double c) //2. feladat b. rész
    {
        System.out.println(Math.max(Math.max(Math.abs(a), Math.abs(b)), Math.abs(c)));

    }

    public static void Sorrend(double a, double b, double c, double d) //3.feladat
    {
        System.out.println(a+" "+b+" "+c+" "+d);
        if (d >= 0) {
            System.out.println(a + " " + c + " " + b + " " + d);
        } else {
            System.out.println(a + " " + b + " " + d + " " + c);
        }

    }

    public static boolean Haromszog(double a, double b, double c) //4.feladat
    {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }

    public static void Szokoev(int a, int b) //5.feladat
    {
        int i = 0;
        int j;
        int ev = 0;
        if (a < b) {
            for (i = a + 1; i < b; i++) {
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                    ev++;
                }

            }
            System.out.println("Ennyi évszám volt: " + ev);
        }
        if (a > b) {
            for (j = b + 1; j < a; j++) {
                if (j % 4 == 0 && j % 100 != 0 || j % 400 == 0) {
                    ev++;
                }

            }
            System.out.println("Ennyi évszám volt: " + ev);
        }

    }

    public static void Jegy(int a) //6.feladat
    {
        switch (a) {
            case 1:
                System.out.println("Elégtelen");
                break;
            case 2:
                System.out.println("Elégséges");
                break;
            case 3:
                System.out.println("Közepes");
                break;
            case 4:
                System.out.println("Jó");
                break;
            case 5:
                System.out.println("Jeles");
        }

    }

    public static int Osztas(int a, int b) //7.feladat
    {
        int hanyados = 0;
        while (a >= b) {
            hanyados = hanyados + 1;
            a = a - b;
        }
        return hanyados;
    }

    public static boolean Prim(int n) //8.feladat
    {

        int osztokszama = 0;

        for (int oszto = 1; oszto <= n; oszto++) {
            if (n % oszto == 0) {
                osztokszama = osztokszama + 1;
            }

        }

        if (osztokszama == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static long Faktor(long a) //11.feladat
    {
        long szam = 1;
        int i = 1;
        while (i <= a) {
            szam *= i;
            i++;
        }
        return szam;
    }

    public static void Ketszam(int a, int b, int k) //12.feladat
    {
        int i;
        for (i = a; i <= b; i++) {
            if (i % k == 0) {
                System.out.println(i);
            }
        }
    }

    public static void Fibonacci(int n) //9.feladat
    {
        int a = 1;
        int b = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(b);
            b=a+b;
            a=b-a;
        }
    }

    public static int ForditottSzam(int n) //10.feladat
    {
        int elsoszamjegy = n / 100;
        int elsomaradek = n % 100;
        int masodikszamjegy = elsomaradek / 10;
        int masodikmaradek = elsomaradek % 10;
        int ujszam = masodikmaradek * 100 + masodikszamjegy * 10 + elsoszamjegy;
        return ujszam;

    }

    public static void MinFibonacci(int n) //13.feladat
    {
        int a = 1;
        int b = 0;
        int szam=0;
       for (int i = 0; szam<= n; i++) {
            szam=b;
            b=a+b;
            a=b-a;
        }
        System.out.println(szam);

    }

    public static void Kobszamok() {
        int szam1 = 0;
        int szam2 = 0;
        int szam3 = 0;
        int szam4 = 0;
        int szam5 = 0;
        int szam6 = 0;
        int szam7 = 0;
        int n = 0;
        for (n = 0; n < 1000; n++) {
            if (n < 10) {
                szam1 = n;
                if (Math.pow(szam1, 3) == n) {
                    System.out.println(n);
                }
            }
            else if (n < 100) {
                szam2 = n / 10;
                szam3 = n % 10;
                //System.out.println(szam2+""+szam3);
                if (Math.pow(szam2, 3) + Math.pow(szam3, 3) == n) {
                    System.out.println(n);
                }
            } else if (n < 1000) {
                szam4 = n / 100;
                szam5 = n % 100;
                szam6 = szam5 / 10;
                szam7 = szam5 % 10;
                if (Math.pow(szam4, 3) + Math.pow(szam6, 3) + Math.pow(szam7, 3) == n) {
                    System.out.println(n);
                }
                //System.out.println(szam4+""+szam6+" "+szam7);
            }
        }

    }

    public static void main(String[] args) {
        Novekvo(3, 3, 3);
        Min(1.0, 3.0, 5.0);
        Max(-6, 4, 0);
        Sorrend(1, 2, 3, -4);
        System.out.println("Ebből a 3 oldalból szerkeszthető háromszög:" + Haromszog(1, 2, 4));
        Szokoev(2009, 2000);
        Jegy(5);
        System.out.println(Osztas(12, 4));
        System.out.println(Prim(5));
        System.out.println(Faktor(6));
        Ketszam(12, 24, 4);
        Fibonacci(6);
        System.out.println(ForditottSzam(311));
        MinFibonacci(2);
        Kobszamok();

    }

}
