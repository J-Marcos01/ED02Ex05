package view;
import controller.Recursiva05;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args)
	{
		Recursiva05 funcao=new Recursiva05();
		Scanner sc=new Scanner (System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int res=funcao.mdc(x, y);
		System.out.println(res);
		
		

	}

}
