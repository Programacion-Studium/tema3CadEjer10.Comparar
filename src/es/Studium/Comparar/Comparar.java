package es.Studium.Comparar;

import java.util.Scanner;
public class Comparar 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String palabra1, palabra2;

		System.out.println("indique la primera palabra");
		palabra1=teclado.nextLine();
		System.out.println("indique la segunda palabra");
		palabra2=teclado.nextLine();
		
		if(palabra1.compareTo(palabra2)>0)
		{
			System.out.println("la palabra 1 es alfabeticamente mayor a la palabra 2");
		}
		else
		{
			if(palabra1.compareTo(palabra2)<0)
			{
				System.out.println("la palabra 1 es alfabeticamente menor a la palabra 2");
			}
			else
			{
				System.out.println("la palabra 1 es alfabeticamente igual a la palabra 2");
			}
		}
		teclado.close();
	}

}
