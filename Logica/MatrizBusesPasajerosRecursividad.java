/**
 * 
 */
package Logica;

import javax.swing.JOptionPane;

/**
 * @author GonzalezHDanielaA
 *
 */
public class MatrizBusesPasajerosRecursividad {
	
	
	static int mayorBus0=0,mayorBus1=0,mayorBus2=0,mayorBus3=0,mayorBus4=0;
	static int codigo0=0,codigo1=0,codigo2=0,codigo3=0,codigo4=0;
	static int dia0 =0,dia1=0,dia2=0,dia3=0,dia4=0;
	static int menorBus0=9999,menorBus1=9999,menorBus2=9999,menorBus3=9999,menorBus4=9999;
	static int diaMenor0=0,diaMenor1=0,diaMenor2=0,diaMenor3=0,diaMenor4=0;
	static String diaEscrito0="",diaEscrito1="",diaEscrito2="",diaEscrito3="",diaEscrito4="";
	static String diaEscritoMenor0="",diaEscritoMenor1="",diaEscritoMenor2="",diaEscritoMenor3="",diaEscritoMenor4="";
	static String cadena1= " ", cadena2 = " ";
	static int matrizPasajeros2 [][] = new int[6][5];
	
	public static void main(String args[])
	{	
		int i=1;
		int j=0;
		int pasajeros[][] = {
							{78, 96,  4, 54, 123},
							{432,321,123,212,134},
							{231,450,89,159,310},
							{234,159,100,390,412},
							{122,430,120,312,223},
							{268,250,135,290,315}};
		
		recorrerMatriz(pasajeros, 0, 0);
		ObtenerMayorMatriz(pasajeros, i, j);
		ObtenerMenorMatriz(pasajeros, i, j);
		llenarVariables();
		llenarCadenas();
		
	//	llenarDatosMatrizRecursivamente(matrizPasajeros2, 0, j);
		//recorrerMatriz(matrizPasajeros2, 0, j);
		
		System.out.println("\n");
		System.out.println(cadena1);
		System.out.println(cadena2);
	}
	
	//Imprimir matriz recursiva
	public static void recorrerMatriz(int[][] matriz, int i, int j) {
		System.out.print(matriz[i][j] + " ");
	
		if (i != matriz.length - 1 || j != matriz[i].length - 1) {
			if (j == matriz[i].length - 1) {
				
				if(i==0)
					System.out.print("   Código ");
				if(i==1)
					System.out.print("  Lunes ");
				if(i==2)
					System.out.print("  Martes ");
				if(i==3)
					System.out.print("  Miercoles ");
				if(i==4) 
					System.out.print("  Jueves ");
				
				i++;
				j = 0;
				System.out.println(" ");
			} else {
				
				j++;
			}
			recorrerMatriz(matriz, i, j);
		}
	}
	
	//Calcular Mayor matriz recursividad
	public static void ObtenerMayorMatriz(int[][] pasajeros, int i, int j)
	{	
		if(i <= pasajeros.length-1)
		{
			if(pasajeros[i][0] > mayorBus0 ) {
				mayorBus0 = pasajeros[i][0];
				dia0 = i;
				codigo0 = pasajeros[0][0];	
			}
			
			if(pasajeros[i][1] > mayorBus1)
			{
				mayorBus1 = pasajeros[i][1];
				dia1= i;
				codigo1 = pasajeros[0][1];
				
			}
			if(pasajeros[i][2] >mayorBus2)
			{
				mayorBus2 = pasajeros[i][2];
				dia2 = i;
				codigo2 = pasajeros[0][2];
			}
			
			if(pasajeros[i][3] > mayorBus3)
			{
				mayorBus3 = pasajeros[i][3];
				dia3 = i;
				codigo3 = pasajeros[0][3];
			}
			
			if(pasajeros[i][4] > mayorBus4)
			{
				mayorBus4 = pasajeros[i][4];
				dia4 = i;
				codigo4 = pasajeros[0][4];
			}
			ObtenerMayorMatriz(pasajeros, i+1, j);	
	  }	
}
	
	//Calcular menor recursividad
		public static void ObtenerMenorMatriz(int[][] pasajeros, int i, int j)
		{	
			if(i <= pasajeros.length-1)
			{
				if(pasajeros[i][0] < menorBus0)
				{
					menorBus0 =  pasajeros[i][0];
					diaMenor0 = i;
					codigo0 = pasajeros[0][0];
				}
				
				if(pasajeros[i][1] < menorBus1)
				{
					menorBus1 = pasajeros[i][1];
					diaMenor1= i;
					codigo1 = pasajeros[0][1];
				}
				
				if(pasajeros[i][2] < menorBus2)
				{
					menorBus2 = pasajeros[i][2];
					diaMenor2 = i;
					codigo2 = pasajeros[0][2];
				}
				if(pasajeros[i][3] < menorBus3)
				{
					menorBus3 = pasajeros[i][3];
					diaMenor3 = i;
					codigo3 = pasajeros[0][3];
				}
				if(pasajeros[i][4] < menorBus4)
				{
					menorBus4 = pasajeros[i][4];
					diaMenor4 = i;
					codigo4 = pasajeros[0][4];
				}
				ObtenerMenorMatriz(pasajeros, i+1, j);	
		  }	
	}

