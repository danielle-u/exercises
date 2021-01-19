package exercises;

import java.util.Scanner;

/*
* Author : dani
*Date: Jan. 15, 2021
*/
public class fivecities
	{

		public static void main(String[] args)
		{
				Scanner sc=new Scanner(System.in);
				
				int [] cities = new int [5];
				for (int i = 0; i < cities.length; i++)
				{
					if(i==0)
					{
						cities[i] = 0;
					}
					else
					{
						cities[i] = sc.nextInt();
					}
				}
				for(int i = 0; i < cities.length; i++)
				{
					if(i == 0)
					{
						cities[i] = 0;
					}
					else
					{
						cities[i] = cities[i-1];
					}
				}
				for(int i = 0; i < 5; i++)
				{
					System.out.println(Math.abs(cities [1] - cities[0]) + "");
					System.out.println(Math.abs(cities [1] - cities[1]) + "");
					System.out.println(Math.abs(cities [1] - cities[2]) + "");
					System.out.println(Math.abs(cities [1] - cities[4]) + "");
					System.out.println(Math.abs(cities [1] - cities[5]) + "");
				}
				
				sc.close();

			}

	}
