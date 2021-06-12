/**
	����ģʽ��Proxy����Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ��ʡ�
*/
public class ProxyDemo{
	public static void main(String[] args){
		Person p = new Person("С��");
		//�����������
		Matchmaker m = new Matchmaker(p);

		m.miai();//����

	}
}

/**
	����ӿ�
*/
interface Subject{
	public void miai();
}

/**
	��������
*/
class Person implements Subject{
	private String name;
	public Person(String name){
		this.name = name;
	}
	public void miai(){
		System.out.println(name+"����������...");
	}
}

/**
	������
*/
class Matchmaker implements Subject{
	private Subject target;//Ҫ�����Ŀ�����

	public Matchmaker(Subject target){
		this.target = target;
	}
	//����֮ǰҪ��������
	private void before(){
		System.out.println("Ϊ������ƥ�������ɾ�");
	}
	//����֮��Ҫ��������
	private void after(){
		System.out.println("�������׽���.");
	}

	//���׷���
	public void miai(){
		before();
		//����ִ�����׷���
		target.miai();
		after();
	}
}