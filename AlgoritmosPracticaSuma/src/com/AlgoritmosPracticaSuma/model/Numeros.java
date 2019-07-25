package com.AlgoritmosPracticaSuma.model;


	public class Numeros 
	{
		private double numero1;
		private double numero2;
		private double suma;
		
		public Numeros() 
		{
			
		}
		
		public Numeros (double numero1parametro, double numero2parametro, double sumaparametro)
		{
			numero1=numero1parametro;
			numero2=numero2parametro;
			suma=sumaparametro;
		}
		
		public double getNumero1()
		{
			return numero1;
		}
		
		public void setNumero1(double numero1)
		{
			this.numero1=numero1;	
		}
		
		public double getNumero2()
		{
			return numero2;
		}
		
		public void setNumero2(double numero2)
		{
			this.numero2=numero2;
		}
		
		public double getSuma() 
		{
			return suma;
		}
		
		public void setSuma(double suma)
		{
			this.suma=suma;
		}
	

}
