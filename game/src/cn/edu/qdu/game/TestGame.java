package cn.edu.qdu.game;

public class TestGame {
	public static void main(String[] args)
	{
//		java������õķ���ֻ�����֡�
//		ʵ���������øö�����ø����еķ�����
//		ֱ��������.�������е��á� ����static���ι��ľ�̬����
		Judge judge = new Judge();
		Person person = new Person();
		Computer computer = new Computer();
		judge.startGame();
		judge.askName(person,computer);
		judge.playGame(person,computer);
		judge.finalResult(person,computer);
	}
}
