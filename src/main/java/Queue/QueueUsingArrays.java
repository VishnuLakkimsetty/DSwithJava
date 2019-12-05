package main.java.Queue;

public class QueueUsingArrays {
	public static void main(String[] args) {
		QueueArr queue = new QueueArr(1000);

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		System.out.println(queue.dequeue() + " dequeued from queue\n");

		System.out.println("Front item is " + queue.front());

		System.out.println("Rear item is " + queue.rear());
	}
}

class QueueArr {
	int front, rear, queueSize;
	int capacityOfQueue;
	int[] arr;

	// Constructor
	public QueueArr(int capacity) {
		this.front = 0;
		this.queueSize = 0;
		this.rear = capacity - 1;
		this.capacityOfQueue = capacity;
		this.arr = new int[this.capacityOfQueue];
	}

	// Checking whether queue is full
	boolean isFull(QueueArr queue) {
		if (queue.capacityOfQueue == queue.queueSize)
			return true;
		else
			return false;
	}

	// Checking whether queue is empty
	boolean isEmpty(QueueArr queue) {
		if (queue.queueSize == 0)
			return true;
		else
			return false;
	}

	// Enqueuing queue
	// It changes rear and size
	void enqueue(int item) {
		if (isFull(this))
			return;
		this.rear = (this.rear + 1) % this.capacityOfQueue;
		this.arr[this.rear] = item;
		this.queueSize = this.queueSize + 1;
		System.out.println(item + " enqueued to queue");
	}

	// Method to remove an item from queue.
	// It changes front and size
	int dequeue() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		int item = this.arr[this.front];
		this.front = (this.front + 1) % this.capacityOfQueue;
		this.queueSize = this.queueSize - 1;
		return item;
	}

	// Method to get front of queue
	int front() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.arr[this.front];
	}

	// Method to get rear of queue
	int rear() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.arr[this.rear];
	}
}
