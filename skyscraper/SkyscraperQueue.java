package skyscraper;

class SkyscraperQueue {
    private int maxSize;
    int front;
    int rear;
    int arr[];

    public SkyscraperQueue(int sizeOfQueue) {
        this.maxSize = sizeOfQueue;
        front = -1;
        rear = -1;
        arr = new int[maxSize];
    }

    // ... rest of the code remains the same ...
    public boolean isFull() {
        if (rear == maxSize - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public void enqueue(int data) {
        if (!isFull()) {
            rear++;
            arr[rear] = data;
            if (front == -1)
                front = 0;
        } else {
            System.out.println("Queue overflow");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            // System.out.println("queue underflow");
        } else {
            // System.out.println(arr[front] + "deleted");
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else
            front++;
    }

    public void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}