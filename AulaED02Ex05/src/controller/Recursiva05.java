package controller;
//Fazer uma função recursiva que receba 2 números inteiros posi�vos e apresente o MDC desses números
public class Recursiva05 
{
	public Recursiva05() 
	{
		super();
		
	}
	
	public int mdc (int x,int y)
	{
		if(x==y)
		{
			return x;
		}
		else if(x>y)
		{
			
		return mdc(x-y,y);
		}
		else
		{
			int aux=x;
			return mdc(x=y,y=aux);
		}
	
	
	}
		
}
	

