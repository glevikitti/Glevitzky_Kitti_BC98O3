package Bankartya;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] szamos = new Integer[16];
        int szam = 0;

        while (sc.hasNextLine()) {
            String sor = sc.nextLine();
//            if (sor.equals("vege")) {
//                break;
//            }
            for (int i = 0; i < sor.length(); i++) {
                szamos[i] = Integer.parseInt(Character.toString(sor.charAt(i)));
            }

            for (int i = 0; i < szamos.length; i += 2) {
                szamos[i] = szamos[i] * 2;

            }

            for (int i = 0; i < szamos.length; i++) {
                if (szamos[i] > 9) {
                    szamos[i] = szamos[i] / 10 + szamos[i] % 10;
                } else {
                    szamos[i] = szamos[i];
                }

            }

            for (int i = 0; i < szamos.length; i++) {
                szam += szamos[i];

            }

            if (szam % 10 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        
        

    }

}
