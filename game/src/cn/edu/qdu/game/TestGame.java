package cn.edu.qdu.game;

public class TestGame {
	public static void main(String[] args)
	{
//		java中类调用的方法只有俩种。
//		实例化对象，用该对象调用该类中的方法。
//		直接用类名.方法进行调用。 （被static修饰过的静态方法
		Judge judge = new Judge();
		Person person = new Person();
		Computer computer = new Computer();
		judge.startGame();
		judge.askName(person,computer);
		judge.playGame(person,computer);
		judge.finalResult(person,computer);
	}
}
