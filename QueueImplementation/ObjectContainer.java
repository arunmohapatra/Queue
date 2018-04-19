package QueueImplementation;

public class ObjectContainer {

	Queue<String> queue;
	
	public ObjectContainer(int size){
		queue = new Queue<>(5);
	}
	
	synchronized 
	public void put(String str) throws InterruptedException{
		
		while(queue.isFull()){
			System.out.println("Queuefull please wait..."+Thread.currentThread().getName());
			wait();
		}
		System.out.println("Element add by thread : "+Thread.currentThread().getName());
		queue.add(str);
		notifyAll();
	}
	
	synchronized 
	public String get() throws InterruptedException{
		
		while(queue.isEmpty()){
			System.out.println("Queueempty please wait..."+Thread.currentThread().getName());
			wait();
		}
		String str = queue.poll();
		notifyAll();
		//System.out.println("Element remove by thread : "+Thread.currentThread().getName());
		return str;
	}
}
