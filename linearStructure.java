package dsalab1;

public class linearStructure {
public static class LinearQueue {
	    private int maxSize; 
	    private int front; 
	    private int rear; 
	    private int[] queueArray;
	public LinearQueue(int capacity) {
	        maxSize = capacity;
	        front = -1; 
	        rear = -1; 
	        queueArray = new int[maxSize];
	    }
	 public boolean isEmpty() {
	        return (front == -1);
	    }
	 public boolean isFull() {
	        return (rear == maxSize - 1);
	    }
	 public void enqueue(int item) {
	        if (isFull()) {
	            System.out.println("Queue is full. Cannot enqueue element.");
	        } else {
	            if (front == -1) {
	                front = 0;
	            }
	            rear++;
	            queueArray[rear] = item;
	        }
	    }
	 public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue element.");
	            return -1;
	        } else {
	            int dequeuedItem = queueArray[front];
	            if (front == rear) {
	                front = rear = -1;
	            } else {
	                front++;
	            }
	            return dequeuedItem;
	        }
	    }
	 public int peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. No front element.");
	            return -1;
	        }
	        return queueArray[front];
	    }
	 public void displayQueue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }
	        System.out.print("Queue: ");
	        for (int i = front; i <= rear; i++) {
	            System.out.print(queueArray[i] + " ");
	        }
	        System.out.println();
	    }
	 public static void main(String[] args) {
	        LinearQueue queue = new LinearQueue(5);

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.displayQueue(); // Output: Queue: 10 20 30 40

	        System.out.println("Front element: " + queue.peek()); // Output: Front element: 10

	        queue.dequeue();
	        queue.displayQueue(); // Output: Queue: 20 30 40

	        queue.enqueue(50);
	        queue.enqueue(60);
	        queue.displayQueue(); // Output: Queue: 20 30 40 50 60

	        queue.enqueue(70); // Output: Queue is full. Cannot enqueue element.
	    }
	}
}


