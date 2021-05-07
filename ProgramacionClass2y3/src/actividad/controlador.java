package actividad;

public class controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persona miPersona = new persona("Vonku","Enzo");
		ciudadano miCiudadano = new ciudadano("Mza",500000000,"Enzo","Vonku");
		
		Vista.mostrarPersona(miPersona);
		Vista.mostrarCiudadano(miCiudadano);

	}

}
