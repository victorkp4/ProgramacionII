package repaso;

import java.util.Scanner;

public class Act5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int valor1, valor2, multiplo;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("ingrese un numero");
			valor1 = input.nextInt();
		System.out.println("ingrese otro numero");
			valor2 = input.nextInt();
		System.out.println("ingresar el multiplo");
			multiplo = input.nextInt();	
		
	if (valor2 > valor1) {
		System.out.println("los numero enteros entre "+ valor1 + " y "+ valor2 + " son.");
		
			for (int i = valor1; i <= valor2 ; i++) {

					if (i%multiplo==0) {					
					}else {
						System.out.println(i);
					}				
				
			}			
				}else {
					for (int i = valor2; i <= valor1 ; i++) {
							if (i%multiplo==0) {					
							}else {
								System.out.println(i);
							}
					}
		}
	}

}
