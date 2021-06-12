/**
	接口应用
*/
public class InterfaceAppDemo{
	public static void main(String[] args){
		Person p = new Person("小白");
		System.out.println("-----自宫前-----");
		p.setIsay(new BeforeGong());
		p.say();
		System.out.println("-----自宫后-----");
		p.setIsay(new AfterGong());
		p.say();
	}
}


//把说话的行为抽象出一个接口
interface Isay{
	public void say();
}
class BeforeGong implements Isay{
	public void say(){
		System.out.println("人家是纯爷们!");
	}
}

class AfterGong implements Isay{
	public void say(){
		System.out.println("人家现在是宫女了!");
	}
}



class Person{
	private String name;
	
	//把可变化的行为抽象出来，定义成接口，并提供不同的实现

	private Isay isay;//把接口作为类中的一个属性(组合)

	public void setIsay(Isay isay){
		this.isay = isay;
	}

	public Person(String name){
		this.name = name;
	}

	//这个方法的实现是变化的
	public void say(){
		isay.say();
	}
}



/**
class BeforeGongPerson extends Person{
	public person(String name){
		super(name);
	}
	public void say(){
		System.out.println("人家是纯爷们!");
	}
}

class AfterGongPerson extends Person{
	public person(String name){
		super(name);
	}
	public void say(){
		System.out.println("人家现在是宫女了!");
	}
}
*/