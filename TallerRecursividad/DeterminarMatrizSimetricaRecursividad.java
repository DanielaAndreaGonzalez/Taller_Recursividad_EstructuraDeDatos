/**
 * 
 */
package TallerRecursividad;

/**
 * @author GonzalezHDanielaA
 *
 */
public class DeterminarMatrizSimetricaRecursividad {
	
	
	public static void main(String [] args)
	{
		
		
		int matrizNoSimetrica[][] = {
						 {1,2,3},
						 {4,5,6},
						 {7,8,9},
						 {10,11,12}};
		int i=0,j=0;
		int matrizSimetrica [][]= {
								   {1,1,1},
								   {1,1,1},
								   {1,1,1}};
					
		System.out.println("La matriz es simétrica  :"+esMatrizSimetrica(matrizNoSimetrica, i, j));
		System.out.println("La matriz es simétrica  :"+esMatrizSimetrica(matrizSimetrica, i, j));
		
	}
	
	
	public static boolean esMatrizSimetrica(int[][] matriz, int i, int j)
	{
		if(matriz.length == matriz[0].length)
		{
			boolean resultado = matriz[i][j] == matriz[j][i];
			if(resultado)
			{
				j += 1;
				if(j == matriz[0].length)
				{
					j = 0;
					i += 1;
				}

				if(i < matriz.length)
				{
					return esMatrizSimetrica(matriz, i, j);
				}
			}
			return resultado;
		}
		return false;
	}

}
