/**
	��̬��
*/
public class PolymorphismDemo{
	public static void main(String[] args){
		//���ֻ�������
		//�Զ�������

		//������Ǵ��������С
		Person man = new Man();//���������ָ���������
		man.say();
		Person women = new Women();
		women.say();

		//ǿ��ת��
		Man m = (Man)man;
		m.say();
	
		//java.lang.ClassCastException ����ת���쳣
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
}

/*���н��
�˼��Ǵ�ү�ǣ�
�����Ҫ���ٲ����⣬�Ҿ�����������ӣ�
�˼��Ǵ�ү�ǣ�
Exception in thread "main" java.lang.ClassCastException: Women cannot be cast to Man
        at PolymorphismDemo.main(PolymorphismDemo.java:20)
*/