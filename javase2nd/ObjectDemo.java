/**
	Object��
*/
public class ObjectDemo{
	public static void main(String[] args){
		Baboon bb = new Baboon("С��",7,'��');
		System.out.println(bb);
		System.out.println(bb.toString());

		Baboon b2 = new Baboon("С��",8,'ĸ');
		Baboon b3 = bb;
		
		System.out.println(bb==b2);
		System.out.println(bb==b3);

		Baboon b4 = new Baboon("С��",7,'��');
		//System.out.println(bb==b4);
		
		//���Ƚ����������ֵ�Ƿ����ʱ��ʹ��equals����
		System.out.println(bb.equals(b2));

		System.out.println("-----------------------------");
		method(b4);
		method("С��");


	}
	
	//��Object������Ϊ��������
	public static void method(Object obj){
		if(obj instanceof Baboon){
			Baboon b = (Baboon)obj;
			b.eat();
		}else{
			System.out.println("�ö�����Baboon���͵�ʵ��");
		}
	}
}

//������
class Baboon{
	private String name;
	private int age;
	private char sex;

	public Baboon(String name,int age,char sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public void eat(){
		System.out.println("����ϲ�����㽶!");
	}

	//��дObject���е�toString����
	public String toString(){
		return "name="+name+",age="+age+",sex="+sex;
	}
	
	//��дObject���е�equals�������Ƚ����������ֵ�Ƿ���ȣ�
	public boolean equals(Object obj){
		//����ڴ��ַ��ȣ���ôһ����ͬһ�����󣬾�����Ƚ��������������ֵ
		if(this==obj){
			return true;
		}
		//�ж�obj�Ƿ�ΪBaboon���͵�ʵ��
		if(obj instanceof Baboon){
			Baboon b = (Baboon)obj;//ǿ��ת��
			//�ж��������������ֵ�Ƿ����
			if(!this.name.equals(b.name)){
				return false;
			}
			else if(this.age!=b.age){
				return false;
			}
			else if(this.sex!=b.sex){
				return false;
			}
			return true;
		}else{
			return false;
		}
	}
}