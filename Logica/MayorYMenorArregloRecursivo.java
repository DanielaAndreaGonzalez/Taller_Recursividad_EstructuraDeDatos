/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class MayorYMenorArregloRecursivo {
	
	
	public static void main(String args[])
	{
		
		int array[] = {5,8,2,3,15,7};
		int mayor = encontrarMayorRecursivo(array, 0, 0);
		int menor = encontrarMenorRecursivo(array, 0, 9999);
		mostrarArrayIngresado(array, 0);
		System.out.println();
		System.out.println("Número mayor del arreglo es "+mayor);
		System.out.println("Número menor del arreglo es: "+menor);
		
	}
	
	//4. Encontrar mayor en un arreglo
	 public static int encontrarMayorRecursivo(int array[],int indice, int mayor)
	 {
			if(indice <= array.length-1)
			{
				if(array[indice] > mayor)
				{
					mayor = array[indice];
					
				}	
				return encontrarMayorRecursivo(array, indice+1, mayor);
			}
			return mayor;
		}
		 
	 //5.0 Encontrar menor en un arreglo
		public static  int encontrarMenorRecursivo(int array[], int indice, int menor)
		{
			
			if(indice <= array.length-1)
			{
				if(array[indice] < menor)
				{
					menor = array[indice];
					
				}	
				return encontrarMenorRecursivo(array, indice+1, menor);
			}
			return menor;
		}
	
		public static  void mostrarArrayIngresado(int [] array,int indice)
		{
			if(indice <= array.length-1)
			{
				System.out.print(" "+array[indice] + " ");
				mostrarArrayIngresado(array,indice+1);
			}		
		}

}
