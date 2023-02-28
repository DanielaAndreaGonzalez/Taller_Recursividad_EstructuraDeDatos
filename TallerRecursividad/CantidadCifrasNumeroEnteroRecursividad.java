/**
 * 
 */
package TallerRecursividad;

/**
 * @author GonzalezHDanielaA
 *
 */
public class CantidadCifrasNumeroEnteroRecursividad {

public static void main(String[] args) {
		
		int numero = 9789352;
		int cifras = 0;
		cifras = cantidadCifras(numero);
		System.out.println("Cantidad de cifras "+cifras);
	}
	
	public static int cantidadCifras(int numero)
	{
		if(numero <10)
		{
			return 1;
		}else {
			return cantidadCifras(numero/10) + 1;
		}
		
		
		
		
		
	}

	
	
}
