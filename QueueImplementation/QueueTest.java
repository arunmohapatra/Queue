package QueueImplementation;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<String> queue = new Queue<>(3);
		System.out.println(queue.offer("A"));
		System.out.println(queue.offer("B"));
		System.out.println(queue.offer("C"));
		System.out.println(queue.isFull());
		System.out.println(queue.toString());
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.toString());
		System.out.println(queue.isEmpty());
	}

}
