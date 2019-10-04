package Masodik_resz;
public class Metodus {
    
    public static void Novekvo(int a, int b, int c) //1.feladat
    {
        if(a<b&&b<c)
            System.out.println(a+" "+b+" "+c);
        
        if(a<c&&c<b)
            System.out.println(a+" "+c+" "+b);
        
        if(b<a&&a<c)
            System.out.println(b+" "+a+" "+c);
        
        if(b<c&&c<a)
            System.out.println( b+" "+c+" "+a);
        
        if(c<a&&a<b)
            System.out.println(c+" "+a+" "+b);
        
        if(c<b&&b<a)
            System.out.println(c+" "+b+" "+a);
        
        
    }
    
    public static void Min(double a, double b, double c) //2.feladat a. rész
    {
        if(a<b&&b<c)
            System.out.println(a);
        
        if(a<c&&c<b)
            System.out.println(a);
        
        if(b<a&&a<c)
            System.out.println(b);
        
        if(b<c&&c<a)
            System.out.println(b);
        
        if(c<a&&a<b)
            System.out.println(c);
        
         if(c<b&&b<a)
             System.out.println(c);
        
        
    }
    
    public static void Max(double a, double b, double c) //2. feladat b. rész
    {
        if(a<0)
            a=a*(-1);
        else if(b<0)
            b=b*(-1);
        else if(c<0)
           c=c*(-1);
        
        if(a<b&&b<c)
            System.out.println(c);
        
        if(a<c&&c<b)
            System.out.println(b);
        
        if(b<a&&a<c)
            System.out.println(c);
        
        if(b<c&&c<a)
            System.out.println(a);
        
        if(c<a&&a<b)
            System.out.println(b);
        
         if(c<b&&b<a)
             System.out.println(a);
        
    }
    
    public static String Sorrend(double a, double b, double c, double d) //3.feladat
    {
        if(d>=0)
            return a+" "+c+" "+b+" "+d;
        else return a+" "+b+" "+d+" "+c;
            
    }
    
    public static boolean Haromszog(double a, double b, double c) //4.feladat
    {
        if(a+b>c&&a+c>b&&b+c>a)
            return true;
        else return false;
    }
    
    public static void Szokoev(int a, int b) //5.feladat
    {
        int i;
        for(i=a+1;i<b;i++)
        if(i%4==0&&i%100!=0)
                System.out.println(i);
        if(i%100==0)
            System.out.println(i);
    }
    
    public static String Jegy(int a) //6.feladat
    {
        switch(a){
            case 1 :
                return "Elégtelen";
            case 2 :
                return "Elégséges";
            case 3 :
                return "Közepes";
            case 4 :
                return "Jó";
            case 5 :
                return "Jeles";
                }
        return "Ez nem egy jegy";
        
        
    }
    
    public static double Osztas(double a, double b) //7.feladat
    {
        double hanyados=0;
        while(a>=b){
            hanyados=hanyados+1;
        a=a-b;
        }
        return hanyados;
    }
    
    public static boolean Prim(int n) //8.feladat
    {
        
        int osztokszama=0;
        
        for(int oszto=1;oszto<=n;oszto++)
        {
            if(n%oszto==0)
                osztokszama=osztokszama+1;
            
        }
        
        if(osztokszama==2)
            return true;
        else return false;
    }
    
    public static long Faktor(long a) //11.feladat
    {
       long szam = 1;
       int i = 1;
       while ( i <= a ) {
      szam *= i;
      i++;
    }
    return szam;
    }
    
    public static void Ketszam(int a, int b, int k) //12.feladat
    {
        int i;
        for (i = a; i <= b; i ++)
            if (i % k == 0)
                System.out.println(i);
    }
    
    public static int Fibonacci(int n) //9.feladat
    {
    int a=0;
    int b=1;
    int ujszam = 0;
    for (int i = 0; i < n; i++) {
        a=b;
        b=ujszam;
        ujszam=a+b;
    }
    return ujszam;
}
    
    public static int ForditottSzam(int n) //10.feladat
    {
        int elsoszamjegy=n/100;
        int elsomaradek=n%100;
        int masodikszamjegy=elsomaradek/10;
        int masodikmaradek=elsomaradek%10;
        int ujszam=masodikmaradek*100+masodikszamjegy*10+elsoszamjegy;
        return ujszam;
        
    }
    
    public static void MinFibonacci(int n) //13.feladat
    {
        int a=0;
        int b=1;
        int ujszam = 0;
        int i=0;
        int min=n;
        int ujmin = 0;
        for(i=0;i<n+1000000;i++) {
        a=b;
        b=ujszam;
        ujszam=a+b;
        
        if(ujszam>n)
            break;
        }
        System.out.println(ujszam);
      
            
    }
    
    public static void Kobszamok()
    {
      int szam2=0;
      int szam3=0;
      int szam4=0;
      int szam5=0;
      int szam6=0;
      int szam7=0;
      int n=0;
      for(n=10;n<1000;n++){
          if(n<100){
              szam2=n/10;
              szam3=n%10;
              //System.out.println(szam2+""+szam3);
          }
          else if(n<1000){
              szam4=n/100;
              szam5=n%100;
              szam6=szam5/10;
              szam7=szam5%10;
              //System.out.println(szam4+""+szam6+" "+szam7);
          }
      
             
      }
     
      if(Math.pow(szam2, 3)+Math.pow(szam3, 3)==n||Math.pow(szam4, 3)+Math.pow(szam6, 3)+Math.pow(szam7, 3)==n)
              System.out.println(n);
      else System.out.println("Nincs is ilyen szám");
      
      
        
        
    }
    
    public static void main(String[] args) {
        Novekvo(5,3,4);
        Min(1.0,3.0,5.0);
        Max(-6,4,0);
        System.out.println(Sorrend(1,2,3,-4));
        System.out.println("Ebből a 3 oldalból szerkeszthető háromszög:"+Haromszog(1,2,4));
        Szokoev(2000,2005);
        System.out.println(Jegy(7));
        System.out.println(Osztas(12,4));
        System.out.println(Prim(5));
        System.out.println(Faktor(6));
        Ketszam(12,24,4);
        System.out.println(Fibonacci(3));
        System.out.println(ForditottSzam(311));
        MinFibonacci(6);
        Kobszamok();
        
    }
    
    
    
}
