/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class MostrarArrayRecursivamente {
	
	public static void main(String args[])
	{
		int array [] = {1,2,3,4,5,6,7,8,9,10};
		mostrarArrayIngresado(array, 0);
	}
	
	// 3. Recorrer y mostrar array ingresado
		public static  void mostrarArrayIngresado(int [] array,int indice)
		{
			if(indice <= array.length-1)
			{
				System.out.println(array[indice] + " ");
				mostrarArrayIngresado(array,indice+1);
			}		
		}

}
