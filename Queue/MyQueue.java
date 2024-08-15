package Queue;

class MyQueue <T> {
    private Object[] arr;
    private int size;
    private int front;
    private int rear;

    MyQueue(int n) { // Constructor
        arr = new Object[n];
        this.size = n;
        this.front = -1;
        this.rear = -1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == size - 1;
    }

    // Add an element to the queue
    public void add(T data) {
        if (isFull()) {
            System.out.println("The Queue is full! You can't add anything!!");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        arr[++rear] = (T) data;
    }

    // Remove an element from the queue
    public T remove() {
        if (isEmpty()) {
            System.out.println("The Queue is already empty!");
            return null;
        }
        T removedElement = (T) arr[front];
        if (front == rear) { // Queue has only one element
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        return removedElement;
    }

    // Peek at the front element of the queue
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is already empty! You can't get any peek element.");
            return null;
        }
        return (T)arr[front];
    }

    // Display all elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("The Queue is empty!");
            return;
        }
        System.out.print("Queue is : -> ");
        System.out.print("[");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("]");
    }
}
