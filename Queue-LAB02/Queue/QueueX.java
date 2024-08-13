package Queue;

public class QueueX {

    private int front;
    private int rear;
    private int maxSize;
    private int numCount;
    private int[] QueueArray;

    public QueueX(int size){
        front = 0;
        rear = -1;
        maxSize = size;
        numCount = 0;
        QueueArray = new int[maxSize];
    }

    public boolean isFull(){
        return (numCount == maxSize);
    }

    public boolean isEmpty(){
        return (numCount == 0);
    }

    public void insert(int num){
        if(rear == maxSize-1 ){
            System.out.println("Queue is full");
        }
        else{
            QueueArray[++rear] = num;
            numCount++;
        }
    }

    public int remove(){
        if(numCount == 0){
            return -99;
        }
        else{
            numCount--;
           return QueueArray[front++];
        }
    }
    
}
