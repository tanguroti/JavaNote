/**
	�ݹ��㷨
	1��һ��Ҫ�г���
	2���ݹ�������࣬�п��ܻ����ջ�ڴ����
*/
public class RecursionDemo{
	public static void main(String[] args){
		int result = factorial(5);
		System.out.println("result="+result);
		int result2 = factorial2(5);
		System.out.println("result2="+result2);
	}
	
	//�ݹ��㷨�����ã�
	public static int factorial2(int num){
		if(num==1){
			return 1;
		}
		return num*factorial2(num-1);
	}
	//�׳�
	public static int factorial(int num){
		int sum = num;
		int i = num-1;

		do{
			sum *=i;
			i--;
		}while(i>1);
		return sum;

	}
}