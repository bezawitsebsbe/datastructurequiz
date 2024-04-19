package dsalab1;

public class CircularQueue {
	private int maxSize; // Maximum size of the queue
		    private int[] queueArray; // Array to store the elements
		    private int front; // Index of the front element
		    private int rear; // Index of the rear element
		    private int currentSize; // Current size of the queue

		    // Constructor
		    public CircularQueue(int capacity) {
		        maxSize = capacity;
		        queueArray = new int[maxSize];
		        front = 0;
		        rear = -1;
		        currentSize = 0;
		    }

		    // Check if the queue is empty
		    public boolean isEmpty() {
		        return (currentSize == 0);
		    }

		    // Check if the queue is full
		    public boolean isFull() {
		        return (currentSize == maxSize);
		    }

		    // Add an element to the rear of the queue
		    public void enqueue(int item) {
		        if (isFull()) {
		            System.out.println("Queue is full. Cannot enqueue element.");
		        } else {
		            rear = (rear + 1) % maxSize;
		            queueArray[rear] = item;
		            currentSize++;
		        }
		    }

		    // Remove an element from the front of the queue
		    public int dequeue() {
		        if (isEmpty()) {
		            System.out.println("Queue is empty. Cannot dequeue element.");
		            return -1;
		        } else {
		            int dequeuedItem = queueArray[front];
		            front = (front + 1) % maxSize;
		            currentSize--;
		            return dequeuedItem;
		        }
		    }

		    // Get the front element of the queue without removing it
		    public int peek() {
		        if (isEmpty()) {
		            System.out.println("Queue is empty. No front element.");
		            return -1;
		        }
		        return queueArray[front];
		    }

		    // Print the elements of the queue
		    public void displayQueue() {
		        if (isEmpty()) {
		            System.out.println("Queue is empty.");
		            return;
		        }
		        System.out.print("Queue: ");
		        int count = 0;
		        int index = front;
		        while (count < currentSize) {
		            System.out.print(queueArray[index] + " ");
		            index = (index + 1) % maxSize;
		            count++;
		        }
		        System.out.println();
		    }

		    // Main method to test the CircularQueue class
		    public static void main(String[] args) {
		        CircularQueue queue = new CircularQueue(5);

		        queue.enqueue(10);
		        queue.enqueue(20);
		        queue.enqueue(30);
		        queue.enqueue(40);
		        queue.displayQueue(); 

		        System.out.println("Front element: " + queue.peek()); 

		        queue.dequeue();
		        queue.displayQueue(); 

		        queue.enqueue(50);
		        queue.enqueue(60);
		        queue.displayQueue(); 

		        queue.enqueue(70); 
		    }
		}

	


