/**
 * 
 */
package TallerRecursividad;

/**
 * @author GonzalezHDanielaA
 *
 */
public class DeterminarSiPalabraEsPalindromaRecursividad {

public static void main(String[] args) {
		
		//ana, otto, oso
		String cadena = "otto";
		
		boolean esPalin = esPalindroma(cadena, 0 ,cadena.length()-1);
		
		
		String respuesta = (esPalin)?"Es palindroma":"No es Palindroma";
		System.out.println(respuesta);
	}
	
	public static boolean esPalindroma(String cadena,int i, int j)
	{
		if(cadena.charAt(i) != cadena.charAt(j))
		{
			return false;
		}
		if(i==j)
		{
			return true;
		}
		if(j== i+1 && cadena.charAt(i) == cadena.charAt(j))
		{
			return true;
		}
		else {
			return esPalindroma(cadena, i+1, j-1);
		}
	}

}
