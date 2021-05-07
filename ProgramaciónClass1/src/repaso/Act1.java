package repaso;

import java.util.Scanner;

public class Act1 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, suma;
		
		Scanner input = new Scanner (System.in);
			System.out.println("ingrese un numero");
				n1 = input.nextInt();
			System.out.println("ingrese otro numero");
				n2 = input.nextInt();
				
		suma = n1 + n2;
		
			System.out.println("la suma de "+ n1 +" + "+ n2 + " es: "+suma);

	}

}
