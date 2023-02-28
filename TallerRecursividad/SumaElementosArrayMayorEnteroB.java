/**
 * 
 */
package TallerRecursividad;

/**
 * @author GonzalezHDanielaA
 *
 */
public class SumaElementosArrayMayorEnteroB {
	
	public static void main(String [] agrs)
	{
		
		int array[] = {3,5,8,2,9} ;
		int entero = 4;
		int suma = sumar(array, 0, entero, 0);
		System.out.println("La suma de los elementos mayores que " +entero+ " es "+suma);	
	}
	
	
	public static int sumar(int array[], int indice, int enteroB,int suma)
	{	
		if(indice <= array.length-1)
		{
			if(array[indice]>enteroB)
			{
				suma += array[indice];	
			}
			return sumar(array, indice+1, enteroB, suma);
		}		
		return suma;	
	}
	
	
	

}
