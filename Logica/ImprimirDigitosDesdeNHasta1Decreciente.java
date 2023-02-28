/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class ImprimirDigitosDesdeNHasta1Decreciente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		generarDecreciente(10);

	}
	
	
	
	//1. Imprimir digitos desde N hasta 1 (decreciente)
	

	public static void generarDecreciente(int n)
	{
			if(n >=1)
			{
				System.out.print(n + "-");
				
				generarDecreciente(n-1);
			}
			
	}
}
