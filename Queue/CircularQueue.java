public class CircularQueue {
    
    private int front;
    private int rear;
    private int[] CircularQueue;
    private int maxSize;
    private int numCount;

    public CircularQueue(int max){

        front = 0;
        rear = -1;
        maxSize = max;
        CircularQueue = new int[maxSize];
        numCount = 0;
    }

    public void insert(int num){
        if(numCount == maxSize){
            System.out.println("Queue is full");
        }
        else{
            numCount++;
            if(rear == maxSize-1){
                rear = 0;
            }
            else{
                rear++;
            }
            CircularQueue[rear] = num;
        }
    }

    public int remove(){

        if(numCount == 0){
            return -99;
        }
        else{

            numCount--;
            int x = CircularQueue[front];

            if(front == maxSize-1){
                front = 0;
            }
            else{
                front++;
            }
            return x;
        }
    }

    public boolean isFull() {
        return (numCount == maxSize);
    }

    public boolean isEmpty() {
        return (numCount == 0);
    }

}
