/**
 * 
 */
package TallerRecursividad;

/**
 * @author GonzalezHDanielaA
 *
 */
public class NumeroFilaMatrizSumaSeaMayor {
	
	
	public static void main(String args[])
	{
		
		int [][] matriz = {
				  {1,2,6},
				  {4,4,10},
				  {20,1,2}};
//		int resultado = retornarNumeroFilaMatriz(matriz);	
		int resultado = retornarNumeroFilaMatrizRecursividad(matriz, 0, 0, 0, 0, 0);
		System.out.println( "La fila con la suma mayor es: fila"
				+ ""+resultado);
		
		
		
	}

	public static int retornarNumeroFilaMatrizRecursividad(int [][]matriz, int i, int j, int sumaFilaActual, int sumaFilaAnt,int resultado)
	{
		sumaFilaActual = sumaFilaActual+matriz[i][j];
		
		if(i != matriz.length -1 || j != matriz.length-1)
		{
			if(j == matriz.length-1)
			{
				if(sumaFilaActual > sumaFilaAnt)
				{
					resultado=i;
					sumaFilaAnt = sumaFilaActual;
				}
				sumaFilaActual=0;
				i++;
				j=0;
			}else
			{
				j++;
			}
			return retornarNumeroFilaMatrizRecursividad(matriz, i, j, sumaFilaActual, sumaFilaAnt, resultado);
		}else {
			if(sumaFilaActual>sumaFilaAnt)
			{
				resultado = i;
				j=0;
				
			}
			return resultado;
		}	
		
	}
	
	
	
	//Retorna la fila cuya suma sea mayor de la manera tradicional
	public static int retornarNumeroFilaMatriz(int [][] matriz) {
	 int sumaFilas =0;
	 int aux=0;
	 int fila=0;
	 for(int i = 0; i<matriz.length;i++) 
	 { 
		 aux = sumaFilas;
		 sumaFilas=0;
		 for(int j =0 ; j<matriz[i].length; j++)
		 { 
			 sumaFilas += matriz[i][j];
		 } 
		 if(sumaFilas>aux)
		 {
			 fila=i;
		 }
		 System.out.println(" fila "+ "-"+i+ "- Suma "+sumaFilas);
	 }
	 return fila;	
	}
	

}
