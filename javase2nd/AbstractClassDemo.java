/**
	抽象类
*/
public class AbstractClassDemo{
	public static void main(String[] args){
		Goddess g = new Goddess();
		g.setName("桐桐");
		g.say();
		System.out.println("---------------------");
		UglyWomen u = new UglyWomen();
		u.setName("小白");
		u.say();

		//Women w = new Women();
	}
}

//女人
//abstract表示声明一个类为抽象类
abstract class Women{
	public Women(){
		System.out.println("women构造方法");
	}

	private String name;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public abstract void say();//抽象方法(只有声明，没有实现)
	public abstract void method();
}

class Goddess extends Women{
	//实现父类的抽象方法
	public void say(){
		System.out.println("偶是女神，我是"+getName());
	}
	public void method(){
	}
}

class UglyWomen extends Women{
	//实现父类的抽象方法
	public void say(){
		System.out.println("我虽丑，但我丑女无敌，我是"+getName());
	}
	public void method(){
	}
}
