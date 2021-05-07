package repaso;

import java.util.Scanner;

public class Act8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user;
		String pass;
		
		Scanner input = new Scanner (System.in);
		System.out.println("por faver ingrese el usuario");
			user = input.next();
		System.out.println("porfavor ingrese la contraseña");
			pass = input.next();
			
		String usuario = "enzo";
		String contraseña = "4321";
		
		if (user.equals(usuario)) {
			if (pass.equals(contraseña)) {
				System.out.println("bienvendio al sistema");
				
				System.out.println("ingrese la nueva ccontraseña");
				contraseña = input.next();
				System.out.println("la contraseña contraseña se ha cambiado correctamente");
				
				
			}else {
				System.out.println("la contraseña ingresada no es valida");
			}
		}else {
			System.out.println("el usuario ingresado no es valido");
		}

	}

}
