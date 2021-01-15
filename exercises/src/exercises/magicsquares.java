package exercises;

import java.util.Scanner;

/*
* Author : dani
*Date: Jan. 15, 2021
*/
public class magicsquares
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				
				int a = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
				int b = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
				int c = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
				int d = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
				
				boolean somme = (a==b);
				boolean somme2 = (c==d);
				
				if(somme == somme2)
					System.out.println(" magic");
				else
					System.out.println(" not magic");
				
			
				
				sc.close();

			}

	}
