/**
	������д(Overiding Method)
*/
public class OveridingMethodDemo{
	public static void main(String[] args){
		HomeDog hd = new HomeDog("С��");
		hd.desc();
		Dog d = new Dog("С��");
		d.desc();
	}
}

//����
class Dog{
	protected String name;
	public Dog(String name){
		this.name = name;
	}

	//���ҽ���
	protected void desc(){
		System.out.println("dog:my name is "+name);
	}
}

//����
class HomeDog extends Dog{
	//public String name;//���Ե���д
	public HomeDog(String name){
		super(name);
	}
	//��д����ķ���
	public void desc(){
		System.out.println("����һֻ�����ҵ������ǣ�"+name);
	}
}