package cn.edu.qdu.game;

public class Computer extends Player
{
	public void inputName(String nameNum)
	{
		if(nameNum.equals("1"))
			setPName("����");//��get��set
		else if(nameNum.equals("2"))
			setPName("��Ȩ");
		else if(nameNum.equals("3"))
			setPName("�ܲ�");
		else
			setPName(nameNum);
	}
	public String myFist()
	{
		int choise = (int)(Math.random()*3+1);
		if(choise == 1)
			return "����";
		else if(choise == 2)
			return "ʯͷ";
		else
			return "��";
	}
}
