/**
	多态性
*/
public class PolymorphismDemo{
	public static void main(String[] args){
		//八种基本类型
		//自定义类型

		//父类就是大，子类就是小
		Person man = new Man();//父类的引用指向子类对象
		man.say();
		Person women = new Women();
		women.say();

		//强制转换
		Man m = (Man)man;
		m.say();
	
		//java.lang.ClassCastException 类型转换异常
		Man m1 = (Man)women;
		



	}
}

abstract class Person{
	private String name;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public abstract void say();//抽象方法
}

class Man extends Person{
	public void say(){
		System.out.println("人家是纯爷们！");
	}
}
class Women extends Person{
	public void say(){
		System.out.println("你今天要是再不交租，我就烧了你的铺子！");
	}
}

/*运行结果
人家是纯爷们！
你今天要是再不交租，我就烧了你的铺子！
人家是纯爷们！
Exception in thread "main" java.lang.ClassCastException: Women cannot be cast to Man
        at PolymorphismDemo.main(PolymorphismDemo.java:20)
*/