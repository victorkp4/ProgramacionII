package repaso;

import java.util.Scanner;

public class Act7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user;
		String pass;
		
		Scanner input = new Scanner (System.in);
		System.out.println("por faver ingrese el usuario");
			user = input.next();
		System.out.println("porfavor ingrese la contraseņa");
			pass = input.next();
			
		String usuario = "enzo";
		String contraseņa = "4321";
		
		if (user.equals(usuario)) {
			if (pass.equals(contraseņa)) {
				System.out.println("bienvendio al sistema");
			}else {
				System.out.println("la contraseņa ingresada no es valida");
			}
		}else {
			System.out.println("el usuario ingresado no es valido");
		}

	}

}
