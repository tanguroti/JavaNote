/**
	jdk1.5�����ԣ���װ��
	һ����װ��ĸ�ֵ��ʽ
	��1��ʹ��new�ؼ��ִ�������
	��2��ֱ�Ӹ���װ�ำֵ
*/
public class WrapperClassDemo{
	public static void main(String[] args){
		Long x1 = new Long(100);//������װ�����
		
		long x2 = 100L;
		Long x3 = 100L;//ֱ�Ӹ���װ�ำֵ���Զ�װ�䣩

		long x4 = x3;//���Զ����䣩
		long x5 = x3.longValue();//�ֶ�����

		//�ַ���ת�����������ͱ���Ϊ�����͵��ַ���
		String s1 = "12345";
		int x6 = Integer.parseInt(s1);//��һ���ַ���ת��Ϊint������������
		
		System.out.println(x6);

		Integer x7 = Integer.valueOf(s1);
		System.out.println("x7="+x7);

		System.out.println("------------------------------");
		Integer x8 = new Integer(10);
		Integer x9 = new Integer(10);
		
		//Integerֱ�Ӹ�ֵʱ����ֵΪ1���ֽ��ڵ���ʱ����ʹ��ͬһ������
		//Byte Short Long Integer ��Ԫ���ģʽ
		Integer x10 = 127;
		Integer x11 = 127;
		System.out.println(x8==x9);
		System.out.println(x8==x10);
		System.out.println(x10==x11);
	}
}