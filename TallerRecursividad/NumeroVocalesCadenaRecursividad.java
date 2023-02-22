/**
 * 
 */
package TallerRecursividad;

/**
 * @author GonzalezHDanielaA
 *
 */
public class NumeroVocalesCadenaRecursividad {
	public static void main(String args[])
	{
		
		String cadena = "RECURSIVIDAD";
		int cantidadVocal = contarVocales(cadena, 0,0);
		System.out.println("Cantidad de vocales: "+cantidadVocal);
		
		
		
	}
	
	
	public static int contarVocales(String cadena,int indice,int cantidad)
	{
		if(indice != cadena.length()-1)
		{
			char ch = cadena.charAt(indice);
			cadena = cadena.toLowerCase();
			if(ch== 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				return contarVocales(cadena, indice+1,cantidad) + 1;
			}else {
				return contarVocales(cadena, indice+1, cantidad);
			}	
		}else {
			return 0;
		}	
	}
	
	
}
