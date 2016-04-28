package cn.edu.qdu.game;

abstract public class Player 
{	
	private String playName = "小明";//这个不能用构造函数赋值吗？
	private int winningTimes = 0;
//	public Player()//无参构造函数
//	{
//		
//	}
//	public Player(String playName)//构造函数
//	{
//		this.playName = playName;
//	}
	
	abstract public void inputName(String name);//这个和setPNname重了
	abstract public String myFist();
	public final void setPName(String name)//加final不可以被重写
	{
		this.playName = name;
	}
	public final String getPName()
	{
		return this.playName;
	}
	public final void setWTimes()
	{
		this.winningTimes++;
	}
	public final int getWTimes()
	{
		return this.winningTimes;
	}
}
