package cn.edu.qdu.game;

import java.util.Scanner;

public class Judge {
	private int total = 0;
	Person person;//这个为什么不用new初始化？这个放在每个函数里，才能被TestGame中的主函数调用，否则主函数无法找到Person和Computer类
	//如果是静态方法，直接 类名.方法名即可，如果是非静态方法，则需new一个对象出来，然后用对象.方法名调用
	//这个person和底下的person是一样的吗？不在这里申明可以吗？
	Computer computer;
	Scanner input = new Scanner(System.in);
	public void startGame()
	{
		System.out.println("***********************");
		System.out.println("  ****  猜拳， 开始     ****  ");
		System.out.println("***********************");
		System.out.println("出拳规则:1.剪刀 2.石头 3.布");
	}
	public void askName(Person person,Computer computer)
	{
		System.out.print("请选择对方角色（1：刘备 2： 孙权 3： 曹操）：");
		String nameNum = input.next();
		computer.inputName(nameNum);
		System.out.print("请输入你的姓名：");
		String personName = input.next();
		person.inputName(personName);
		System.out.println(person.getPName() + " vs "+ computer.getPName() + " 对战");
		//询问开始
		String choise = "y";
		while(choise!="y" && choise!="n")//如果选择别的就一直重复
		{
			System.out.print("要开始吗： （y/n）");	
			choise = input.next();
			if( choise.equals("n") )
				return;	
			else;		
		}

	}
	public void playGame(Person person,Computer computer)
	{
		String choise = "y";
		while(choise.equals("y"))
		{
				System.out.print("请出拳：1.剪刀 2.石头 3.布（输入相应数字）：");
				String personChoise = person.myFist();
				System.out.println("你出拳：" + personChoise);
				String computerChoise = computer.myFist();
				System.out.println(computer.getPName() + "出拳：" + computerChoise);
				if((personChoise=="剪刀"&&computerChoise=="石头")||(personChoise=="石头"&&computerChoise=="布")||(personChoise=="布"&&computerChoise=="剪刀"))
				{
					System.out.println("^_^你输了，真笨！");
					computer.setWTimes();
				}
				else if(personChoise==computerChoise)
					System.out.println("O.O一样的啦！");
				else if(personChoise == "error")
				{
					System.out.println("违反游戏规则，结束！");
					return;
				}
				else
				{
					System.out.println("^-^宝宝真聪明，你赢啦！");	
					person.setWTimes();
				}
				total++;
				System.out.println("是否开始下一轮（y/n）：");
				choise = input.next();
				if( !choise.equals("y"))
					return;	
				else;
		}	
	}
	public void finalResult(Person person,Computer computer)
	{
		System.out.println("——————————————————————————————————————————————————");
		System.out.println(computer.getPName() + "vc" +person.getPName());
		System.out.println("对战次数：" + this.total);
		System.out.println("\n姓名\t\t得分");
		System.out.println(person.getPName() + "\t\t" + person.getWTimes());
		System.out.println(computer.getPName() + "\t\t" + computer.getWTimes());
		if(person.getWTimes() > computer.getWTimes())
			System.out.println("\n结果：真棒，下次继续努力哦");
		else if(person.getWTimes() == computer.getWTimes())
			System.out.println("\n结果：这次不分上下，下次再战！");
		else
			System.out.println("\n呵呵，笨笨，下次加油啊！");
		System.out.println("——————————————————————————————————————————————————");
	}
//	public static void main(String[] args)
//	{
////		java中类调用的方法只有俩种。
////		实例化对象，用该对象调用该类中的方法。
////		直接用类名.方法进行调用。 （被static修饰过的静态方法
//		Judge judge = new Judge();
//		judge.startGame();
//		judge.askName();
//		judge.playGame();
//		judge.finalResult();
//	}
}
