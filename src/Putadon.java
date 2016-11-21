import java.util.Scanner;

/*
 * CSI Florida
 * Reto Putadon
 * 
 * El siguiente código busca una letra dentro de una frase
 * y devuelve dónde se ha encontrado y ctas veces
 * 
 * Hay dos errores
 * 
 */
public class Putadon {
	
	public static void main(String[] args) {
		//Variables inicialización
		String frase="";
		int numPos=0;
		int numRepeticiones=0;
		char letra=0;
		
		//Pedimos datos
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce tu frase");
		frase = sc.nextLine();
		
		System.out.println("Introduce la letra a buscar");
		letra = sc.nextLine().charAt(0); //charAt(0) devuelve la primera letra
		
		//Buscamos las letras
		for(int i=0;i<frase.length();i++){
			if(letra==frase.charAt(i)){
				numRepeticiones++;
				System.out.println("Letra "+letra+" encontrada en la posicion "+i);
			}
		}
		System.out.println("Total repeticiones "+numRepeticiones);
	
	}
}
