package Clase4;

import java.util.Scanner;

public class class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leer = new Scanner(System.in);
	
	int A [] = new int [5];
	int i;

	int valorU; //lo que ingresa el usuario
	for (int n=0;n<A.length;n++) {
		System.out.print("Ingrese valor a guardar: ");
		boolean repeat=true;
		valorU=leer.nextInt();
		for (i=0;i<A.length;i++) {
			if (valorU==A[i]) {
				repeat=false;
			}
		}
	
		if (repeat==false) {
			System.out.println("Numero ya ingresado. Ingrese otro");
			n=n-1;
		}
	
		A[n]=valorU;
	}
		int n=0;
		while(n<A.length) {
		System.out.println(A[n]);
		n++;
		}
		int B [] = new int [5];
	
		System.out.println("Vector que no almacena multiplos de 7");
		for (i=0;i<=4;i++) {
			if (A[i]%7!=0) {
				B[i]=A[i];
			}
			
		}
		for (i=0;i<4;i++) {
				System.out.println("Indice del vector: "+i+" Valor ingresado: "+B[i]);
		}
		int guardar=0;
		for (n=0;n<=4;n++) {
			for (i=0;i<=3;i++) {
				if (A[i]>A[i+1]) {
					guardar = A[i];
					A[i]=A[i+1];
					A[i+1]=guardar;
				}
			}
		}
		int f =0;
		System.out.println("Numeros del vector ordenados de menor a mayor: ");
		while(f<=4) {
			System.out.println(A[f]);
			f++;
		}
	}

}
	



