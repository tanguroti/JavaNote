/**
	������ģʽ�� Adapter ������һ����Ľӿ�ת���ɿͻ�ϣ��������һ���ӿڡ�
	������ģʽʹ��ԭ�����ڽӿڲ����ݶ�����һ��������Щ�����һ������

*/
class AdapterDemo{
	public static void main(String[] args){
		PowerA powerA = new PowerAImpl();
		start(powerA);


		PowerB powerB = new PowerBImpl();
		PowerAAdapter pa = new PowerAAdapter(powerB);
		start(pa);
	}

	//��ʼ����
	public static void start(PowerA powerA){
		//..........
		powerA.insert();
		//...........
	}
	/**
	public static void start(PowerB powerB){
		//...........
		powerB.connect();
		//............
	}
	*/
}

//��������
class PowerAAdapter implements PowerA{
	private PowerB powerB;//Ҫ��������Ľӿ�
	
	public PowerAAdapter(PowerB powerB){
		this.powerB = powerB;
	}
	
	public void insert(){
		powerB.connect();
	}

}

/**
	��ԴA�ӿ�
*/
interface PowerA{
	public void insert();
}

class PowerAImpl implements PowerA{
	public void insert(){
		System.out.println("��ԴA�ӿڲ��룬��ʼ����");
	}
}

/**
	��ԴB�ӿ�
*/
interface PowerB{
	public void connect();
}

class PowerBImpl implements PowerB{
	public void connect(){
		System.out.println("��ԴB�ӿ������ӣ���ʼ����");
	}
}
