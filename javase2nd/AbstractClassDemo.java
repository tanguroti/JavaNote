/**
	������
*/
public class AbstractClassDemo{
	public static void main(String[] args){
		Goddess g = new Goddess();
		g.setName("ͩͩ");
		g.say();
		System.out.println("---------------------");
		UglyWomen u = new UglyWomen();
		u.setName("С��");
		u.say();

		//Women w = new Women();
	}
}

//Ů��
//abstract��ʾ����һ����Ϊ������
abstract class Women{
	public Women(){
		System.out.println("women���췽��");
	}

	private String name;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public abstract void say();//���󷽷�(ֻ��������û��ʵ��)
	public abstract void method();
}

class Goddess extends Women{
	//ʵ�ָ���ĳ��󷽷�
	public void say(){
		System.out.println("ż��Ů������"+getName());
	}
	public void method(){
	}
}

class UglyWomen extends Women{
	//ʵ�ָ���ĳ��󷽷�
	public void say(){
		System.out.println("����󣬵��ҳ�Ů�޵У�����"+getName());
	}
	public void method(){
	}
}
