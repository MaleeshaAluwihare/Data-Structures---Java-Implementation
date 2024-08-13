package Queue;

public class circular {
    
    private int maxSize;
    private int front;
    private int rear;
    private int numCount;
    private int[] QueueArray;

    public circular(int num){
        maxSize = num;
        front = 0;
        rear = -1;
        numCount = 0;
        QueueArray = new int[maxSize];
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
            QueueArray[rear] = num;
        }
    }

    public int remove(){
        if(numCount == 0){
            System.out.println("Queue is empty");
            return -99;
        }
        else{
            numCount--;
            int value = QueueArray[front];

            if(front == maxSize-1){
                front = 0;
            }
            else{
                front++;
            }
            return QueueArray[value];
        }
    }
}
