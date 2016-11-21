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
	//Variables inicialización de manera pública para que lo puedan leer todos los metodos
	public static String frase="";
	public static int numPos=0;
	public static int numRepeticiones=0;
	public static char letra=0;
	
	//Pedimos datos
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		frase=pideFrase();
		letra=pideLetra();
		buscaLetra(frase,letra);
	
	}
	
	public static String pideFrase(){
		System.out.println("Introduce tu frase");
		frase = sc.nextLine();
		return frase;
	}
	
	public static char pideLetra(){
		System.out.println("Introduce la letra a buscar");
		letra = sc.nextLine().charAt(0); //charAt(0) devuelve la primera letra
		return letra;
		
	}
	//Buscamos las letras
	public static void buscaLetra(String frase, char letra){
		for(int i=0;i<frase.length();i++){
			if(compruebaLetraPos(letra,frase,i)){
				numRepeticiones++;
				System.out.println("Letra "+letra+" encontrada en la posicion "+i);
			}
		}
		System.out.println("Total repeticiones "+numRepeticiones);
	}
	
	public static boolean compruebaLetraPos(char letra, String frase, int i){
		
		return letra==frase.charAt(i) ;
		
	}
}
