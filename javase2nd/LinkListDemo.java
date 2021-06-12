/**
	�������ݽṹ
*/
public class LinkListDemo{
	public static void main(String[] args){
		NodeManager nm = new NodeManager();
		nm.addNode("�ڵ�1");
		nm.addNode("�ڵ�2");
		nm.addNode("�ڵ�3");
		nm.addNode("�ڵ�4");
		nm.addNode("�ڵ�5");
		nm.printNode();
		nm.delNode("�ڵ�3");
		nm.printNode();
	}
}

//����ڵ����
class NodeManager{
	private Node root;//���ڵ�
	//��ӽڵ�
	public void addNode(String name){
		//������ڵ�Ϊ�գ���ô��ӵľ��Ǹ��ڵ�
		if(root==null){
			root = new Node(name);
		}else{
			root.add(name);
		}
	}
	//ɾ���ڵ�
	public void delNode(String name){
		if(root!=null){
			if(root.name.equals(name)){
				root = root.next;
			}else{
				root.del(name);
			}
		}
	}
	//������нڵ�
	public void printNode(){
		if(root!=null){
			System.out.print(root.name);
			root.print();
			System.out.println();
		}
	}

	//����һ���ڵ��ڲ���
	class Node{
		private String name;//�ڵ�����
		private Node next;//��ʾ��һ���ڵ����
		public Node(String name){
			this.name = name;
		}
		//��ӽڵ�
		public void add(String name){
			if(this.next==null){
				this.next = new Node(name);
			}else{
				this.next.add(name);
			}
		}
		//ɾ���ڵ�
		public void del(String name){
			if(this.next!=null){
				if(this.next.name.equals(name)){
					this.next = this.next.next;
				}else{
					this.next.del(name);
				}
			}
		}
		//������нڵ�
		public void print(){
			if(this.next!=null){
				System.out.print("-->"+this.next.name);
				this.next.print();
			}
		}

	}
}