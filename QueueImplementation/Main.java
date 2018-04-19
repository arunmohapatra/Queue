package QueueImplementation;

public class Main {

	public static void main(String[] args) {
		
		ObjectContainer oc = new ObjectContainer(10);
		Thread pt1 = new Thread(new ProducerTask(oc,200),"pt1");
		Thread pt2 = new Thread(new ProducerTask(oc,300),"pt2");
		Thread pt3 = new Thread(new ProducerTask(oc,400),"pt3");
		Thread pt4 = new Thread(new ProducerTask(oc,500),"pt4");
		Thread pt5 = new Thread(new ProducerTask(oc,600),"pt5");
		
		Thread ct1 = new Thread(new ConsumerTask(oc),"ct1");
		Thread ct2 = new Thread(new ConsumerTask(oc),"ct2");
		Thread ct3 = new Thread(new ConsumerTask(oc),"ct3");
		Thread ct4 = new Thread(new ConsumerTask(oc),"ct4");
		Thread ct5 = new Thread(new ConsumerTask(oc),"ct5");
		
		pt1.start();
		ct1.start();
		pt3.start();
		ct2.start();
		ct3.start();
		pt2.start();
		pt4.start();
		ct5.start();
		ct4.start();
		pt5.start();
	}

}
