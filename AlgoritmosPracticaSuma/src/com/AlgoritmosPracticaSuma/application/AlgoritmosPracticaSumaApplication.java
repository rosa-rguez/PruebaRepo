package com.AlgoritmosPracticaSuma.application;

import java.util.Scanner;


import com.AlgoritmosPracticaSuma.model.Numeros;

public class AlgoritmosPracticaSumaApplication 
{

	public static void main(String[] args) 
	{
		Numeros numero= new Numeros();
	
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Ingresa 2 numeros para sumar");
		System.out.println("Dame un numero: ");
		numero.setNumero1(entradaTeclado.nextDouble());
		
	
		System.out.println("Dame otro numero: ");
		numero.setNumero2(entradaTeclado.nextDouble());
	
		System.out.println("");
		

	}

}
