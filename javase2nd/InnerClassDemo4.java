/**
	�ڲ��ࣺ�����ڲ���
*/
public class InnerClassDemo4{
	public static void main(String[] args){
		//(1)�̳�ʽ�����ڲ��� ����ʱ����InnerClassDemo4$1.class�ļ�
		Dog dog = new Dog("����"){
			public void say(){
				System.out.println("����һֻĸ�������˽���"+name);
			}
		};
		dog.say();

		//(2)�ӿ�ʽ�����ڲ��� ����ʱ����InnerClassDemo4$2.class�ļ�
		Child child = new Child(){
			public void talk(){
				System.out.println("����һֻ����");
			}
		};
		child.talk();

		//(3)����ʽ�����ڲ��� ����ʱ����InnerClassDemo4$3.class�ļ�
		childTalk(new Child(){
			public void talk(){
				System.out.println("����һֻС����");
			}
		});

	}

	public static void childTalk(Child c){
		c.talk();
	}

}

//����
class Dog{
	String name;
	public Dog(String name){
		this.name = name;
	}
	public void say(){
		System.out.println("����һֻ�������˽���"+name);
	}
}

class WomenDog extends Dog{
	public WomenDog(String name){
		super(name);
	}
	public void say(){
		System.out.println("����һֻĸ�������˽���"+name);
	}
}

interface Child{
	public void talk();
}

