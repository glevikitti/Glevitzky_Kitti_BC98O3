/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoPapirOllo;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Jatek {
	public static void main(String[] args) {
		int jatekos;
		int gep;

		
		String ko="ko";
		String ollo="ollo";
		String papir="papir";
		Scanner sc= new Scanner(System.in);
		String sor = sc.nextLine();

		while(true) {
			if(sor.equals(ko)) {
				jatekos=0;
				break;
			} else if(sor.equals(papir)) {
				jatekos=1;
				break;
			} else if(sor.equals(ollo)) {
				jatekos=2;
				break;
			} else if(sor.equals("vege")) {
				return;
			}

			sor = sc.nextLine();
		}

		gep= (int)(3.0 * Math.random()); 
		System.out.println(jatekos+" "+gep);

		if((jatekos==2 && gep==1) || (jatekos==1 && gep==0) || (jatekos==0 && gep==2)) 
			System.out.println("A játékos nyert");
		else if(jatekos==gep) 
			System.out.println("Döntetlen");
		else System.out.println("A gép nyert");
	}
}
