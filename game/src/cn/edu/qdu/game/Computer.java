package cn.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player
{
	static Scanner input = new Scanner(System.in);
	public void inputName()
	{
		int nameNum = input.nextInt();
		//这可以用数组、if-else、switch
		if(nameNum == 1)
			setPName("刘备");//用get和set
		else if(nameNum == 2)
			setPName("孙权");
		else if(nameNum == 3)
			setPName("曹操");
		else
			setPName("未知");
	}
	public String myFist()
	{
		int choise = (int)(Math.random()*3+1);
		if(choise == 1)
			return "剪刀";
		else if(choise == 2)
			return "石头";
		else
			return "布";
	}
}
