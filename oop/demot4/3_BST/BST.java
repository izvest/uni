public class BST<T extends Comparable<T>>{
	
	private Node<T> root;
	//int levels;
	
	public BST(){
		root = null;
	}
	
	public void print(){
		iterPrint(root);
	}
	public void iterPrint(Node now){
		 if (now != null){
			iterPrint(now.left);
            System.out.println(now.getItem()+" ");
            iterPrint(now.right);
		}
	}
	
	public void find(int id){
		if(seek(id) != null){
			System.out.println("Item with given id not found!");
		}
		else{System.out.println("Found!");}
	}
	
	public Node seek(int id){ //BST:n lapikayntiin
		Node now = root;
		while(now != null){
			if(now.getId() == id){
				return null;
			}
			else if(now.getId() > id && now.left == null){
				return now;
			}
			else if(now.getId() > id && now.left.getId() < id ){
				return now;
			}
			else if(now.getId() > id){
				now = now.left;
			}
			else if(now.getId() < id && now.right == null){
				return now;
			}
			else if(now.getId() < id && now.right.getId() > id ){
				return now;
			}
			else{
				now = now.right;
			}
		}
		return null;
	}
	
	public void add(T item, int id){
		Node newNode = new Node(item, id);
		if(root == null){root = newNode;}
		else{
			Node tmp = seek(id);
			if(tmp != null){
				if(tmp.getId() > id){
					newNode.left = tmp.left;
					tmp.left = newNode;
				}else{
					newNode.right = tmp.right;
					tmp.right = newNode;
				}
				System.out.println("add: ok");
			}else{System.out.println("add: error");}
		}
	}
}

class Node<T>{
	private T item;
	private int id;
	//Node parent;
	Node left;
	Node right;
	
	public Node(T item, int id){
		this.item = item;
		this.id = id;
	}
	
	public T getItem(){
		return item;
	}
	
	public int getId(){
		return id;
	}
	
	/*public int getLevel(){
		int counter = 0;
		while(!parent.equals(root)){
			counter++;
		}
		return counter;
	}*/
}