import java.util.*;
public class queuearray{
	public static void main(String[] args){
		int front, rear, size;
		int capacity;
		int array[];

		
		//Method to add an item to the queue, it changes rear and size
	}

	public class Queue(int capacity){
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}

	//queue is full when size becomes equal to the capacity
	boolean isFull(Queue queue){
		return(queue.size==queue.capacity);
	}

	//Queue is empty when size is 0
	boolean isEmpty(Queue queue){
		return(queue.size==0);
	}

	void enqueue(int item){
	if (isFull(this)) {
		return;
	}
	
	this.rear=(this.rear+1)%this.capacity;
	this.array[this.rear]=item;
	this.size=this.size+1;
	System.out.println(item + "enqueued to queue");
	}
}