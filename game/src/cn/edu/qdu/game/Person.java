package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player 
{
	Scanner input = new Scanner(System.in);
	public void inputName(String personName)
	{
		setPName(personName);
	}
	public String myFist()
	{
		int myFistNum = input.nextInt();
		//String myFists = "";
		if(myFistNum == 1)
			return "����";
		else if(myFistNum == 2)
			return "ʯͷ";
		else if(myFistNum == 3)
			return "��";
		else
			return "error";
	}
	//public String choise()//ѡ��Ҳ���˵Ļѽ

}