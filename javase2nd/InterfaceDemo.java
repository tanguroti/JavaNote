/**
	�ӿڣ�
*/
public class InterfaceDemo{
	public static void main(String[] args){
		
	}
}

interface A
{
}
interface B
{
}
//��ʳ�ӿ�
interface IEat{
	public void eat();
}
//����һ���ӿ�
//�ӿڿ��Լ̳ж���ӿ�
//�ӿڲ��ܱ�ʵ����
interface Hit extends A,B{
	String NAME = "С��";//�ڽӿ��ж�������Զ��ǳ���
	//public static final������ʡ��,������ͨ������ȫ��д

	public abstract void cry();//���󷽷�public abstract����ʡ��,Ĭ�Ͼ���public
}

//Ů��
//һ�������ʵ�ֶ���ӿ�
class Goddess implements Hit,IEat{
	//ʵ�ֽӿڱ���ʵ�ֽӿ��е����з���
	public void cry(){
		System.out.println("��Ӵ�ҵ���ѽ������������");
	}
	public void eat(){
		System.out.println("һС��һС�ڵĳ�");
	}
}

//Ů����
class Girl implements Hit{
	public void cry(){
		//name = "С��";
		System.out.println("���ð����㲻֪���۰�");
	}
}

//������ʵ�ֽӿڿ��Բ�ʵ�ַ���
abstract class Person implements Hit{
	
}