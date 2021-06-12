/**
	�ӿ�Ӧ��
*/
public class InterfaceAppDemo{
	public static void main(String[] args){
		Person p = new Person("С��");
		System.out.println("-----�Թ�ǰ-----");
		p.setIsay(new BeforeGong());
		p.say();
		System.out.println("-----�Թ���-----");
		p.setIsay(new AfterGong());
		p.say();
	}
}


//��˵������Ϊ�����һ���ӿ�
interface Isay{
	public void say();
}
class BeforeGong implements Isay{
	public void say(){
		System.out.println("�˼��Ǵ�ү��!");
	}
}

class AfterGong implements Isay{
	public void say(){
		System.out.println("�˼������ǹ�Ů��!");
	}
}



class Person{
	private String name;
	
	//�ѿɱ仯����Ϊ�������������ɽӿڣ����ṩ��ͬ��ʵ��

	private Isay isay;//�ѽӿ���Ϊ���е�һ������(���)

	public void setIsay(Isay isay){
		this.isay = isay;
	}

	public Person(String name){
		this.name = name;
	}

	//���������ʵ���Ǳ仯��
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
		System.out.println("�˼��Ǵ�ү��!");
	}
}

class AfterGongPerson extends Person{
	public person(String name){
		super(name);
	}
	public void say(){
		System.out.println("�˼������ǹ�Ů��!");
	}
}
*/