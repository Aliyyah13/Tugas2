/*Nim		: 13020210016
Nama		: A.Nur Aliyyah
Hari/Tgl	: Kamis, 23 Maret 2023
Pukul		: 10.59*/

import java.util.Scanner;

public class PriFor {

public static void main(String[] args) {

	int i,N;
	Scanner masukan=new Scanner(System.in);

	System.out.print ("Baca N, print 1 s/d N ");
	System.out.print ("N = ");
	N=masukan.nextInt();
	for (i = 1; i <= N; i++){
	System.out.println (i); };
	System.out.println ("Akhir program \n");
	}
}