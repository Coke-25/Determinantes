package es.studium.Determinantes;

import java.util.Scanner;

public class Determinantes 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		int matriz[][] = new int [3][3];
		int i,j;
		for (i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Introduce el valor de "+(i+1)+" - "+(j+1));
				matriz[i][j]=teclado.nextInt();
			}
		}
		
		int determinante = ((matriz[0][0]*matriz[1][1]*matriz[2][2])+(matriz[0][1]*matriz[1][2]*matriz[2][0])+(matriz[1][0]*matriz[2][1]*matriz[0][2]))-((matriz[0][2]*matriz[1][1]*matriz[2][0])+(matriz[1][0]*matriz[0][1]*matriz[2][2])+(matriz[1][2]*matriz[2][1]*matriz[0][0]));
		System.out.println("La determinante de la matriz es "+determinante);
		teclado.close();
	}

}
