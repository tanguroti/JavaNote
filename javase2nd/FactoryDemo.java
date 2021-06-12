/**
	�������ģʽ:
	�򵥹���ģʽ����һ���������������������һ�ֲ�Ʒ���ʵ����
	�򵥹���ģʽ�ǹ���ģʽ���������ʵ�õ�ģʽ��

*/
public class FactoryDemo{
	public static void main(String[] args){
		/*
		ClothDoll cd = new ClothDoll();
		System.out.println(cd.getInfo());
		BarbieDoll bd = new BarbieDoll();
		System.out.println(bd.getInfo());
		*/
		Doll clothDoll = DollFactory.getInstance("cloth");
		if(clothDoll!=null){
			System.out.println(clothDoll.getInfo());
		}
		Doll barbieDoll = DollFactory.getInstance("barbie");
		if(barbieDoll!=null){
			System.out.println(barbieDoll.getInfo());
		}
	}
}


//������
class DollFactory{
	//ֻ�����������
	public static Doll getInstance(String name){
		//��������������ͬ�Ķ���
		if("cloth".equals(name)){
			return new ClothDoll();
		}else if("barbie".equals(name)){
			return new BarbieDoll();
		}
		return null;
	}
}

//����
interface Doll{
	public String getInfo();
}

//������
class ClothDoll implements Doll{
	public String getInfo(){
		return "���ǲ����ޣ������ࡣ";
	}
}
//��������
class BarbieDoll implements Doll{
	public String getInfo(){
		return "���ǰ������ޣ������Ĳ���˼�顣";
	}
}