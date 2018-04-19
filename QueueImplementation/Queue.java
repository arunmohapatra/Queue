package QueueImplementation;


public class Queue<T> {

	private class Node<T>{
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
			this.next = null;
		}
	}
	
	int size;
	Node<T> head = null;
	Node<T> tail = null;
	
	public Queue(int size){
		this.size = size;
	}
	
	public boolean isEmpty(){
		if(head == null && tail == null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int count(){
		int noOfElements = 0;
		Node<T> tmp = head;
		while(tmp != null){
			noOfElements++;
			tmp = tmp.next;
		}
		return noOfElements;
	}
	
	public boolean isFull(){
		if(count() == size){
			return true;
		}
		return false;
	}
	
	public boolean add(T obj){
		return offer(obj);
	}
	
	public boolean offer(T obj){
		if(isFull()) return false;
		
		if(isEmpty()){ // if first node
			Node<T> newNode = new Node<>(obj);
			newNode.next = null;
			head = tail = newNode;
		}
		else{
			Node<T> newNode = new Node<>(obj);
			newNode.next = head;
			head = newNode;
		}
		return true;
	}
	
	public T poll(){
		if(isEmpty()) return null;
		
		if(head == tail){//if single node is there
			T tmp = head.data;
			head = tail = null;
			return tmp;
		}
		
		Node<T> tmp = head;
		while(tmp.next != tail){
			tmp = tmp.next;
		}
		tmp.next = null;
		T obj = tail.data;
		tail = tmp;
		return obj;
	}
	
	
	public T peek(){
		if(isEmpty()) return null;
		return tail.data;
	}
	
	public String toString(){
		if(head == null) return "Empty";
		Node<T> tmp = head;
		String str = "";
		while(tmp != null){
			str = str+tmp.data;
			tmp = tmp.next;
		}
		return str;
	}
}
