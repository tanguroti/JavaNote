/**
	�ڲ��ࣺ��Ա�ڲ���
*/
public class InnerClassDemo1{
	public static void main(String[] args){
		Dog d = new Dog("����");
		d.say();
		Dog.ChildDog child = null;//�����ڲ�������

		//�÷�ʽһ�㲻ʹ��
		child = d.new ChildDog();//�����ڲ����ʵ��
		child.talk();

		d.childTalk();

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
	//�ڲ���(��Ա�ڲ���)
	class ChildDog{
		public void talk(){
			System.out.println("����һֻ������������"+name);
		}
	}
	
	public void childTalk(){
		ChildDog child = new ChildDog();
		child.talk();
	}
}