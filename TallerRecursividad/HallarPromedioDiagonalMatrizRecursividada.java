/**
 * 
 */
package TallerRecursividad;

/**
 * @author GonzalezHDanielaA
 *
 */
public class HallarPromedioDiagonalMatrizRecursividada {

public static void main(String[] args) {
		
		double matriz[][] = {
				{8,3,1},
				{3,11,6},
				{2,6,9}};
		
		double promedio = hallarPromedioDiagonalRecursividad(matriz, 0, 0);
		System.out.println("Promedio de la diagonal principal es: "+promedio);

	}
	
	
	public static double hallarPromedioDiagonalRecursividad(double matriz[][],int i, int j)
	{
		
		if(i<matriz.length)
		{
			if(j<matriz.length)
			{
				if(i==j)
				{
					return (matriz[i][j]/ matriz.length + hallarPromedioDiagonalRecursividad(matriz, i, j+1));
				}
				else
				{
					return hallarPromedioDiagonalRecursividad(matriz, i, j+1);
				}
			}
			else
			{
				return hallarPromedioDiagonalRecursividad(matriz, i+1, j-matriz.length);
			}
		}
		return 0;
	}
	
	
}
