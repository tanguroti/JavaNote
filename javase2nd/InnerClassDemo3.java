/**
	�ڲ��ࣺ��̬�ڲ���
	һ����̬�ڲ����൱���ⲿ��
*/
public class InnerClassDemo3{
	public static void main(String[] args){
		Dog.ChildDog child = new Dog.ChildDog();
		child.talk();

		Dog.childTalk();

	}
}

//����
class Dog{
	private String name;
	public Dog(String name){
		this.name = name;
	}
	public void say(){
		System.out.println("����һֻ�������˽���"+name);
	}

	//��̬�ڲ���
	static class ChildDog{
		public void talk(){
			System.out.println("����һֻ����");
		}
	}
	
	public static void childTalk(){
		ChildDog c = new ChildDog();
		c.talk();
	}
	
}

