/**
	instanceof�ؼ���
*/
public class InstanceofKeyWordDemo{
	public static void main(String[] args){
		
		Person man = new Man();
		say(man);
		Person w = new Women();
		say(w);

	}
	/*
	public static void say(Man m){
		m.say();
	}
	public static void say(Women w){
		w.say();
	}*/

	public static void say(Person p){
		p.say();
		//�ж�p�����Ƿ�ΪWomen��ʵ��
		if(p instanceof Women){
			Women w = (Women)p;
			w.getangry();
		}
		
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
	public abstract void say();//���󷽷�
}

class Man extends Person{
	public void say(){
		System.out.println("�˼��Ǵ�ү�ǣ�");
	}
}
class Women extends Person{
	public void say(){
		System.out.println("�����Ҫ���ٲ����⣬�Ҿ�����������ӣ�");
	}
	//�����н�����չ�ķ���
	public void getangry(){
		System.out.println("���ᣬ�˼�����������");
	}
}