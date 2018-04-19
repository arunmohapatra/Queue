package QueueImplementation;

public class ConsumerTask implements Runnable{

	ObjectContainer sharedObj = null;
	public ConsumerTask(ObjectContainer sharedObject){
		this.sharedObj = sharedObject;
	}
	
	public void run(){
		try{
			while(true){
				System.out.println("Element remove by thread : "
				+Thread.currentThread().getName()+"  "+this.sharedObj.get());
				//Thread.sleep(1000);
			}
		}
		catch(InterruptedException exp){
			
		}
		
	}
	
}
