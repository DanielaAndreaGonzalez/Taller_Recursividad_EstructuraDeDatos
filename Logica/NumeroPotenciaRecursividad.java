/**
 * 
 */
package Logica;

import java.util.Scanner;

/**
 * @author GonzalezHDanielaA
 *
 */
public class NumeroPotenciaRecursividad {
	
	
	public static void main(String args[])
	{
		
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese la base");
		int base = dato.nextInt();
		System.out.println("Ingrese la potencia: ");
		int potencia = dato.nextInt();
		
		int resultado2 = potencia(base, potencia);
		System.out.println("Resultado 1: base "+base+" elevado a "+potencia+ " es "+resultado2);
		
		
	}
	
	//2. Elevar un número(base) a la potencia indicada
		public static int generarPotencia(int base,int potencia,int contador)
		{
			int resultado = 3;
			if(contador < potencia)
			{
				resultado  = resultado * generarPotencia(base,potencia,contador+1);;
				return resultado;
			}	
			return base;
		}
		
		
		public static int potencia(int base,int potencia)
		{
			if(potencia==0) return 0;
			else if(potencia==1) return base;
			else return base * potencia(base,potencia-1);
		}

}
