package QueueImplementation;

public class ProducerTask implements Runnable{

	ObjectContainer sharedObj = null;
	int counter;
	public ProducerTask(ObjectContainer sharedObject,int counter){
		this.sharedObj = sharedObject;
		this.counter = counter;
	}
	
	public void run(){
		try{
			while(true){
				this.sharedObj.put(this.counter+"");
				this.counter++;
				//Thread.sleep(1000);
			}
		}
		catch(InterruptedException exp){
			
		}
		
	}
	
}