	//Metodo para obtener el día 	
	public static String sacarDia(int entero)
		{
			
			String dia = " ";
			switch(entero)
			{
			case 1:	
				dia= "Lunes";
				break;
			case 2:
				dia="Martes";
				break;
			case 3:
				dia="Miercoles";
				break;
			case 4:
				dia="Jueves";
				break;
			case 5:
				dia="Viernes";
				break;
			default:
				System.out.println("opcion invalida");	
			}
			return dia;
		}	

	//Metodo para llenar las variabkes y sacar los días 
	public static void llenarVariables()
		{
			diaEscrito0 = sacarDia(dia0);
			diaEscrito1=sacarDia(dia1);
			diaEscrito2= sacarDia(dia2);
			diaEscrito3 = sacarDia(dia3);
			diaEscrito4 = sacarDia(dia4);
			
			diaEscritoMenor0 = sacarDia(diaMenor0);
			diaEscritoMenor1 = sacarDia(diaMenor1);
			diaEscritoMenor2 = sacarDia(diaMenor2);
			diaEscritoMenor3 = sacarDia(diaMenor3);
			diaEscritoMenor4 = sacarDia(diaMenor4);
		}
	
	//Concatenar las cadenas para posterior imprimirlas
	public static void llenarCadenas()
	{
		cadena1 += "El dia que más pasajeros llevó el bus 1 - Código:"+codigo0+" fue el día "+diaEscrito0+" con "+mayorBus0+ " pasajeros" + "\n";
		cadena1 += "El dia que más pasajeros llevó el bus 2 - Código: " +codigo1 +" fue el día "+diaEscrito2+" con "+mayorBus1+ " pasajeros" + "\n";
		cadena1 += "El dia que más pasajeros llevó el bus 3 - Código: " +codigo2 +" fue el día "+diaEscrito3+" con "+mayorBus2+ " pasajeros"+ "\n";
		cadena1 += "El dia que más pasajeros llevó el bus 4 - Código: "+codigo3 + " fue el día "+diaEscrito4+ " con "+mayorBus3 + " pasajeros "+ "\n";
		cadena1 += "El dia que más pasajeros llevó el bus 5 - Código: "+codigo4 + " fue el día "+diaEscrito4+ " con "+mayorBus4 + " pasajeros "+ "\n";
		
		cadena2 += "El dia que menos pasajeros llevó el bus 1 - Código: "+codigo0 + " fue el día "+diaEscritoMenor0+ " con "+menorBus0 + " pasajeros "+ "\n";
		cadena2 += "El dia que menos pasajeros llevó el bus 2 - Código: "+codigo1 + " fue el día "+diaEscritoMenor1+ " con "+menorBus1 + " pasajeros "+ "\n";
		cadena2 += "El dia que menos pasajeros llevó el bus 3 - Código: "+codigo2 + " fue el día "+diaEscritoMenor2+ " con "+menorBus2 + " pasajeros "+ "\n";
		cadena2 += "El dia que menos pasajeros llevó el bus 4 - Código: "+codigo3 + " fue el día "+diaEscritoMenor3+ " con "+menorBus3 + " pasajeros "+ "\n";
		cadena2 += "El dia que menos pasajeros llevó el bus 5 - Código: "+codigo4 + " fue el día "+diaEscritoMenor4+ " con "+menorBus4 + " pasajeros "+ "\n";
		
	}

	//Llenar datos de manera dinamica matriz recursivamente
	public static void llenarDatosMatrizRecursivamente(int matrizPasajeros2[][],int i, int j)
	{
		if(i != matrizPasajeros2.length - 1 || j != matrizPasajeros2[i].length - 1)
		{
			if(i==0)
			{
				matrizPasajeros2[0][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del bus 0"));
			}
			
			if(i==1)
			{
				matrizPasajeros2[1][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  número de pasajeros para el día lunes del bus "+j));
			}
			
			if(i==2)
			{
				matrizPasajeros2[2][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  número de pasajeros para el día martes del bus "+j));
			}
			if(i==3)
			{
				matrizPasajeros2[3][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  número de pasajeros para el día miércoles del bus "+j));
			}
			if(i==4)
			{
				matrizPasajeros2[4][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  número de pasajeros para el día jueves del bus "+j));
			}
			if(i==5)
			{
				matrizPasajeros2[5][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  número de pasajeros para el día viernes del bus "+j));
			}	
			if(j == matrizPasajeros2[i].length-1)
			{	
				i++;
				j = 0;
				System.out.println(" ");
			}
			else
			{	
				j++;
			}	
			llenarDatosMatrizRecursivamente(matrizPasajeros2, i, j);
		}	
	}

}
