/**
	�ڲ��ࣺ�����ڲ���
*/
public class InnerClassDemo2{
	public static void main(String[] args){
		Dog d = new Dog("����");
		d.childTalk("СС��");

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
	public Child child;
	//�ڷ�����������һ���ڲ���
	public void childTalk(final String childName){
		final int x = 10;
		class ChildDog implements Child{
			public void talk(){
				System.out.println("����һֻ��������������"+name);
				System.out.println("x="+x);
				System.out.println("�ҵ�������"+childName);
			}
		}
		child = new ChildDog();
		child.talk();
	}

	
}
interface Child{
	public void talk();
}

