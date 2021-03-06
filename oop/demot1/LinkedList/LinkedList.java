class LinkedList{
	
	Node first; //the first node
	int size; //size of the list
	
	public LinkedList(int item){
		first = new Node(item);
		size = 0;
	}
	
	public void print(){ //print what the LinkedList contains
		Node now = first;
		while(now.next != null){
			System.out.print(now.item + " -> ");
			now = now.next;
		}
		System.out.println(now.item);
	}
	
	public void add(int item){ //add an item to the end of the list
    		Node newNode = new Node(item);
    		Node now = first;

    		while(now.next != null){
    			now = now.next;
    		}
    		now.next = newNode;
    		size++;
        	System.out.println(item + " added to the end of our LinkedList!");
   	}
	
	public void addToIndex(int item, int index){ //add an item to a certain index of the list
		if(checkIndex(index)){
			Node newNode = new Node(item);
			Node now = first;
    			for(int i = 0; i < index-1; i++){
    				now = now.next;
    			}
    			newNode.next = now.next;
    			now.next = newNode;
    			size++;
    			System.out.println("Success! " + item + " added at index " + index);
    		}
    	}
	
	public boolean deleteNodeWithData(int item){
		Node now = first;
		while(now.next != null){
			if(now.next.item == item){
				Node toBeKilled = now.next;
				now.next = now.next.next;
				toBeKilled = null;
				size--;
				System.out.println("Success! The first occurrence of a node with data " + item + " deleted.");
				return true;
			}
			now = now.next;
        }
		System.out.println("Error: No node found with given data!");
		return false;
	}

    public void deleteNodeAtIndex(int index){
		if(checkIndex(index)){
			Node now = first;
			for(int i = 0; i < index-1; i++){
				now = now.next;
			}
			Node toBeKilled = now.next;
			now.next = now.next.next;
			toBeKilled = null;
			size--;
			System.out.println("Success! Node at index " + index + " deleted.");
		}
	}
	
	public void findNodeAtIndex(int index){
		if(checkIndex(index)){
			Node now = first;
			for(int i = 0; i < index; i++){
				now = now.next;
			}
			System.out.println("Node at index contains: " + now.item);
		}
	}
	
	public boolean findNodeWithData(int item){
		Node now = first;
		int counter = 0;
		while(now.next != null){
			if(now.item == item){
				System.out.println("Found a node containing " + item + " at index " + counter);
				return true;
			}
			now = now.next;
			counter++;
		}
		System.out.println("Error: No node found with given data!");
		return false;
	}
	
	public boolean checkIndex(int index){
		if(index > size || index < 1){
    			System.out.println("Error: index out of bounds!");
    			return false;
    		}
		return true;
	}
}

class Node{
	int item;
	Node next;
	
	public Node(int item){
		this.item = item;
	}
}
