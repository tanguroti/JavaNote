/**
	继承的基本概念
	非私有的：public,default,protected
	访问修饰符：public(公有) private（私有的） default（默认的） protected(保护型)
	注意：构造方法不能被继承

	子类的实例化过程:
	子类实例化时会先调用父类的构造方法
	如果父类中没有默认的构造方法，在子类的构造方法中必须显示的调用父类的构造方法

*/
public class ExtendsDemo{
	public static void main(String[] args){
		HomeChicken hc = new HomeChicken();
		hc.desc();

		System.out.println("------------------");
		Pheasant p = new Pheasant("小白");
		p.desc();


	}
}
//父类(超类，基类)
class Chicken{
	protected String name;
	public Chicken(String name){
		System.out.println("Chicken:"+name);
	}
	public void desc(){
		System.out.println("我是一只鸡");
	}
}
//子类（家鸡）
class HomeChicken extends Chicken{
	public HomeChicken(){
		super("小白");//super 表示父类的引用,调用父类构造方法语句必须是第一句
		System.out.println("HomeChicken");
		//super();
	}
}

//子类（野鸡）
class Pheasant extends Chicken{
	public Pheasant(String name){
		super(name);
		this.name = name;
		System.out.println("Pheasant");
	}
}