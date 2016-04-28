package cn.edu.qdu.game;

public class Computer extends Player
{
	public void inputName(String nameNum)
	{
		if(nameNum.equals("1"))
			setPName("刘备");//用get和set
		else if(nameNum.equals("2"))
			setPName("孙权");
		else if(nameNum.equals("3"))
			setPName("曹操");
		else
			setPName(nameNum);
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
