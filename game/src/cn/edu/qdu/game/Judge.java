package cn.edu.qdu.game;

import java.util.Scanner;

public class Judge {
	private int total = 0;
	Person person;//���Ϊʲô����new��ʼ�����������ÿ����������ܱ�TestGame�е����������ã������������޷��ҵ�Person��Computer��
	//����Ǿ�̬������ֱ�� ����.���������ɣ�����ǷǾ�̬����������newһ�����������Ȼ���ö���.����������
	//���person�͵��µ�person��һ�����𣿲�����������������
	Computer computer;
	Scanner input = new Scanner(System.in);
	public void startGame()
	{
		System.out.println("***********************");
		System.out.println("  ****  ��ȭ�� ��ʼ     ****  ");
		System.out.println("***********************");
		System.out.println("��ȭ����:1.���� 2.ʯͷ 3.��");
	}
	public void askName(Person person,Computer computer)
	{
		System.out.print("��ѡ��Է���ɫ��1������ 2�� ��Ȩ 3�� �ܲ٣���");
		String nameNum = input.next();
		computer.inputName(nameNum);
		System.out.print("���������������");
		String personName = input.next();
		person.inputName(personName);
		System.out.println(person.getPName() + " vs "+ computer.getPName() + " ��ս");
		//ѯ�ʿ�ʼ
		String choise = "y";
		while(choise!="y" && choise!="n")//���ѡ���ľ�һֱ�ظ�
		{
			System.out.print("Ҫ��ʼ�� ��y/n��");	
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
				System.out.print("���ȭ��1.���� 2.ʯͷ 3.����������Ӧ���֣���");
				String personChoise = person.myFist();
				System.out.println("���ȭ��" + personChoise);
				String computerChoise = computer.myFist();
				System.out.println(computer.getPName() + "��ȭ��" + computerChoise);
				if((personChoise=="����"&&computerChoise=="ʯͷ")||(personChoise=="ʯͷ"&&computerChoise=="��")||(personChoise=="��"&&computerChoise=="����"))
				{
					System.out.println("^_^�����ˣ��汿��");
					computer.setWTimes();
				}
				else if(personChoise==computerChoise)
					System.out.println("O.Oһ��������");
				else if(personChoise == "error")
				{
					System.out.println("Υ����Ϸ���򣬽�����");
					return;
				}
				else
				{
					System.out.println("^-^�������������Ӯ����");	
					person.setWTimes();
				}
				total++;
				System.out.println("�Ƿ�ʼ��һ�֣�y/n����");
				choise = input.next();
				if( !choise.equals("y"))
					return;	
				else;
		}	
	}
	public void finalResult(Person person,Computer computer)
	{
		System.out.println("����������������������������������������������������������������������������������������������������");
		System.out.println(computer.getPName() + "vc" +person.getPName());
		System.out.println("��ս������" + this.total);
		System.out.println("\n����\t\t�÷�");
		System.out.println(person.getPName() + "\t\t" + person.getWTimes());
		System.out.println(computer.getPName() + "\t\t" + computer.getWTimes());
		if(person.getWTimes() > computer.getWTimes())
			System.out.println("\n�����������´μ���Ŭ��Ŷ");
		else if(person.getWTimes() == computer.getWTimes())
			System.out.println("\n�������β������£��´���ս��");
		else
			System.out.println("\n�Ǻǣ��������´μ��Ͱ���");
		System.out.println("����������������������������������������������������������������������������������������������������");
	}
//	public static void main(String[] args)
//	{
////		java������õķ���ֻ�����֡�
////		ʵ���������øö�����ø����еķ�����
////		ֱ��������.�������е��á� ����static���ι��ľ�̬����
//		Judge judge = new Judge();
//		judge.startGame();
//		judge.askName();
//		judge.playGame();
//		judge.finalResult();
//	}
}