package main.java.Queue;

public class QueueUsingLinkedList {
	public static void main(String[] args) {
		QueueLL q = new QueueLL();
		q.enqueue(10);
		q.enqueue(20);
		q.dequeue();
		q.dequeue();
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);

		System.out.println("Dequeued item is " + q.dequeue().key);
	}
}

class LinkedList {
	int key;
	LinkedList next;

	// constructor to create a new linked list node
	public LinkedList(int key) {
		this.key = key;
		this.next = null;
	}
}

class QueueLL {
	LinkedList front, rear;

// Constructor
	public QueueLL() {
		this.front = this.rear = null;
	}

	// Adding element to a queue
	void enqueue(int key) {

		// Create a new LL node
		LinkedList temp = new LinkedList(key);

		// If queue is empty, then new node is front and rear both
		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}

		// Add the new node at the end of queue and change rear
		this.rear.next = temp;
		this.rear = temp;
	}

	// Method to remove an key from queue.
	LinkedList dequeue() {
		// If queue is empty, return NULL.
		if (this.front == null)
			return null;

		// Store previous front and move front one node ahead
		LinkedList temp = this.front;
		this.front = this.front.next;

		// If front becomes NULL, then change rear also as NULL
		if (this.front == null)
			this.rear = null;
		return temp;
	}
}