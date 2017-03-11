package com.tab.potegowanie_z_uwgl_ujemnej_potegi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int a;
	 int b;
	 double wynik = 1;
	 boolean flaga=false;

	 Scanner wpisz = new Scanner(System.in);
	 System.out.println("Pddaj liczbe ");
	 a = wpisz.nextInt();

	 System.out.println("Podaj potege ");
	 b = wpisz.nextInt();

	 if(b<0){
	 	flaga=true;
	 }

	 while (b > 0) {
	 	wynik = wynik * a;
	 	b = b-1;
	 }

	 while (b < 0) {
	     wynik = wynik * a;
	     b = b+1;
		 System.out.println("Wartosc b: " + b);
		 System.out.println("Wykonuje sie: " + wynik);
	 }

		System.out.println("B po obliczeniach: "+b);

	 if(flaga) {
		 wynik = 1 / wynik;
	 }
     System.out.println("Wynik: "+wynik);

    }
}
