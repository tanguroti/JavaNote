/**
	Object类
*/
public class ObjectDemo{
	public static void main(String[] args){
		Baboon bb = new Baboon("小白",7,'公');
		System.out.println(bb);
		System.out.println(bb.toString());

		Baboon b2 = new Baboon("小黑",8,'母');
		Baboon b3 = bb;
		
		System.out.println(bb==b2);
		System.out.println(bb==b3);

		Baboon b4 = new Baboon("小白",7,'公');
		//System.out.println(bb==b4);
		
		//当比较两个对象的值是否相等时，使用equals方法
		System.out.println(bb.equals(b2));

		System.out.println("-----------------------------");
		method(b4);
		method("小白");


	}
	
	//以Object类型作为参数传递
	public static void method(Object obj){
		if(obj instanceof Baboon){
			Baboon b = (Baboon)obj;
			b.eat();
		}else{
			System.out.println("该对象不是Baboon类型的实例");
		}
	}
}

//狒狒类
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
		System.out.println("狒狒喜欢吃香蕉!");
	}

	//重写Object类中的toString方法
	public String toString(){
		return "name="+name+",age="+age+",sex="+sex;
	}
	
	//重写Object类中的equals方法（比较两个对象的值是否相等）
	public boolean equals(Object obj){
		//如果内存地址相等，那么一定是同一个对象，就无需比较两个对象的属性值
		if(this==obj){
			return true;
		}
		//判断obj是否为Baboon类型的实例
		if(obj instanceof Baboon){
			Baboon b = (Baboon)obj;//强制转换
			//判断两个对象的属性值是否相等
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