package dsalab1;
import java.util.Stack;

public class QueueUsingStack {
	    private Stack<Integer> stack1; // For enqueue operation
	    private Stack<Integer> stack2; // For dequeue operation

	    public QueueUsingStack() {
	        stack1 = new Stack<>();
	        stack2 = new Stack<>();
	    }

	    // Add an element to the queue
	    public void enqueue(int item) {
	        stack1.push(item);
	    }

	    // Remove an element from the queue
	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue element.");
	            return -1;
	        }

	        // If stack2 is empty, transfer elements from stack1 to stack2
	        if (stack2.isEmpty()) {
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }

	        return stack2.pop();
	    }

	    // Check if the queue is empty
	    public boolean isEmpty() {
	        return (stack1.isEmpty() && stack2.isEmpty());
	    }

	    // Get the front element of the queue without removing it
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. No front element.");
	            return -1;
	        }

	        // If stack2 is empty, transfer elements from stack1 to stack2
	        if (stack2.isEmpty()) {
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }

	        return stack2.peek();
	    }

	    // Print the elements of the queue
	    public void displayQueue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }

	        // If stack2 is empty, transfer elements from stack1 to stack2
	        if (stack2.isEmpty()) {
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }

	        System.out.print("Queue: ");
	        for (int i = stack2.size() - 1; i >= 0; i--) {
	            System.out.print(stack2.get(i) + " ");
	        }
	        System.out.println();
	    }

	    // Main method to test the QueueUsingStack class
	    public static void main(String[] args) {
	        QueueUsingStack queue = new QueueUsingStack();

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.displayQueue(); // Output: Queue: 10 20 30 40

	        System.out.println("Front element: " + queue.peek()); // Output: Front element: 10

	        queue.dequeue();
	        queue.displayQueue(); // Output: Queue: 20 30 40
           
	    }
	}

	
		

	


