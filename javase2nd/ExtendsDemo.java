/**
	�̳еĻ�������
	��˽�еģ�public,default,protected
	�������η���public(����) private��˽�еģ� default��Ĭ�ϵģ� protected(������)
	ע�⣺���췽�����ܱ��̳�

	�����ʵ��������:
	����ʵ����ʱ���ȵ��ø���Ĺ��췽��
	���������û��Ĭ�ϵĹ��췽����������Ĺ��췽���б�����ʾ�ĵ��ø���Ĺ��췽��

*/
public class ExtendsDemo{
	public static void main(String[] args){
		HomeChicken hc = new HomeChicken();
		hc.desc();

		System.out.println("------------------");
		Pheasant p = new Pheasant("С��");
		p.desc();


	}
}
//����(���࣬����)
class Chicken{
	protected String name;
	public Chicken(String name){
		System.out.println("Chicken:"+name);
	}
	public void desc(){
		System.out.println("����һֻ��");
	}
}
//���ࣨ�Ҽ���
class HomeChicken extends Chicken{
	public HomeChicken(){
		super("С��");//super ��ʾ���������,���ø��๹�췽���������ǵ�һ��
		System.out.println("HomeChicken");
		//super();
	}
}

//���ࣨҰ����
class Pheasant extends Chicken{
	public Pheasant(String name){
		super(name);
		this.name = name;
		System.out.println("Pheasant");
	}
}